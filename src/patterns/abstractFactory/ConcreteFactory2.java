package patterns.abstractFactory;

/**
 *	Implementa la interfaz nexo con el factory y sus métodos de creacion devuelven 
 *	una instancia de la interfaz nexo con clase concreta 
 *	(con operador new sobre la clase Concreta)
 */
public class ConcreteFactory2 implements AbstractFactoryIF {

	@Override
	public AbstractProductAIF createProductA() {
		return new ProductA2();
	}

}
