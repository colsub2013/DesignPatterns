package patterns.creational.prototype;

/**
 *	Clase concreta que contiene los metodos para 
 *  obtener el clon y realizar una invocacion del objeto a clonar. 
 */
public class ConcretePrototype implements PrototypeIF {

	public ConcretePrototype() {
		System.out.println("ConcretePrototype constructed.");
	}

	@Override
	public PrototypeIF getClone() {
		return new ConcretePrototype();
	}

	@Override
	public void action() {
		System.out.println("ConcretePrototype.action() called");
	}

}
