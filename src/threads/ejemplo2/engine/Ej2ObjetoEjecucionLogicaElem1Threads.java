package threads.ejemplo2.engine;

import java.util.ArrayList;
import java.util.List;

import threads.ejemplo2.engine.ThreadsEngine;
import threads.ejemplo2.runnable.Elemento1ThreadRunnable;

/**
 *	Contiene la logica de procesamiento en ambos escenarios:
 *	Con y sin threads. 
 */
public class Ej2ObjetoEjecucionLogicaElem1Threads {

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
		
		System.out.println("Elemento1 con threads - inicio **************************************************************/");
		long inicioThreadsElem1 = System.currentTimeMillis();
		
		int countThreadsElem1 = 0;
		for (String elem : lista) {
			aThreads.paralelizarElementos(Elemento1ThreadRunnable.class, "Elemento1", elem, countThreadsElem1);
			countThreadsElem1++;
		}
		
		// Se espera que terminen todos los procesamientos de elementos.
		aThreads.waitParalelizarElementos();
		System.out.println("SE EJECUTARON TODOS LOS THREADS ELEM1");
		long finThreadsElem1 = System.currentTimeMillis();
		System.out.println("Tiempo ejecucion CON THREADS Elem1 en segs: " + ((finThreadsElem1 - inicioThreadsElem1) * 100));

		System.out.println("Elemento1 con threads - Fin ****************************************************************/");

		System.out.println("Sin threads - Inicio *************************************************************/");
		long inicio = System.currentTimeMillis();

		int count = 0;
		for (String elem : lista) {
			aThreads.actionElem1("Elemento", elem, count);
			count++;
		}

		long fin = System.currentTimeMillis();
		System.out.println("Tiempo ejecucion SIN THREADS en segs: " + ((fin - inicio) * 100));

		System.out.println("Sin threads - Fin ****************************************************************/");
		
	}
}
