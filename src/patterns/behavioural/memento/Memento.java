package patterns.behavioural.memento;

/**
 *	1. Clase memento plantilla con 2 propiedades al estilo POJO
 *	con constructor con argumentos para almacenar estado 
 */
public class Memento {
	
	private final boolean state;
	private final String name;
	
	public Memento(boolean state, String name) {
		super();
		this.state = state;
		this.name = name;
	}

	public boolean isState() {
		return state;
	}

	public String getName() {
		return name;
	}
	
}
