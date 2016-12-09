package threads;

public class ElementoThreadRunnable implements Runnable {

	private String elementoEjecucion;
	private Object[] params;
	private AbstractThreads abstractThreads;
	
	public ElementoThreadRunnable(String elementoEjecucion,
		AbstractThreads abstractThreads, Object... params) {
		this.elementoEjecucion = elementoEjecucion;
		this.params = params;
		this.abstractThreads = abstractThreads;
	}

	@Override
	public void run() {
		try {
			abstractThreads.action(elementoEjecucion, params);
			abstractThreads.shutdownRunnableAction(this, false, null);
		} catch (Exception e) {
			abstractThreads.shutdownRunnableAction(this, true, e);
		}
		
	}
	
}
