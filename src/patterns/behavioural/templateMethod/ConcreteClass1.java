package patterns.behavioural.templateMethod;

/**
 *	Clase concreta que extiende la clase abstracta
 *	e implementa los metodos de utilidad definidas en esta 
 */
public class ConcreteClass1 extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("ConcreteClass1.primitiveOperation1() called.");
	}

	@Override
	public void primitiveOperationN() {
		System.out.println("ConcreteClass1.primitiveOperationN() called.");
	}
	
}
