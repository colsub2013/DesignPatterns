package threads.ejemplo2.main;

import threads.ejemplo2.engine.Ej2ObjetoEjecucionLogicaElem1Threads;
import threads.ejemplo2.engine.Ej2ObjetoEjecucionLogicaElem2Threads;

/***
 *	Performance en threads
 *	********************** 
 * 	El objetivo es correr la logica de una lista de elementos en hilos separados
 * 	para mejorar la performance.
 * 
 */
public class Ej2PerformanceThreadsMain {
	
	/**
	 *	Se instancia objeto que contiene la logica principal para 
	 *	comparar el procesamiento de una lista de objetos con y sin threads. 
	 */
	public static void main(String[] args) {
		Ej2ObjetoEjecucionLogicaElem1Threads oel1 = new Ej2ObjetoEjecucionLogicaElem1Threads();
		oel1.ejecutarLogica();
		
		Ej2ObjetoEjecucionLogicaElem2Threads oel2 = new Ej2ObjetoEjecucionLogicaElem2Threads();
		oel2.ejecutarLogica();
		
		// Se finaliza ejecucion del programa.
		System.exit(0);
	}
	
}
