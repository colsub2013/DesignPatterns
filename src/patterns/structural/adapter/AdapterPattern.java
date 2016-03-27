package patterns.structural.adapter;

/**
 * ESTRUCTURAL - Objetivo:
 * 
 * Convierte la interfaz de una clase en una interfaz que requiere un cliente.
 * 
 * Permite interactuar a 2 o mas objetos previamente incompatibles
 * 
 * Reutilizacion de funcionalidades existentes
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Un objeto necesita una clase existente con una interfaz incompatible
 *
 *	Se quiere una clase reutilizable que coopere con las clases que 
 *  no tienen necesariamente interfaces compatibles
 * 
 * 	Se necesitan usar varias subclases existentes pero no quiere adaptar 
 *  sus interfaces haciendo subclases de cada una
 * *********************************************************************
 * 	Forma de armarlo:
 *	
 *	Se arma el adaptee con un metodo a adaptar
 *	(Adaptee)
 *
 *	Se arma una interfaz que contendra la declaracion de un metodo
 *	que encapsulara al adaptee
 *	(TargetIF)
 *
 *	Adaptacion por clase: Se crea clase que implementa interfaz 
 *  Target y extiende la clase Adaptee. Por medio de subclassing
 *  se adapta el metodo del adaptee en el nuevo metodo declarado en Target
 *  (AdapterByClass)
 *  
 *  Adaptacion por Objeto: Se crea clase que implementa interfaz
 *  Target. Esta tiene una variable private de tipo Adaptee la cual 
 *  se utiliza para adaptar el metodo del adaptee por instanciacion 
 *  (AdapterByObject)
 *  
 *	En el main, Se crean 2 targets por instanciacion, por clase y por objeto, 
 *  con referencia a la interfaz target, obtenida la referencia se invoca al 
 *  metodo adaptado para que muestre el contenido del metodo a adaptar
 *  (AdapterPattern)
 *	
 * 
 *	
 * *********************************************************************
 */
public class AdapterPattern {

	public static void main(String[] args) {
		// Se crean targets
		TargetIF target1 = new AdapterByClass();
		TargetIF target2 = new AdapterByObject();
		
		// Llamada a peticiones target
		System.out.println("Calling targets");
		System.out.println("target1.newRequest() -> " + target1.newRequest());
		System.out.println("target2.newRequest() -> " + target2.newRequest());
	}

}
