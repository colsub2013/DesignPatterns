
$(function() {
	/***** Inicio Patron Constructor *****/
	// Se crea constructor:
	function Car(model, year, miles) {
		this.model = model;
		this.year = year;
		this.miles = miles;
		this.toString = function () {
			return this.model + " has done "  + this.miles + " miles";
		};
	}

	// Se instancia constructor
	var $constructor = $('#constructor');
	$constructor
		.append('<tr><td>' + new Car("Honda Civic", 2009, 20000).toString() + '</td></tr>')
		.append('<tr><td>' + new Car("Ford Mondeo", 2010, 5000).toString() + '</td></tr>');
	/***** Fin Patron Constructor *****/

	/***** Inicio Patron Constructor con método prototype *****/
	// En el paso anterior el método toString() del constructor tiene que redefinirse
	// cada vez que se instancia el constructor. Para que esto no suceda se puede
	// usar prototype para que el método sea propio del objeto:
	function CarProt(model, year, miles) {
		this.model = model;
		this.year = year;
		this.miles = miles;
	}

	// Metodo sera parte del objeto.
	CarProt.prototype.toString = function() {
		return this.model + " has done "  + this.miles + " miles";
	}

	var $constructorProt = $('#constructorProt');
	$constructorProt
		.append('<tr><td>' + new Car("Honda Civic", 2009, 20000).toString() + '</td></tr>')
		.append('<tr><td>' + new Car("Ford Mondeo", 2010, 5000).toString() + '</td></tr>');


	/***** Fin Patron Constructor con método prototype *****/

});