package patterns.behavioural.visitor;

/**
 * 	COMPORTAMIENTO - Objetivo:
 *	
 *	- Representa una operacion para ser realizada sobre elementos de una estructura de objeto
 *	
 *	- Adiciona una operacion nueva sin cambiar las clases de los elementos en que esta opera
 *	
 *	- Simplifica agregar operaciones nuevas
 *	
 *	- Reune operaciones relacionadas y separa las no relacionadas 	
 * 	
 * *********************************************************************
 *	Usar en casos de:
 *
 *	- Una estructura de objeto contiene varios objetos con diferentes interfaces y se necesita
 *	  realizar operaciones sobre estos objetos en un modo que dependan de sus clases concretas	 
 *
 *	- Varias operaciones distintas y no relacionadas necesitan ser realizadas sobre objetos
 *	  en una estructura y se necesita evitar saturacion de clases con estas operaciones
 *	
 *	- Las clases que definen la estructura cambian poco pero se necesitan definir operaciones
 *	  nuevas que se realizan sobre la estructura
 *	
 * *********************************************************************
 * 	Forma de armarlo:
 *  
 *	1. Interfaz Visitor con la declaracion de metodos visitor para cada una 
 *  de las clases concreta. Contienen como argumento una referencia a la clase concreta. 
 * 
 * 	2. Clase Visitor concreta que implementa la interfaz visitor y contiene la implementacion 
 *  de los metodos con una invocacion a una operacion de la clase concreta correspondiente. 
 *  
 *	3. Interfaz elemento con un metodo para ser implementado por la clase concreta.
 *	Tiene como argumento una referencia a la interfaz Visitor. 
 *
 *	4. Clases concretas de elemento que implementan la interfaz elemento. 
 *  Contienen la implementacion de un metodo de la interfaz elemento llamando al metodo visitor
 *  y un metodo con la implementacion de la logica de operacion
 *    	
 *	5. Estructura de objeto con una lista de interfaces de elemento que contiene un constructor 
 *  con un listado de referencias de elemento de interfaz y un metodo para visitar los elementos 
 *	el que crea un visitor concreto si no existe e itera el listado ejecutando su metodo de 
 *	aceptacion de cada uno de ellos. 
 *	
 *	6. En el main:
 *		
 *	- Se crea un listado de elementos de interfaz y se lo popula con elementos de cada una de 
 *	  las clases concretas
 *	
 *  - Se crea estructura de objeto por constructor pasando el listado de elementos
 *  
 *  - Se visitan los elementos de la estructura de objeto. Eso llama a las operaciones logica a invocar	 	
 *
 * *********************************************************************
 */
public class VisitorPattern {
	public static void main(String[] args) {
		// Se construyen 2 elementos.
		ElementIF[] elements = new ElementIF[2];
		elements[0] = new ConcreteElementA();
		elements[1] = new ConcreteElementB();
		
		// Se construye estructura de objeto.
		ObjectStructure objectStructure = new ObjectStructure(elements);
		
		// Visita elementos en la estructura de objeto
		objectStructure.visitElements();
	}
}