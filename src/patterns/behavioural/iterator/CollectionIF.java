package patterns.behavioural.iterator;

import java.util.Collection;

/**
 *	2. Interfaz coleccion que contiene declaraciones de 
 *	metodo propios como iterador y elementos de la coleccion   
 */
public interface CollectionIF {
	public IteratorIF iterator();
	public Collection<Object> elements();
}
