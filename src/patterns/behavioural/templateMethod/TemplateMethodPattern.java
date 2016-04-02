package patterns.behavioural.templateMethod;

/**
 * 	COMPORTAMIENTO - Objetivo:
 * 	
 * 	Define el esqueleto de una funcion en una operacion, difiriendo 
 * 	algunos pasos a sus subclases
 *	
 *	Provee reutilizacion de codigo	
 * 	
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Se quieren implementar partes invariantes de un algoritmo en una unica
 *	clase y las partes variables del algoritmo en subclases
 *
 *	Un comportamiento comun entre subclases deberia ser movido a una 
 *	clase comun unica, evitando la duplicacion	
 *	
 * *********************************************************************
 * 	Forma de armarlo:
 * 
 *  1. Clase abstracta que contiene la declaracion de un par de metodos de utilidad 
 *  y la implementacion de un metodo que contiene la invocacion de esos metodos 	
 * 
 *  2. Clase concreta que extiende la clase abstracta e implementa los metodos 
 *  de utilidad definidas en esta 	
 * 
 * 	En el main:
 * 	
 * 	- Se instancia clase concreta con referencia a la clase abstracta
 * 
 * 	- Se llama a metodo plantilla que contiene la invocacion de los metodos
 * 	  de utilidad declarados en la clase abstracta	
 *	
 * *********************************************************************
 */
public class TemplateMethodPattern {
	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		// Llama a template method
		class1.templateMethod();
	}
}
