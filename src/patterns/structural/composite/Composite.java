package patterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *	Clase que redefine metodos de la clase abstracta componente por subclassing. 
 *  Dichos metodos son de utilidad e involucran cierta logica. 
 */
public class Composite extends Component {

	String name = null;
	List children = new ArrayList<>();
	
	public Composite(String name) {
		this.name = name;
		System.out.println(name.trim() + " constructed.");
	}

	@Override
	public void add(Component c) {
		System.out.println(
			"Adding " + c.getName().trim() + " to " + this.getName().trim());
		children.add(c);
	}
	
	@Override
	public void remove(Component c) {
		System.out.println(
			"Removing " + c.getName().trim() + " from " + this.getName().trim());
		children.remove(c);
	}
	
	@Override
	public Component getChild(int index) { 
		Component child = (Component) this.children.get(index);
		return child;
	}
	
	@Override
	public String getName() { return this.name; }
	
	
	@Override
	public void display() {
		Iterator it = children.iterator();
		System.out.println(
			this.getName() + (it.hasNext()?" with the following ":" that is bare "));
		while (it.hasNext()) {
			((Component) it.next()).display();;
		}
	}
	
}
