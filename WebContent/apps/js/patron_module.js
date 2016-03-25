
$(function() {
	/***** Inicio Patron Module *****/
	var basketModule = (function() {
		// Privado
		var basket = [];
		function doSomethingPrivate() {
			console.log('something private');
		}

		function doSomethingElsePrivate() {
			console.log('something else private');
		}

		// Publico
		return {
			addItem: function(values) {
				basket.push(values);
			},
			getItemCount: function(values) {
				return basket.length;
			},
			// Exposicion publica de metodo privado
			doSomething: doSomethingPrivate(),
			getTotal: function () {
				// Invocacion metodo publico
				var q = this.getItemCount(),
				p = 0;
				while (q--) {
					p += basket[q].price;
				}
				return p;
			}
		}
	}) ();

	// basketModule tiene propiedades y metodos
	// Argumentos con notacion JSON.
	basketModule.addItem({
		item: 'bread',
		price: 0.5
	});

	basketModule.addItem({
		item: 'butter',
		price: 0.3
	});

	var $module = $('#module');
	$module
		.append('<tr><td>Item count: ' + basketModule.getItemCount() + '</td></tr>')
		.append('<tr><td>Total: ' + basketModule.getTotal() + '</td></tr>')

	/***** Fin Patron Module *****/

	/***** Inicio Patron Module Template *****/
	
	var someModule = (function() {
		// Atributos privados
		var privateVar = 5;

		// Metodos privados
		var privateMethod = function() {
			return 'Private Test';
		};
		return {
			// Atributos publicos (JSON)
			publicVar: 10,

			// Metodos publicos
			publicMethod: 
			function () {
				return ' Followed By Public Test ';
			},

			// Acceso a los miembros privados
			getData:
			function () {
				return privateMethod() + this.publicMethod() + privateVar;
			}
		}
	}) ();  // Origina que se ejecute y retorne funcion anonima.

	var $moduleTemplate = $('#moduleTemplate');
	$moduleTemplate
		.append('<tr><td>Data: ' + someModule.getData() + '</td></tr>');

	/***** Fin Patron Module Template *****/

});