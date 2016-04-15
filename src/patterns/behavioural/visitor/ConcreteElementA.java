package patterns.behavioural.visitor;

/**
 *	4. Clases concretas de elemento que implementan la interfaz elemento. 
 *  Contienen la implementacion de un metodo de la interfaz elemento llamando al visitor
 *  y un metodo con la implementacion de la logica de operacion
*/
public class ConcreteElementA implements ElementIF {

	@Override
	public void accept(VisitorIF parm) {
		parm.visitorConcreteElementA(this);
	}
	
	public void operationA() {
		System.out.println("ConcreteElementA operationA() called.");
	}

}
