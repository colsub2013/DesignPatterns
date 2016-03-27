package patterns.structural.bridge;

/**
 * 	ESTRUCTURAL - Objetivo:
 * 	
 * 	Desacoplar la abstraccion funcional de la implementacion tal que
 *  las 2 puedan cambiarse y variar independientemente
 *  
 *  Habilita separacion de implementacion de la interfaz
 *  
 *  Permite esconder detalles de implementacion del cliente
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Se quiere evitar un binding permanente entre la abstraccion funcional
 *  y su implementacion
 *  
 *  Ambas abstraccion funcional e implementacion necesitan extenderse
 *  con subclases
 *  
 *  Los cambios en la implementacion no deberian impactar al cliente
 * 
 * *********************************************************************
 * 	Forma de armarlo:
 * 	
 * 	Se arma implementador que es una interfaz con la declaracion de metodo/s
 * 	de la clase concreta
 *  (ImplementorIF)
 * 	
 *  Se crea clase concreta que implementa la interfaz implementador con la
 *  implementacion de algun/os metodo/s
 *  (ConcreteImplementorA)
 *  
 *  Se crea interfaz de abstraccion que contiene metodo/s que encapsularan
 *  a metodo/s de la clase concreta
 *  (AbstractionIF)
 *  
 *  Se crea clase de abstraccion que implementa a la interfaz de abstraccion
 *  e implementa a metodo/s que encapsulan a metodo/s de la clase concreta
 *  por medio de la instanciacion de la clase concreta por una variable de instancia 
 *  con referencia a interfaz implementador
 *  (RefinedAbstractionA)  
 *  
 *  En el main, se instancia interfaz de abstraccion con una referencia a la
 *  interfaz de abstraccion y de alli se llama al metodo encapsulador
 *	
 * *********************************************************************
 */
public class BridgePattern {

	public static void main(String[] args) {
		AbstractionIF cimplA = new RefinedAbstractionA();
		System.out.println("Calling action() on RefinedAbstractionA");
		cimplA.action();
	}

}