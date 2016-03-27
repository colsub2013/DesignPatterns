package patterns.creational.prototype;

/**
 *	Contiene los metodos del objeto a crear. 
 */
public interface PrototypeIF {
	public PrototypeIF getClone();
	public void action();
}
