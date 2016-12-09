package threads;

/**
 *	Representa a cada thread de la lista que sera procesado. 
 */
public class ElementoThreadRunnable implements Runnable {

	private String elementoEjecucion;
	private Object[] params;
	private AbstractThreads abstractThreads;
	
	/**
	 *	Constructor con argumentos. 
	 *	@param elementoEjecucion elementoEjecucion
	 *	@param abstractThreads abstractThreads
	 *	@param params params
	 */
	public ElementoThreadRunnable(String elementoEjecucion,
		AbstractThreads abstractThreads, Object... params) {
		this.elementoEjecucion = elementoEjecucion;
		this.params = params;
		this.abstractThreads = abstractThreads;
	}

	/**
	 *	Ejecuta el metodo de accion correspondiente a cada hilo y lo apaga
	 *	una vez procesado. 
	 */
	@Override
	public void run() {
		try {
			this.abstractThreads.action(elementoEjecucion, params);
			this.abstractThreads.shutdownRunnableAction(this, false, null);
		} catch (Exception e) {
			this.abstractThreads.shutdownRunnableAction(this, true, e);
		}
		
	}
	
}
