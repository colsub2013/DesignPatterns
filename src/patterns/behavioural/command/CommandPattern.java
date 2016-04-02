package patterns.behavioural.command;

/**
 * 	COMPORTAMIENTO - Objetivo:
 * 	
 * 	Encapsula una peticion como un objeto, dejandolo parametrizar clientes
 * 	con peticiones diferentes.
 * 
 * 	Separa objeto que invoca la operacion del objeto que realiza la operacion
 * 
 * 	Simplifica el agregado de comandos nuevos, ya que las clases existentes
 * 	no cambian
 * 	
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Parametrizacion de objetos de acuerdo a la accion a realizar
 *
 *	Crea, encola y ejecuta peticiones en tiempos diferentes
 *
 *	Soporte de funcionalidades de transaccion, logging y rollback
 *
 * *********************************************************************
 * 	Forma de armarlo:
 * 
 * 	1. Interfaz receptor que contiene declaracion de metodos de utilidad 
 *  implementables por clase comando
 *  
 *	2. Se crea clase comando 1 que implementa interfaz receptor y contiene 
 *	metodos con logica de utilidad 
 *  
 *	3. Se crea clase comando abstracta que contiene la declaracion del metodo 
 *  de ejecucion a ser implementado por el comando concreto y el invocador
 *  
 *	4. Clase concreta que extiende la clase abstracta con la implementacion 
 *  del metodo de ejecucion el cual invoca al metodo de utilidad por medio 
 *  de una referencia a la interfaz receptor
 *  
 *	5. Clase invocador la cual contiene un metodo para almacenar comandos tomando 
 *  como argumento una referencia al comando abstracto y contiene un metodo 
 *  invocador que invoca al metodo de ejecución con la referencia a ese comando abstracto 
 * 
 * 	En el main:
 * 
 * 	- Se instancia clase comando 1 con referencia a interfaz receptor
 * 
 * 	- Se crea instancia de comando concreto por constructor que toma 
 * 	  como argumento a la referencia receptor y tiene una referencia
 * 	  al comando abstracto
 * 
 *  - Se crea instancia del invocador
 *  
 *  - La instancia del invocador almacena el comando
 *  
 *  - La instancia del invocador hace la invocacion correspondiente
 *	
 * *********************************************************************
 */
public class CommandPattern {

	public static void main(String[] args) {
		
		// Crea receptor
		ReceiverIF command1 = new Command1();
		
		// Crea comandos pasando objetos receptor
		CommandAbstract cmdCommand1 = new ConcreteCommand(command1);
		
		// Crea invocadores
		Invoker invoker1 = new Invoker();
		
		// Almacena comando en invocadores
		invoker1.storeCommand(cmdCommand1);
		
		// Llama a invoke() en el invocador para ejecutar el comando.
		invoker1.invoke();
		
	}

}
