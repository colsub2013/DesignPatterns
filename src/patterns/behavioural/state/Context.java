package patterns.behavioural.state;

/**
 * 	Clase contexto que crea una referencia a estado y contiene un metodo 
 * 	para invocar el metodo de esta referencia. Ademas tiene otro metodo para
 * 	cambiar de estado concreto.
 */
public class Context {
	
	// Estado inicial.
	private StateIF state = new ConcreteState1();
	
	// Petición de operacion
	public void request() {
		state.handle();
	}
	
	// Cambio de estado
	public void changeState() {
		if (state instanceof ConcreteState1) {
			state = new ConcreteState2();
		} else {
			state = new ConcreteState1();
		}
	}
	
}
