package patterns.behavioural.visitor;

/**
 *	3. Interfaz con un metodo para ser implementado por la clase concreta.
 *	Tiene como argumento una referencia a la interfaz Visitor. 
 */
public interface ElementIF {
	public void accept(VisitorIF parm);
}
