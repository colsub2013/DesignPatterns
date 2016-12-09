package threads;

import java.util.ArrayList;
import java.util.List;

public class ObjetoEjecucionLogica  extends AbstractThreads {

	public void ejecutarLogica() {
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		for (int x : lista) {
			this.paralelizarElementos("Elemento", "param1", x);
		}
		
		// Se espera que terminen todos los procesamientos de elementos.
		Boolean error = this.waitParalelizarElementos();
		
		System.out.println("SE EJECUTARON TODOS LOS THREADS");
	}
}
