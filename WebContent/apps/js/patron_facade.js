$(function() {

	/***** Inicio Patron Facade *****/

	// Ejecucion del facade.
	var $facade = $('#facade');

	var module_facade = (function() {
		// Bloque de codigo en formato JSON
		var _private = {
			i: 5,
			get: function() {
				$facade.append('<tr><td>current value: ' + this.i + '</td></tr>');
			},
			set: function(val) {
				this.i = val;
			},
			run: function() {
				$facade.append('<tr><td>running</td></tr>');
			},
			jump: function() {
				$facade.append('<tr><td>jumping</td></tr>');
			}
		};
		return {
			facade: function(args) {
				_private.set(args.val);
				_private.get();
				if (args.run) {
					_private.run();	
				}
			}
		}
	} ());

	// Ejecucion.
	module_facade.facade({run: true, val: 10});
	
	/***** Fin Patron Facade *****/

});