package patterns.behavioural.iterator;

/**
 * 	COMPORTAMIENTO - Objetivo:
 *
 *	Provee modo de acceso a elementos de un objeto agregado secuencialmente
 *	sin exponer su implementacion
 *
 *	Soporta variaciones en el recorrido de una coleccion
 *	
 *	Simplifica interfaz para la coleccion	
 *
 * *********************************************************************
 *	Usar en casos de:
 *
 *	Acceso a un objeto de coleccion sin tener que exponer su representacion interna
 *
 *	Necesitan soportarse multiples recorridos de objetos en la coleccion
 *
 *	Necesita una interfaz en la coleccion para atravesar estructuras diferentes	
 *
 * *********************************************************************
 * 	Forma de armarlo:
 * 
 *	1. Interfaz iterador que declara metodos iterador como si tiene 
 *  un elemento siguiente y al objeto siguiente propiamente dicho. 
 *  
 *	2. Interfaz coleccion que contiene declaraciones de 
 *	metodo propios como iterador y elementos de la coleccion   
 *
 *  3. Clase iterador concreto que contiene una referencia con la lista a procesar 
 *  y un indice de elemento. El constructor contiene como argumento una referencia 
 *  a la interfaz coleccion que popula la lista y pone el indice a 0. Tambien implementa
 *	el metodos de la interfaz iterador, uno para devolver el siguiente elemento y otro 
 *  para evaluar si hay un objeto siguiente 
 * 
 *	4. Clase coleccion concreta que implementa la interfaz coleccion y contiene una propiedad 
 *  que es una lista vacia, un constructor que toma un array de objetos y los almacena en una lista, 
 *  la implementacion del iterador que devuelve una instancia del iterador concreto tomando una coleccion
 *  y otoro metodo de elementos que devuelve una lista inmodificable  
 *
 *	5. En el main:
 *	   - Se crea un array de Strings y se lo popula
 *	   - Se crea objeto con constructor de coleccion concreta y referencia a interfaz coleccion
 *	   - Se crea iterador en base al objeto anterior
 *	   - Se itera e imprime cada objeto de la lista
 *	
 * *********************************************************************
 */
public class IteratorPattern {

	public static void main(String[] args) {
		
		String[] books = new String[3];
		books[0] = "PowerBuilder Developers Guide, 1994";
		books[1] = "Informix Developers Guide, 1994";
		books[2] = "Informix Universal Data Option, 1996";
		
		// Array de Strings en una coleccion
		CollectionIF collection = new ConcreteCollection(books);

		// Iterador para la coleccion
		IteratorIF iterator = collection.iterator();
		
		// Itera e imprime cada objeto de la lista
		int i = 0;
		while (iterator.hasNext()) {
			System.out.println((++i) + " " + iterator.next());
		}
	}
}
