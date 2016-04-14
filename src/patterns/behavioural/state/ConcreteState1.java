package patterns.behavioural.state;

/**
 *	Clase concreta que implementa la interfaz
 *	de estado. 
 */
public class ConcreteState1 implements StateIF {

	@Override
	public void handle() {
		System.out.println("ConcreteState1.handle() called."); 
	}
	
}
