package patterns.behavioural.visitor;

/**
 *	4. Clases concretas de elemento que implementan la interfaz elemento. 
 *  Contienen la implementacion de un metodo de la interfaz elemento llamando al metodo visitor
 *  y un metodo con la implementacion de la logica de operacion 
 */
public class ConcreteElementB implements ElementIF {

	@Override
	public void accept(VisitorIF parm) {
		parm.visitorConcreteElementB(this);
	}
	
	public void operationB() {
		System.out.println("ConcreteElementB.operationB() called.");
	}

}
