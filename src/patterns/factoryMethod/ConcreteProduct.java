package patterns.factoryMethod;

/**
 *	Clase concreta que representa al objeto que se creara 
 */
public class ConcreteProduct implements ProductIF {
	@Override
	public void action() {
		System.out.println("ConcreteProduct.action() called.");
	}
}
