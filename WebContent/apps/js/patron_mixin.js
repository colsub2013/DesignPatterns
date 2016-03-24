$(function() {

	var $mixin = $('#mixin');

	// Car
	var Car = function(settings) {
		this.model = settings.model || 'no model provided';
		this.colour = settings.colour || 'no colour provided';
	}

	// Mixin
	var Mixin = function() {};
	Mixin.prototype = {
		driveForward: function() {
			$mixin
				.append('<tr><td>drive forward</td></tr>');
		},
		driveBackward: function() {
			$mixin
			    .append('<tr><td>drive backward</td></tr>');
		}
	};

	// Aumenta la clase existente con un metodo desde otro
	function augment(receivingClass, givingClass) {
		// Solo provee ciertos metodos
		if (arguments[2]) {
			for (var i=2, len=arguments.length; i<len; i++) {
				receivingClass.prototype[arguments[i]] = givingClass.prototype[arguments[i]];
			}
		} else {
			if (!receivingClass.prototype[methodName]) {
				receivingClass.prototype[methodName] = givingClass.prototype[methodName];
			}
		}
	}

	// Aumenta Car, tiene metodos 'driveForward' y 'driveBackward'
	augment(Car, Mixin, 'driveForward', 'driveBackward');

	// Crea un Car nuevo
	var vehicle = new Car({model: 'Ford Escort', colour: 'blue'});

	// Invocacion al mixing
	vehicle.driveForward();
	vehicle.driveBackward();
});