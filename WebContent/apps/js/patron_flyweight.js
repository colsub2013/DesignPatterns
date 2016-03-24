$(function() {

	/***** Inicio Patron Flyweight *****/
	/* https://forum.sublimetext.com/t/is-there-a-way-to-comment-out-multiple-lines/2442/2 */

	// Informacion relevante (intrinseca) de Computer en objeto flyweight
	function Flyweight(make, model, processor) {
		this.make = make;
		this.model = model;
		this.processor = processor;
	};


	// Este factory es un singleto que crea un objeto nuevo si no existe
	var FlyWeightFactory = (function() {
		var flyweights = {};
		return {
			get: function(make, model, processor) { // Se crea obj si no existe
				if (!flyweights[make + model]) {
					flyweights[make + model] =
						new Flyweight(make, model, processor);
				}
				return flyweights[make + model];
			},
			getCount: function() {
				var count = 0;
				for (var f in flyweights) count++;
				return count;
			}
		}
	})();

	// Almacena objetos Computer
	function ComputerCollection() {
		var computers = {};
		var count = 0;

		return {
			add: function(make, model, processor, memory, tag) {
				computers[tag] =
					new Computer(make, model, processor, memory, tag);
				count++;
			},

			get: function(tag) {
				return computers[tag];
			},

			getCount: function() {
				return count;
			}
		};
	}

	// Objeto Computer el cual tiene datos extrinsecos como propiedades
	// y toma los datos relevantes (intrinsecos) del Factory
	var Computer = function(make, model, processor, memory, tag) {
		this.flyweight = FlyWeightFactory.get(make, model, processor);
		this.memory = memory;
		this.tag = tag;
		this.getMake = function() {
			return this.flyweight.make;
		};
		this.getFullData = function() {
			return 'make: ' + this.flyweight.make 
				+ '/ model: ' + this.flyweight.model 
				+ '/ processor: ' + this.flyweight.processor
				+ '/ memory: ' + this.memory
				+ '/ tag: ' + this.tag;
		}
	}

	// Se crea y popula coleccion
    var computers = new ComputerCollection();
    
    computers.add("Dell", "Studio XPS", "Intel", "5G", "Y755P");
    computers.add("Dell", "Studio XPS", "Intel", "6G", "X997T");
    computers.add("Dell", "Studio XPS", "Intel", "2G", "U8U80");
    computers.add("Dell", "Studio XPS", "Intel", "2G", "NT777");
    computers.add("Dell", "Studio XPS", "Intel", "2G", "0J88A");
    computers.add("HP", "Envy", "Intel", "4G", "CNU883701");
    computers.add("HP", "Envy", "Intel", "2G", "CNU883701");

    // Se buscar colección por tag
	var $flyweight = $('#flyweight');
    var tag1 = "U8U80";
	$flyweight
		.append('<tr><td>ComputerCollection: (' + tag1 + ') -> ' + computers.get(tag1).getFullData() + '</td></tr>');
    var tag2 = "CNU883701";
	$flyweight
		.append('<tr><td>ComputerCollection: (' + tag2 + ') -> ' + computers.get(tag2).getFullData() + '</td></tr>');

	/***** Fin Patron Flyweight *****/

});