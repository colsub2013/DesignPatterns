package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class AbstractThreads {
	
  	private Integer numThreadsPool = 5;
	
	/* Servicio para ejecutar threads */
	private ExecutorService executor;
	
	/* True si algún thread falló */
	private Boolean threadElementotError = false;
	
	/* Lista con los threads de elementos generados */
	private List<ElementoThreadRunnable> threadsElementos = new ArrayList<ElementoThreadRunnable>();
	
	/* Error en ejecución de hilos */
	protected Throwable e;
	
	public void action(String elementoEjecucion, Object... params) {
		// Colocar aqui logica de negocio.
		System.out.println(elementoEjecucion + " : " + params[0] + " : " + params[1]);
	}
	
	public void shutdownRunnableAction(ElementoThreadRunnable current, boolean tieneErrores, Throwable e) {
		if (!threadElementotError) {
			threadElementotError = tieneErrores;
			this.e = e;
		}
		this.threadsElementos.remove(current);
	}
	
	protected void paralelizarElementos(String elementoEjecucion, Object... params) {
		executor = Executors.newFixedThreadPool(numThreadsPool);
		ejecutarHiloElemento(elementoEjecucion, params);
	}
	
	/* Dispara un thread */
	private void ejecutarHiloElemento(String elementoEjecucion, Object... params) {
		ElementoThreadRunnable runnable = new ElementoThreadRunnable(elementoEjecucion, this, params);
		executor.execute(runnable);
		threadsElementos.add(runnable);
	}
	
	protected Boolean waitParalelizarElementos() {
		while (!threadsElementos.isEmpty()) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				threadsElementos.clear();
			}
		}
		return threadElementotError;
	}

}
