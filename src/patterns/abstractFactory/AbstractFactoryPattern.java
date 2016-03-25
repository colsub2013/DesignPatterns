package patterns.abstractFactory;

/**
 * Objetivo:
 * 
 * Provee una interfaz a usar para crear familias de objetos relacionados
 * (dependientes) sin especificar sus clases concretas
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	El sistema necesita ser independiente de como sus objetos son creados,
 *	compuestos y representados
 *	
 *	Se quiere proveer una libreria de objetos que no muestra implementaciones
 *	y solo revela interfaces  
 * 
 * *********************************************************************
 * Forma de armarlo:
 *	
 * Se crea/n interfaz/ces que tendran los metodos del objeto a crear 
 * (AbstractProductAIF y AbstractProductBIF independientes uno del otro)
 *	
 * Se crean clases que representaran los objetos a crearse por el factory
 * y que implementan la interfaz del punto anterior, los cuales contendran
 * la implementacion de sus metodos correspondientes
 * (ProductoA1 y ProductoA2 implementan AbstractProductAIF)		 
 * (ProductoB1 y ProductoB2 implementan AbstractProductBIF)
 * 
 * Se crea/n interfaz/ces que serviran de nexo para la creacion de factories
 * las cuales contienen declaraciones de metodos que crean objetos y retornan
 * una instancia de la interfaz implementada por las clases que representan
 * objetos a crearse (se relacionan las interfaces nexo del factory con las 
 * interfaces nexo del objeto a crear) 
 * (AbstractFactoryIF)
 * 
 * Se crea/n clase/s que implementan la interfaz nexo del factory del punto
 * anterior las cuales implementaras sus metodos retornando una instancia 
 * de los objetos a crear a traves de la interfaz nexo con dichos objetos
 * (ConcreteFactory1 implementa AbstractFactoryIF)  
 * (ConcreteFactory2 implementa AbstractFactoryIF)  
 * 
 * Se crea clase de ejecucion:
 * 
 * 1. Se instancian Factories del nivel superior 
 * AbstractFactoryIF factoryOne = new ConcreteFactory1();
 * AbstractFactoryIF factoryTwo = new ConcreteFactory2();
 * 
 * 2. Se crean objetos a traves de la instanciacion anterior (nivel inferior) 
 * AbstractProductAIF prod1 = factoryOne.createProductA();
 * AbstractProductBIF prod2 = factoryOne.createProductB();
 * AbstractProductAIF prod3 = factoryTwo.createProductA();
 * AbstractProductBIF prod4 = factoryTwo.createProductB();
 * 
 * 3. Se ejecutan metodos de los objetos factories creados:
 * prod1.actionA();
 * prod2.actionB();
 * prod3.actionA();
 * prod4.actionB();
 * 
 * (Las instanciaciones son siempre a nivel interfaz)
 * *********************************************************************
 */
public class AbstractFactoryPattern {
	public static void main(String[] args) {
		
		AbstractFactoryIF factoryOne = new ConcreteFactory1();
		AbstractFactoryIF factoryTwo = new ConcreteFactory2();
		
		// Se crean objetos via Abstract Factory
		AbstractProductAIF prod1 = factoryOne.createProductA();
		AbstractProductBIF prod2 = factoryOne.createProductB();
		AbstractProductAIF prod3 = factoryTwo.createProductA();
		AbstractProductBIF prod4 = factoryTwo.createProductB();
		
		// Ejecucion de los métodos de los objetos creados
		prod1.actionA();
		prod2.actionB();
		prod3.actionA();
		prod4.actionB();
		
	}
}
