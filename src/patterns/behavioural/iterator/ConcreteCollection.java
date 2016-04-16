package patterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *	4. Clase coleccion concreta que implementa la interfaz coleccion
 *	y contiene una propiedad que es una lista vacia, un constructor
 *	que toma un array de objetos y los almacena en una lista, la implementacion
 *	del iterador que devuelve una instancia del iterador concreto tomando una coleccion
 *  y otoro metodo de elementos que devuelve una lista inmodificable  
 * 
 */
public class ConcreteCollection implements CollectionIF {
	
	private final List<Object> list = new ArrayList<Object>();
	
	public ConcreteCollection(Object[] objectList) {
		for (int i = 0; i < objectList.length; i++) {
			list.add(objectList[i]);
		}
	}

	@Override
	public IteratorIF iterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public Collection<Object> elements() {
		return Collections.unmodifiableList(list);
	}

	
}
