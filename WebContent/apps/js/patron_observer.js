$(function() {
	/***** Inicio Patron Observer *****/

	var $observer = $('#observer');

	var grid = {
		addEntry: function(data) {
			if (data !== 'undefined') {
				$observer.append('<tr><td>Entry: ' + data.title + ' Changenet / %' + data.changenet + '/' + data.percentage + ' % added</td></tr>');
			}
		},
		updateCounter: function(data) {
			$observer.append('<tr><td>' + data.timestamp + '</td></tr>');
		},
	};

	// Funcion para actualizar datos.
	var gridUpdate = function(data) {
		grid.addEntry(data);
		grid.updateCounter(data);
	}

	// Suscriptor de los datos dados por el publicador.
	var gridSubscription = $("#observer").on('dataUpdated', gridUpdate);

	// Publicador de datos.
	$observer.trigger('dataUpdated', {
		title: "Microsoft shares",
		changenet: 4,
		percentage: 33,
		timestamp: '17:34:12'
	});

	// Publicador de datos.
	$observer.trigger('dataUpdated', {
		title: "Dell shares",
		changenet: 10,
		percentage: 20,
		timestamp: '17:35:16'
	});

	/***** Fin Patron Observer *****/
});