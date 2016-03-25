package patterns.factoryMethod;

/**
 *	Clase concreta que contiene metodo para 
 *  crear el factory correspondiente del objeto
 *  devolviendo una referencia a la interfaz asociada 
 *  al objeto a crear. 
 */
public class ConcreteCreator implements CreatorIF {
	@Override
	public ProductIF factoryMethod() {
		return new ConcreteProduct();
	}
}
