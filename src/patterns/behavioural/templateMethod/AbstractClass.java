package patterns.behavioural.templateMethod;


/**
 *	Clase abstracta que contiene la declaracion de un par de metodos de utilidad 
 *  y la implementacion de un metodo que contiene la invocacion de esos metodos 
 */
public abstract class AbstractClass {
	
	public void templateMethod() {
		System.out.println("AbstractClass.templateMethod() called.");
		primitiveOperation1();
		primitiveOperationN();
	}
	public abstract void primitiveOperation1();
	public abstract void primitiveOperationN();
	
}
