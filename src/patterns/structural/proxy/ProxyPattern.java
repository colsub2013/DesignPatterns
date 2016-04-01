package patterns.structural.proxy;

/**
 * 	ESTRUCTURAL - Objetivo:
 * 	
 * 	Locatario (placeholder) para que otro objeto controle el acceso a este.
 * 	
 * 	Proxy remoto - Protege el hecho de que la implementación reside en otro espacio
 * 	de direcciones
 * 
 * 	Proxy virtual - Optimizaciones creando objetos por demanda
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Se necesita referencia a un objeto mas versatil o sofisticado
 * 
 * *********************************************************************
 * 	Forma de armarlo:
 * 
 * 	Se crea interfaz con metodo de utilidad
 * 	(ServiceIF)
 * 	
 * 	Se crea clase del servicio que implementa interfaz del servicio
 * 	e implementa el metodo con la logica adecuada
 * 	(Service)
 * 
 * 	Se crea clase proxy que implementa interfaz del servicio
 * 	y con una instancia del servicio implementa metodo de utilidad
 * 	(Proxy)
 * 
 * 	En el main, se instancia el proxy con una referencia a la interfaz
 * 	del servicio, y se aplica el metodo de utilidad
 * 	(ProxyPattern)	
 *
 * *********************************************************************
 */
public class ProxyPattern {
	
	public static void main(String[] args) {
		ServiceIF proxy = new Proxy();
		proxy.action();
	}
	
}
