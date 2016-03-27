package patterns.creational.factoryMethod;

/**
 *	Interfaz con metodo abstracto para 
 *  creacion del factory para el objeto a crear
 *  el cual devuelve una referencia tipo interfaz 
 */
public interface CreatorIF {
	public abstract ProductIF factoryMethod();
}
