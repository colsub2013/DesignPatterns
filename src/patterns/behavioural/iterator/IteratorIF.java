package patterns.behavioural.iterator;

/**
 *	1. Interfaz iterador que declara metodos iterador como si tiene 
 *  un elemento siguiente y al objeto siguiente propiamente dicho. 
 */
public interface IteratorIF {
	public boolean hasNext();
	public Object next();
}
