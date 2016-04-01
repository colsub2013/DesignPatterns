package patterns.structural.proxy;

/**
 *	Clase proxy que implementa interfaz del servicio
 *	y por instanciacion de un objeto del servicio 
 *	implementa el metodo principal 
 */
public class Proxy implements ServiceIF {

	private final Service service = new Service();
	
	@Override
	public void action() {
		service.action();
	}
	
}
