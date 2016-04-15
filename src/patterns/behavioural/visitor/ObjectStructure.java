package patterns.behavioural.visitor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *	5. Estructura de objeto con una lista de interfaces de elemento
 *	que contiene un constructor con un listado de referencias de 
 *	elemento de interfaz y un metodo para visitar los elementos 
 *	el que crea un visitor concreto si no existe e itera el listado
 *	ejecutando su metodo de aceptacion de cada uno de ellos. 
 */
public class ObjectStructure {
	private final List<ElementIF> objectStruct;
	private VisitorIF visitor;

	public ObjectStructure(ElementIF[] parm) {
		objectStruct = Arrays.asList(parm);
	}

	public void visitElements() {
		if (visitor == null) {
			visitor = new ConcreteVisitor();
		}
		for (Iterator<ElementIF> i = objectStruct.iterator(); i.hasNext();) {
			i.next().accept(visitor);
		}
	}
}