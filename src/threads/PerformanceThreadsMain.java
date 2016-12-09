package threads;

/***
 *	Performance en threads
 *	********************** 
 * 	El objetivo es correr la logica de una lista de elementos en hilos separados
 * 	para mejorar la performance.
 * 
 */
public class PerformanceThreadsMain {
	
	/**
	 *	Se instancia objeto que contiene la logica principal para 
	 *	comparar el procesamiento de una lista de objetos con y sin threads. 
	 */
	public static void main(String[] args) {
		ObjetoEjecucionLogicaThreads oel = new ObjetoEjecucionLogicaThreads();
		oel.ejecutarLogica();
	}

}
