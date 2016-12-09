package threads;

import java.util.ArrayList;
import java.util.List;

public class ObjetoEjecucionLogicaThreads extends AbstractThreads {

	public void ejecutarLogica() {

		// CON THREADS

		long inicioThreads = System.currentTimeMillis();
		
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
		
		int countThreads = 0;
		for (String elem : lista) {
			this.paralelizarElementos("Elemento", elem, countThreads);
			countThreads++;
		}
		
		// Se espera que terminen todos los procesamientos de elementos.
		Boolean error = this.waitParalelizarElementos();
		
		System.out.println("SE EJECUTARON TODOS LOS THREADS");
		
		long finThreads = System.currentTimeMillis();
		
		System.out.println("Tiempo ejecucion en segs con threads: " + ((finThreads - inicioThreads) * 100));
		
		// SIN THREADS
		long inicio = System.currentTimeMillis();

		int count = 0;
		for (String elem : lista) {
			this.action("Elemento", elem, count);
			count++;
		}

		long fin = System.currentTimeMillis();

		System.out.println("Tiempo ejecucion en segs: " + ((fin - inicio) * 100));
	}
}
