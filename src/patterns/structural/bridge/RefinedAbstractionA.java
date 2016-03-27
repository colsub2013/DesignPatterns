package patterns.structural.bridge;

/**
 *	Clase que implementa la interfaz de abstraccion la cual contiene 
 *  la declaracion del metodo de la clase concreta que sera sometida 
 *  por el patron. Esta clase utiliza una instancia de la clase 
 *  concreta con referencia a la interfaz implementador la que se
 *  utiliza para invocar el metodo de la clase concreta.   
 *   
 */
public class RefinedAbstractionA implements AbstractionIF {
	
	ImplementorIF implementor = new ConcreteImplementorA();
	
	public RefinedAbstractionA() {
		System.out.println("RefinedAbstractionA called.");
	}

	@Override
	public void action() {
		implementor.actionImplemented();
	}

}
