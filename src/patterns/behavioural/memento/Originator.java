package patterns.behavioural.memento;

/**
 *	2. Clase originador que contiene las propiedades que seran
 *	almacenadas por medio de la clase memento. Las creaciones y 
 *	getters de memento para esas propiedades son en conjunto en tanto que 
 *	los setters son propios de cada propiedad
 */
public class Originator {
	
	private boolean state;
	private String name;
	private String other;
	
	// Ahorra datos criticos
	public Memento createMemento() {
		return new Memento(state, name);
	}
	
	// Recobra datos criticos del memento
	public void recoverFromMemento(Memento memento) {
		this.state = memento.isState();
		this.name = memento.getName();
	}
	
	public void setState(boolean state) {
		this.state = state;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Originator.toString() state = " 
			+ state + ", name = " + name;
	}
}
