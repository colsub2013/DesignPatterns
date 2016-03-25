package patterns.builder;

/**
 * Por medio de esta clase se crean los builders necesarios. Esta clase implementa 
 * la interfaz que contiene metodos para construir y obtener un builder. 
 * La visibilidad de los productos concretos es a traves de una referencia 
 * de la interfaz correspondiente.
 */
public class ConcreteBuilder implements BuilderIF {

	ProductIF product;	
	
	@Override
	public void buildProduct() {
		product = new ConcreteProduct();
	}

	@Override
	public ProductIF getProduct() {
		return this.product;
	}

}
