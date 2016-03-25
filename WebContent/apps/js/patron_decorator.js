$(function() {
	/***** Inicio Patron Decorator *****/

	var $decorator = $('#decorator');

	// Objeto base o superclase a decorar
	function vehicle(vehicleType) {
		// Propiedades y valores por defecto
		this.vehicleType = vehicleType || 'car';
		this.model = 'default';
		this.license = '00000-000';
	}

	// Instancia para vehicle basico
	var testInstance = new vehicle('car');
	$decorator
		.append(
			'<tr><td>testInstance -> ' 
				+ testInstance.vehicleType 
				+ '/' + testInstance.model 
				+ '/' + testInstance.license 
				+ '/' + testInstance.color 
				+ '</td></tr>');

	// Se crea instancia nueva de vehicle, para decorarse
	var truck = new vehicle('truck');

	// Decorado de la instancia nueva con un metodo
	truck.setModel = function(modelName) {
		this.model = modelName;
	}

	truck.setColor = function(color) {
		this.color = color;
	}

	// Setters y asignacion de valor funciona OK
	truck.setModel('CAT');
	truck.setColor('blue');

	$decorator
		.append(
			'<tr><td>truck -> ' 
			+ truck.vehicleType 
			+ '/' + truck.model 
			+ '/' + truck.license 
			+ '/' + truck.color 
			+ '</td></tr>');

	// Demuestra que 'vehicle' aun esta inalterado
	var secondInstance = new vehicle('car');
	$decorator
		.append(
			'<tr><td>secondInstance -> ' 
			+ secondInstance.vehicleType 
			+ '/' + secondInstance.model 
			+ '/' + secondInstance.license 
			+ '/' + secondInstance.color 
			+ '</td></tr>');

	/***** Fin Patron Decorator *****/

	/***** Inicio Patron Decorator objetos multiples *****/

	var $decoratorObjMult = $('#decoratorObjMult');

	// Lo que se va a decorar
	function MacBook() {
		this.cost = function() { return 997; }
		this.screenSize = function() { return 13.3; }
	}

	// Decorator 1
	function Memory(macbook) {
		var v = macbook.cost();
		macbook.cost = function() {
			return v + 75;
		}
	}

	// Decorator 2
	function Engraving(macbook) {
		var v = macbook.cost();
		macbook.cost = function() {
			return v + 200;
		}
	}

	// Decorator 3
	function Insurance(macbook) {
		var v = macbook.cost();
		macbook.cost = function() {
			return v + 250;
		}
	}

	var mb = new MacBook();
	Memory(mb);
	Engraving(mb);
	Insurance(mb);

	$decoratorObjMult
		.append('<tr><td>mb.cost() -> ' + mb.cost() + '</td></tr>')
		.append('<tr><td>mb.screenSize() -> ' + mb.screenSize() + '</td></tr>');

	/***** Fin Patron Decorator objetos multiples *****/

	/***** Patron Decorator con jQuery *****/
	
	var $decoratorjQuery = $('#decoratorjQuery');

	var decoratorApp = decoratorApp || {};

	// Definir objetos a usar
	decoratorApp = {
		defaults: {
			validate: false,
			limit: 5,
			name: "foo",
			welcome: function() {
				console.log('welcome!');
			}
		},
		options: {
			validate: true,
			name: "bar",
			helloWorld: function() {
				console.log('hello!');
			}
		},
		settings: {},
		printObj: function(obj) {
			var arr = [];
			$.each(obj, function(key, val) {
				var next = key + ": ";
				next += $.isPlainObject(val) ? printObj(val) : val;
				arr.push(next);
			});
			return "{ " + arr.join(", ") + " }";
		}
	}

	/** Fusiona defaults y options, sin modificar defaults */
	decoratorApp.settings = $.extend({},
		decoratorApp.defaults, decoratorApp.options);
	
	$decoratorjQuery
		.append('<tr><td>' + decoratorApp.printObj(decoratorApp.settings) + '</td></tr>');

	/***** Fin Patron Decorator con jQuery *****/

});