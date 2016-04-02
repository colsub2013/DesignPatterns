package patterns.behavioural.chainOfResponsability;

/**
 * 	4. Se crea una clase handler concreto que implementa 
 * 	interfaz request e implementa el metodo para procesar
 * 	el request pasando la cadena de responsabilidad
 * 	al 2do handler al 2do handler en caso necesario.
 */
public class ConcreteHandler1 implements HandlerIF {

	@Override
	public void processRequest(Request request) {
		switch (request.getType()) {
			case Request.EQUITY_ORDER:
				this.handleIt(request);
				break;
			
			case Request.BOND_ORDER:
				new ConcreteHandler2().processRequest(request);
				break;
		}
	}
	
	private void handleIt(Request request) {
		System.out.println(
			"ConcreteHandler1 has handled the processing.");
	}
	
}
