package threads.ejemplo2;

import java.util.ArrayList;
import java.util.List;

/**
 *	Contiene la logica de procesamiento en ambos escenarios:
 *	Con y sin threads. 
 */
public class ObjetoEjecucionLogicaThreads {

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
		
		System.out.println("Con threads - inicio **************************************************************/");
		long inicioThreads = System.currentTimeMillis();
		
		int countThreads = 0;
		for (String elem : lista) {
			aThreads.paralelizarElementos("Elemento", elem, countThreads);
			countThreads++;
		}
		
		// Se espera que terminen todos los procesamientos de elementos.
		aThreads.waitParalelizarElementos();
		System.out.println("SE EJECUTARON TODOS LOS THREADS");
		long finThreads = System.currentTimeMillis();
		System.out.println("Tiempo ejecucion CON THREADS en segs: " + ((finThreads - inicioThreads) * 100));

		System.out.println("Con threads - Fin ****************************************************************/");

		System.out.println("Sin threads - Inicio *************************************************************/");
		long inicio = System.currentTimeMillis();

		int count = 0;
		for (String elem : lista) {
			aThreads.action("Elemento", elem, count);
			count++;
		}

		long fin = System.currentTimeMillis();
		System.out.println("Tiempo ejecucion SIN THREADS en segs: " + ((fin - inicio) * 100));

		System.out.println("Sin threads - Fin ****************************************************************/");

	}
}
