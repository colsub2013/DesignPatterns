package patterns.behavioural.visitor;

/**
 *	1. Interfaz Visitor con la declaracion de metodos
 *	visitor para cada una de las clases concreta. 
 *	Contienen como argumento una referencia a la clase concreta. 
 */
public interface VisitorIF {
	public void visitorConcreteElementA(ConcreteElementA parm);
	public void visitorConcreteElementB(ConcreteElementB parm);
}
