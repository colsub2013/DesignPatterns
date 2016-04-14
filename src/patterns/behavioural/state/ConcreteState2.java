package patterns.behavioural.state;

/**
 *	Clase concreta que implementa la interfaz
 *	de estado. 
 */
public class ConcreteState2 implements StateIF {

	@Override
	public void handle() {
		System.out.println("ConcreteState2.handle() called.");
	}
	
}
