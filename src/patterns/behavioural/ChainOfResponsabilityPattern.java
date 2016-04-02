package patterns.behavioural;

/**
 * 	COMPORTAMIENTO - Objetivo:
 * 
 * 	Evita acoplamiento del remitente de una peticion a su receptor dando
 * 	a multiples objetos una chance para manejar las peticiones
 * 
 * 	La peticion se pasa junto a la cadena de objetos receptores hasta 
 * 	que un objeto lo procese
 * 
 *	Reduce acoplamiento
 *	
 *	Permite que un set de clases actue como una, los eventos producidos
 *	en una clase pueden ser enviados a otras clases handler dentro
 *	de la composicion
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Mas de un objeto puede manejar una peticion, y el handler es desconocido
 *	
 *	Se emite una peticion a uno de varios objetos, y el receptor no esta
 *	explicitado	
 *	
 * 	El set de objetos que puede manejar la peticion se especifica dinamicamente
 * *********************************************************************
 * 	Forma de armarlo:
 *	
 *	1. Primero se crea una clase peticion que tiene un getter de una propiedad 
 *  y logica sobre el valor que debe tener esa propiedad en el constructor 
 *	 
 *	2. Interfaz para procesar la peticion, declara un metodo que toma como argumento
 *	al objeto Request el cual procesara
 * 
 *	3. Se crea handler concreto que implementa el metodo declarado en la interfaz 
 *  request y se usara para pasar la cadena de responsabilidad
 *	a otro handler
 *
 * 	4. Se crea una clase handler concreto que implementa interfaz request e implementa 
 *  el metodo para procesar el request pasando la cadena de responsabilidad
 * 	al 2do handler al 2do handler en caso necesario
 * 
 * 	5. En el main:
 * 	
 * 	- Se instancian 2 objetos con distintos parametros tipo request con un constructor 
 *    con argumentos distintos
 *    
 *  - Se crea un objeto del 1er handler con referencia a interfaz request
 *  
 *  - Con el objeto handler creado se invoca a metodos para procesar el request
 *    con distintos objetos tipo request
 * *********************************************************************
 */
public class ChainOfResponsabilityPattern {
	public static void main(String[] args) {
		try {
			Request equityOrderRequest = new Request(Request.EQUITY_ORDER);
			Request bondOrderRequest = new Request(Request.BOND_ORDER);
			
			HandlerIF handler = new ConcreteHandler1();

			handler.processRequest(equityOrderRequest);
			handler.processRequest(bondOrderRequest);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
