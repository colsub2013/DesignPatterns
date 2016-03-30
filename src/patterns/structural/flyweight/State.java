package patterns.structural.flyweight;

/**
 *	Clase que representa un estado, que puede ser 
 *	un objeto con estado true y otro con false. 
 */
public class State {
	
	private final boolean state;

	public State(boolean state) {
		this.state = state;
	}

	public boolean isState() {
		return state;
	}
	
}
