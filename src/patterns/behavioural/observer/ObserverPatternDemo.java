package patterns.behavioural.observer;

/**
 *	http://www.tutorialspoint.com/design_pattern/observer_pattern.htm 
 * 	
 * 	COMPORTAMIENTO - Objetivo:
 * 
 * 	Define una dependencia one-to-many tal que cuando un objeto cambia su estado,
 *  todos sus dependientes sean notificados y actualizados automaticamente
 *  
 *  Se provee soporte via java.util.Observer y java.util.Observable
 *  
 *  Se abstrae del acoplamiento entre sujeto y observador
 *  
 *  Provee soporte para comunicacion tipo broadcast	
 * 	
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Un cambio a un objeto requiere cambiar otros objetos, y el numero de objetos
 *  que necesitan cambiarse es desconocido
 *  
 *  Un objeto necesita notificar a otros objetos sin hacer asunciones sobre la 
 *  identidad de esos objetos
 *
 * *********************************************************************
 * 	Forma de armarlo:
 * 
 *  1. Se crea clase abstracta sujeto que contiene una propiedad 
 *  tipo sujeto y un metodo abstracto de actualizacion
 *   
 *	2. Clase sujeto que tiene 2 propiedades, una lista de objetos Observer vacia
 *	y un estado numerico, para el que se tiene un getter y un setter, el setter
 *	ademas llama a un metodo que itera la lista de observers e invoca
 *	a metodos de actualizacion declarados en la clase abstracta observer.
 *	Hay otro metodo para agregar objetos a la lista 
 *
 *  3. Observadores concretos que extiende la clase observador
 *	abstracta la cual tiene un constructor que toma como argumento
 *	un sujeto y lo agrega al sujeto. Tambien contiene la implementacion
 *	del metodo de actualizacion de la clase abstracta  
 *
 *	4. En el main:
 *   - Se crea sujeto por instanciacion
 *	 - Se crean instancias de cada uno de los observadores concretos con 
 *     un constructor que toma al objeto sujeto como argumento
 *	 - Se fija el estado del objeto sujeto con valores numericos  
 *
 * *********************************************************************
 */
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}
