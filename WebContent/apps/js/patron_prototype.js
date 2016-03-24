$(function() {

	/***** Inicio Patron Prototype Ej1 *****/

	var $prototypeEj = $('#prototypeEj');

	// Bloque prototipo con formato JSON
	var vehiclePrototype = {
		// Inicializador
		init: function (carModel) {
			this.model = carModel;
		},
		// Getter
		getModel: function () {
			$prototypeEj
				.append('<tr><td>The model of the vehicle is ... ' + this.model + '</td></tr>');
		}
	};

	function vehicle(model) {
		function F() {};
		// Se carga como prototipo el del bloque.
		F.prototype = vehiclePrototype;
		var f = new F();
		// Inicializador cargado en el prototipo.
		f.init(model);
		return f;
	}

	// Se invoca a funcion prototipica.
	vehicle('Ford Escort').getModel();

	/***** Fin Patron Prototype Ej1 *****/

});
