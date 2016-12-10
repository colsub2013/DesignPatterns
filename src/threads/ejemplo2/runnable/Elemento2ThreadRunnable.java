package threads.ejemplo2.runnable;

import threads.ejemplo2.engine.ThreadsEngine;

/**
 *	Representa a cada thread de la lista que sera procesado. 
 */
public class Elemento2ThreadRunnable implements Runnable {

	private String elementoEjecucion;
	private Object[] params;
	private ThreadsEngine threadsEngine;
	
	/**
	 *	Constructor con argumentos. 
	 *	@param elementoEjecucion elementoEjecucion
	 *	@param threadsEngine threadsEngine
	 *	@param params params
	 */
	public Elemento2ThreadRunnable(String elementoEjecucion,
		ThreadsEngine threadsEngine, Object... params) {
		this.elementoEjecucion = elementoEjecucion;
		this.params = params;
		this.threadsEngine = threadsEngine;
	}

	/**
	 *	Ejecuta el metodo de accion correspondiente a cada hilo y lo apaga
	 *	una vez procesado. 
	 */
	@Override
	public void run() {
		try {
			this.threadsEngine.actionElem2(elementoEjecucion, params);
			this.threadsEngine.shutdownRunnableAction(this, false, null);
		} catch (Exception e) {
			this.threadsEngine.shutdownRunnableAction(this, true, e);
		}
		
	}
	
}
