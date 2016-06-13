package patterns.behavioural.command;

/**
 *	5. Clase invocador la cual contiene un metodo para almacenar commandos tomando 
 *  como argumento una referencia al comando abstracto y contiene un metodo 
 *  invocador que invoca al metodo de ejecuci�n con la referencia a ese comando abstracto 
 */
public class Invoker {
	
	private CommandAbstract command;
	
	public void storeCommand(CommandAbstract command) {
		this.command = command;
	}
	
	public void invoke() {
		command.execute();
	}
}
