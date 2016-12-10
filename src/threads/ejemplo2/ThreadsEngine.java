package threads.ejemplo2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import threads.dto.CargaDTO;

/**
 * 	Clase abstracta que contiene el motor para correr la logica
 * 	de mejoramiento de performance con threads.
 */
public class ThreadsEngine {
	
	/** Numero de threads en el pool. */
  	private Integer numThreadsPool = 10;
	
	/** Servicio para ejecutar threads */
	private ExecutorService executor;
	
	/** True si algún thread falló */
	private Boolean threadElementotError = false;
	
	/** Lista con los threads de elementos generados */
	private List<ElementoThreadRunnable> threadsElementos = new ArrayList<ElementoThreadRunnable>();
	
	/** Error en ejecución de hilos */
	protected Throwable e;

	/**
	 *	Contiene la logica de negocio para cada elemento en la lista, la cual se trata
	 *	de elaborar de forma "costosa" para notar el beneficio de usar los threads.
	 *	@param elementoEjecucion elementoEjecucion
	 *	@param params params 
	 */
	public void action(String elementoEjecucion, Object... params) {
		// Colocar aqui logica de negocio.
		int[] array = new int[10000];
		for (int i = 0; i < array.length; i++) {
			new CargaDTO(Math.random(), "CARGA", new Date());
		}
		System.out.println(elementoEjecucion + " : " + params[0] + " : " + params[1]);
	}
	
	/**
	 *	Metodo que notifica si hay errores en el thread actual y lo quita de la 
	 *	lista de threads una vez procesado.
	 *	@param current current
	 *	@param tieneErrores tieneErrores
	 *	@param e e
	 */
	public void shutdownRunnableAction(ElementoThreadRunnable current, boolean tieneErrores, Throwable e) {
		if (!threadElementotError) {
			this.threadElementotError = tieneErrores;
			this.e = e;
		}
		this.threadsElementos.remove(current);
	}
	
	/**
	 *	Permite paralelizar la ejecucion del listado de threads en distintos hilos.
	 *	Invoca a un metodo que arma un hilo con esos parametros y lo ejecuta
	 *	Debe invocarse por la clase que contiene la logica de negocio principal.
	 *	@param elementoEjecucion elementoEjecucion
	 *	@param params params 
	 */
	protected void paralelizarElementos(String elementoEjecucion, Object... params) {
		this.executor = Executors.newFixedThreadPool(numThreadsPool);
		this.ejecutarHiloElemento(elementoEjecucion, params);
	}
	
	/** 
	 * 	Contiene la logica para disparar un thread y agregarlo a la lista de threads. 
	 * 	@param elementoEjecucion elementoEjecucion
	 * 	@param params params
	 */
	private void ejecutarHiloElemento(String elementoEjecucion, Object... params) {
		ElementoThreadRunnable runnable = new ElementoThreadRunnable(elementoEjecucion, this, params);
		this.executor.execute(runnable);
		this.threadsElementos.add(runnable);
	}
	
	/** 
	 * 	Chequea que la lista de elementos se haya vaciado (que se hayan ejecutado todos los hilos).
	 * 	En ese caso devuelve true 
	 * 	@return Boolean Boolean
	 */
	protected Boolean waitParalelizarElementos() {
		while (!this.threadsElementos.isEmpty()) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				this.threadsElementos.clear();
			}
			
			if (this.threadsElementos.isEmpty()) {
				this.executor.shutdown();
			}
		}
		return this.threadElementotError;
	}

}
