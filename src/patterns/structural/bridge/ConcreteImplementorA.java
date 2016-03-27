package patterns.structural.bridge;

/**
 *	Clase concreta que implementa al implementador que contiene un metodo 
 *  a ser encapsulado por este patron estructural 
 */
public class ConcreteImplementorA implements ImplementorIF {
	
	public ConcreteImplementorA() {
		System.out.println("ConcreteImplementorA constructed");
	}

	@Override
	public void actionImplemented() {
		System.out.println("ConcreteImplementorA.actionImplemented() called.");
	}
	
}
