
$(function() {

	/***** Inicio Patron singleton *****/

	var SingletonTester = (function() {

		// Funcion con opciones de configuracion para el singleton
		// con acceso privado.
		// Funciona como un constructor con argumentos unico para el objeto.
		function Singleton(options) {
			// si options no está definido queda objeto vacio.
			options = options || {};
			console.log(options);

			// Parametros acceso privado.
			this.name = 'SingletonTester';
			this.pointX = options.pointX || 6;
			this.pointY = options.pointY || 10;
		}

		// Holder de instancia.
		var instance;

		// Emulacion de variables y metodos static (formato JSON).
		// La instancia tiene acceso publico para el singleton.
		var _static = {

			name: 'SingletonTester',

			// Se obtiene una instancia.
			// Retorna instancia Singleton de un objeto Singleton.
			getInstance: function(options) {
				if (instance === undefined) {
					instance = new Singleton(options);
				}
				return instance;
			}
		};
		return _static;
	}) ();

	// Representacion JSON
	var singletonTest = SingletonTester.getInstance({
		pointX: 5
	});

	// Representacion JSON
	var singletonTest2 = SingletonTester.getInstance({
		name:'test', pointX: 2
	});

	var $singleton = $('#singleton');
	$singleton
		.append('<tr><td>' + singletonTest.pointX + '</td></tr>');
	$singleton
		.append('<tr><td>' + singletonTest2.pointX + '</td></tr>');

	/***** Fin Patron singleton *****/

});