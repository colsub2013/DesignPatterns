package patterns.structural.composite;

/**
 * 	Clase abstracta (no instanciable) que contiene la declaracion
 * 	de metodos de ejecucion
 */
public abstract class Component {
	
	public abstract void display();
	
	public void add(Component c) {}
	
	public void remove(Component c) {}
	
	public Component getChild(int index) { return null; }
	
	public String getName() { return null; }
	
}
