package patterns.behavioural.iterator;

/**
 *	3. Clase iterador concreto que contiene una referencia
 *	con la lista a procesar y un indice de elemento. El constructor
 *	contiene como argumento una referencia a la interfaz coleccion
 *	que popula la lista y pone el indice a 0. Tambien implementa
 *	el metodos de la interfaz iterador, uno para devolver el siguiente 
 *  elemento y otro para evaluar si hay un objeto siguiente 
 * 
 */
import java.util.List;

public class ConcreteIterator implements IteratorIF {

	private final List list;
	private int index;

	public ConcreteIterator(CollectionIF parm) {
		list = (List) parm.elements();
		index = 0;
	}

	@Override
	public Object next() throws RuntimeException {
		try {
		return list.get(index++);
		} catch(IndexOutOfBoundsException ioobe) {
			throw new RuntimeException("No such Element");
		}
	}

	@Override
	public boolean hasNext() {
		return (index < list.size()) ? true : false;
	}
	
}
