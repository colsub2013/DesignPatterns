$(function() {

	// Parent
	var $factory = $('#factory');

	// Constructor
	function Car(color, turbo) {
		this.color = color;
		this.turbo = turbo;
	}

	// Constructor
	function Truck(enclosedCargo, length, monster, cylinders) {
		this.enclosedCargo = enclosedCargo;
		this.length = length;
		this.monster = monster;
		this.cylinders = cylinders;
	}

	// Factory generico en que se define metodo generico
	function VehicleFactory() {}
	VehicleFactory.prototype.getVehicle = function(options) {
		return new this.vehicleClass(options);
	};
	
	// Se vincula factory generico a Tipo Car
	VehicleFactory.prototype.vehicleClass = Car;

	// Se instancia factory que al memento es de tipo Car.
	var carFactory = new VehicleFactory();
	// Se usa metodo del factory generico.
	var car = carFactory.getVehicle({ color: "yellow", turbo: true });
	
	$factory
		.append('<tr><td>car instanceof Car: ' + (car instanceof Car) + '</td></tr>');

	// Aprox. #1 - Modifica instancia VehicleFactory para usar clase Truck
	carFactory.vehicleClass = Truck;	
	var mover = carFactory.getVehicle({
		enclosedCargo: true, length: 26
	});
	
	$factory
		.append('<tr><td>mover instanceof Truck: ' + (mover instanceof Truck) + '</td></tr>');

	// Aprox. #2 - Subclase VehicleFactory para crear una clase Factory
	// que construye Trucks
	
	// Factory de tipo Truck
	function TruckFactory() {}

	// Se instancia factory que al memento es de tipo Truck.
	TruckFactory.prototype = new VehicleFactory();
	TruckFactory.prototype.vehicleClass = Truck;

	// Se instancia factory que al memento es de tipo Truck.
	var truckFactory = new TruckFactory();
	var bigfoot = truckFactory.getVehicle({
		monster: true, cylinders: 12
	});

	$factory
		.append('<tr><td>bigfoot instanceof Truck: ' + (bigfoot instanceof Truck) + '</td></tr>');

});