package threads.ejemplo2.engine;

import java.util.ArrayList;
import java.util.List;

import threads.ejemplo2.engine.ThreadsEngine;
import threads.ejemplo2.runnable.Elemento2ThreadRunnable;

/**
 *	Contiene la logica de procesamiento en ambos escenarios:
 *	Con y sin threads. 
 */
public class Ej2ObjetoEjecucionLogicaElem2Threads {

	/**
	 *	Ejecucion de logica para ambos casos con y sin threads. 
	 */
	public void ejecutarLogica() {
		
		ThreadsEngine aThreads = new ThreadsEngine();
		
		// Lista en la que a cada elemento se le asocia un procesamiento
		// repetitivo.
		List<String> lista = new ArrayList<String>();
		lista.add("1er elemento");
		lista.add("2do elemento");
		lista.add("3er elemento");
		lista.add("4to elemento");
		lista.add("5to elemento");
		lista.add("6to elemento");
		lista.add("7mo elemento");
		lista.add("8vo elemento");
		lista.add("9no elemento");
		lista.add("10mo elemento");
		
		System.out.println("Elemento2 con threads - inicio **************************************************************/");
		long inicioThreadsElem2 = System.currentTimeMillis();
		
		for (String elem : lista) {
			aThreads.paralelizarElementos(Elemento2ThreadRunnable.class, "Elemento2", elem);
		}
		
		// Se espera que terminen todos los procesamientos de elementos.
		aThreads.waitParalelizarElementos();
		System.out.println("SE EJECUTARON TODOS LOS THREADS ELEM2");
		long finThreadsElem2 = System.currentTimeMillis();
		System.out.println("Tiempo ejecucion CON THREADS Elem2 en segs: " + ((finThreadsElem2 - inicioThreadsElem2) * 100));

		System.out.println("Elemento2 con threads - Fin ****************************************************************/");
	}
}
