package threads.ejemplo1;

/***
 *	Performance en threads
 *	********************** 
 * 	El objetivo es correr la logica de una lista de elementos en hilos separados
 * 	para mejorar la performance.
 * 
 */
public class Ej1PerformanceThreadsMain {
	
	/**
	 *	Se instancia objeto que contiene la logica principal para 
	 *	comparar el procesamiento de una lista de objetos con y sin threads. 
	 */
	public static void main(String[] args) {
		ObjetoEjecucionLogicaThreads oel = new ObjetoEjecucionLogicaThreads();
		oel.ejecutarLogica();
		// Se finaliza ejecucion del programa.
		System.exit(0);
	}

}
