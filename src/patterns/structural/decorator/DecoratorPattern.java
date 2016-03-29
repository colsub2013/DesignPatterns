package patterns.structural.decorator;

/**
 * 	ESTRUCTURAL - Objetivo:
 * 	
 * 	Anexa responsabilidades adicionales flexibles a un objeto dinamicamente		
 * 
 * 	Composicion para extender la funcionalidad de un objeto en tiempo
 *  de ejecucion
 * 	
 * 	Desarrolla una serie de clases de funcionalidad objetivo
 * 
 * 	Mejora extensibilidad del objeto, ya que se hacen cambios para codificar 
 * 	clases nuevas
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Responsabilidades de forma dinamica y transparente a objetos sin afectar
 *	otros objetos
 *
 *	Se agregan responsabilidades de un objeto que puede querer cambiar 
 *	el futuro
 * 
 * *********************************************************************
 * 	Forma de armarlo:
 * 	
 * 	Se crea interfaz que contiene la declaracion del metodo a decorar
 * 	(ComponentIF)
 * 
 * 	Se crea clase con el componente concreto - contiene implementacion
 *  original del metodo que se va a decorar e implementa la interfaz
 *  con la declaracion del metodo a decorar
 *  (ConcreteComponent)
 *  
 *  Se crea clase decorador que implementa la interfaz que contiene
 *  el metodo a decorar y la instanciacion de una variable componente concreto
 *  con referencia a la interfaz componente la cual utilizara esa variable
 *  para implementar el metodo
 *  (Decorator)
 *  
 *  Se crea clase decorador concreto la cual extiende la clase decorador
 *  y decora el metodo de utilidad asignando una variable de instancia
 *  (ConcreteDecorator)
 *  
 *  En el main:
 *  - Se instancia decorador concreto con referencia a la interfaz
 *  - Se invoca al metodo decorado con la variable instanciada 
 *
 * *********************************************************************
 */
public class DecoratorPattern {

	public static void main(String[] args) {
		
		// Crea objeto decorado con A
		System.out.println("Creating component decorated with A.");
		ComponentIF decorated1 = new ConcreteDecorator();
		
		// Llama a action sobre objeto decorado con A
		System.out.println("Calling action() on component decorated with A.");
		decorated1.action();

	}

}
