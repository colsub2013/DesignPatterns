package patterns.creational.builder;

/**
 * Clase que representa el objeto concreto el cual implementa interfaz nexo 
 * que se usara para instanciacion del Builder concreto.
 */
public class ConcreteProduct implements ProductIF {
	
	public ConcreteProduct() {
		System.out.println("ConcreteProduct constructed.");
	}

	@Override
	public void action() {
		System.out.println("ConcreteProduct.action() called.");
	}

}
