package patterns.behavioural.visitor;

/**
 *	2. Clase Visitor concreta que implementa la interfaz visitor
 *	y contiene la implementacion de los metodos con una 
 *	invocacion a una operacion de la clase concreta correspondiente. 
 */
public class ConcreteVisitor implements VisitorIF {

	@Override
	public void visitorConcreteElementA(ConcreteElementA parm) {
		parm.operationA();
	}

	@Override
	public void visitorConcreteElementB(ConcreteElementB parm) {
		parm.operationB();		
	}
	
}
