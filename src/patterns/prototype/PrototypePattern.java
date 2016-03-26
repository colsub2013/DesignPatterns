package patterns.prototype;

/**
 * CREACIONAL - Objetivo:
 * 
 * Especifica las clases de objetos que necesitan ser creados usando 
 * una instancia prototipo, y ser capaces de crear objetos nuevos
 * copiando este prototipo.
 * 
 * Permite agregar o quitar objetos en tiempo de ejecucion
 * 
 * Evita subclases
 * 
 * Asociada a java.lang.Object
 * 
 * *********************************************************************
 *	Usar en casos de:
 *
 *	Clases a instanciar en tiempo de ejecucion
 * 
 * *********************************************************************
 * Forma de armarlo:
 * 
 * Se crea interfaz que contiene metodos para obtener clone y un metodo 
 * propio del objeto a crear
 * 
 * Implementa los metodos de interfaz para obtener clone por instanciacion
 * a traves de una interfaz y la ejecucion de una accion
 *	
 * *********************************************************************
 */
public class PrototypePattern {

	public static void main(String[] args) {
		
		// Crea prototypes obteniendo una referencia
		PrototypeIF prototype1 = new ConcretePrototype();
		
		// Se obtiene el clon con referencia Prototype
		PrototypeIF clone = prototype1.getClone();
		
		// Accion sobre los clones
		clone.action();
	}

}
