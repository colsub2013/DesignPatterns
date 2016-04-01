package patterns.structural.proxy;

/**
 *	Clase servicio que implementa el metodo
 *	declarado en interfaz con logica correspondiente 
 */
public class Service implements ServiceIF {
	
	public Service() {
		System.out.println("Service constructed.");
	}

	@Override
	public void action() {
		System.out.println("Service.action() called.");
	}
	
}
