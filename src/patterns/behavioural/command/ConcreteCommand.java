package patterns.behavioural.command;

/**
 *	4. Clase concreta que extiende la clase abstracta con la implementacion 
 *  del metodo de ejecucion el cual invoca al metodo de utilidad por medio 
 *  de una referencia a la interfaz receptor
 */
public class ConcreteCommand extends CommandAbstract {
	
	private final ReceiverIF receiverIF; 
	
	public ConcreteCommand(ReceiverIF receiverIF) {
		this.receiverIF = receiverIF;
	}

	@Override
	public void execute() {
		receiverIF.action();
	}

}
