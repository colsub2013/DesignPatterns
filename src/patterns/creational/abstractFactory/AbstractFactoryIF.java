package patterns.creational.abstractFactory;

/**
 *	Contiene métodos de creacion de factories que seran implementados 
 *  por la clase concreta. Dichos metodos retornaran una instancia de la interfaz
 *	que actua como nexo de las clases que representan objetos a crear. 
 */
public interface AbstractFactoryIF {
	public AbstractProductAIF createProductA();
}
