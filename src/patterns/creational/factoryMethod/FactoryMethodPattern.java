package patterns.creational.factoryMethod;

/**
 * ************************************************************************
 * CREATIONAL - Define una interfaz para crear un objeto pero deja decidir 
 * a la subclase que clase instanciar. El cliente necesita conocer solo 
 * sobre la interfaz abstracta publicada. 
 * 
 * ************************************************************************
 * Usar en casos de:
 * 
 * La clase no es capaz de anticipar la clase de objetos que esta necesita crear
 * 
 * Las clases asignan responsabilidad a una de varias sub-clases helper, y uno
 * quiere localizar el conocimiento de que subclase helper es delegada	
 *
 * ************************************************************************
 * Forma de armarlo: 
 * 
 * Crear una interfaz con los metodos del objeto concreto a crear
 * (ProductIF)
 * 
 * Crear una clase que implemente la interfaz del punto anterior y así sus metodos
 * del objeto a crear
 * (ConcreteProduct)
 * 
 * Interfaz que contiene un metodo abstract para crear el factory
 * (CreatorIF)
 *  
 * Contiene implementacion de la interfaz anterior y devuelve instancia del producto 
 * a crear por medio de una referencia 
 * (ConcreteCreator)
 * 
 * ************************************************************************
 */
public class FactoryMethodPattern {

	public static void main(String[] args) {
		
		// Crea creator por instanciacion, que usa factoryMethod
		// Se usa para crear el factory
		CreatorIF creator = new ConcreteCreator();
		
		// Crea el producto via factory method.
		ProductIF product = creator.factoryMethod();
		
		// Llama metodo del producto.
		product.action();
	}
	
}
