package patterns.behavioural.chainOfResponsability;

/**
 *	3. Se crea handler concreto que implementa 
 *	el metodo declarado en la interfaz request y se 
 *	usara para pasar la cadena de responsabilidad
 *	a otro handler. 
 */
public class ConcreteHandler2 implements HandlerIF {

	@Override
	public void processRequest(Request request) {
		this.handleIt(request);
	}

	private void handleIt(Request request) {
		System.out.println(
			"ConcreteHandler2 has handled the processing.");
	}
}