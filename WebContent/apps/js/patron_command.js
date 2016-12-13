$(function() {
	/***** Inicio Patron Command *****/

	// Parent.
	var $command = $('#command');

	// Logica
	function add(x, y) {
		return x + y;
	}

	// Logica
	function sub(x, y) {
		return x - y;
	}

	// Constructor Command
	var Command = function(execute, value) {
		this.execute = execute;
		this.value = value;
	}

	// Invocacion del constructor
	var AddCommand = function(value) {
		return new Command(add, value);
	};

	// Invocacion del constructor
	var SubCommand = function(value) {
		return new Command(sub, value);
	};

	// Funcion main del calculador.
	var Calculator = function() {
		var current = 0;
		var commands = [];

		function action(command) {
			var name = command.execute.toString().substr(9, 3);
			return name.charAt(0).toUpperCase() + name.slice(1);
		}

		return {
			execute: function(command) {
				current = command.execute(current, command.value);
				commands.push(command);
			},
			getCurrentValue: function() {
				return current;
			}
		}
	}

	var calculator = new Calculator();

	// Ejecucion
	var arg1 = 100;
	var arg2 = 24;

	// Se emiten commandos
	calculator.execute(new AddCommand(arg1));
	calculator.execute(new SubCommand(arg2));

	$command
		.append('<tr><td>Actual: 0</td></tr>')
		.append('<tr><td>1er argumento (+): ' + arg1 + '</td></tr>')
		.append('<tr><td>2do argumento (-): ' + arg2 + '</td></tr>')
		.append('<tr><td>Resultado: ' + calculator.getCurrentValue() + '</td></tr>');

	/***** Fin Patron Command *****/
});