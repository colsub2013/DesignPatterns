package patterns.behavioural.strategy;

/**
 * 	ESTRUCTURAL - Objetivo:
 *	
 *	Define familia o funcionalidad, encapsula a c/u, y las hace intercambiables
 *
 *	La funcionalidad varía independientemente de los clientes que la usan
 *
 * 	- Provee substituto para subclases
 * 	
 * 	- Define cada comportamiento dentro de su propia clase, eliminando
 * 	  sentencias condicionales
 * 	
 * 	- Facilita extender e incorporar un comportamiento nuevo	
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	- Varias clases difieren solo en sus comportamientos (Ej. API servlet)
 *	
 *	- Necesita diferentes variaciones de un algoritmo
 * 
 * 	- Un algoritmo usa datos desconocidos al cliente
 * 
 * *********************************************************************
 * 	Forma de armarlo:
 * 	
 *	1. Interfaz de estrategia que contiene declaracion de metodo que sera implementado 
 *  por clases concretas y se usa como referencia en el contexto 
 *  
 *	2. Clases concretas que implementan metodos de interfaz de estrategia con logica de operacion
 *
 *	3. Clase contexto que contiene referencia a la interfaz de estrategia que se usa en el constructor, 
 *  y contiene otro metodo que invoca al metodo declarado en la interfaz de estrategia. 
 *	
 *	4. En el main:
 *	
 *	   - Se crean 2 objetos de las clases estrategia concreta con referencia a interfaz de estrategia
 *	   - Se crean 2 objetos de contexto por constructor con argumentos (los creados en punto anterior)
 *	   - Se invoca 4 veces metodo de interfaz de contexto y en base al objeto anterior
 *
 * *********************************************************************
 */
public class StrategyPattern {

	public static void main(String[] args) {
		
		StrategyIF strategy1 = new ConcreteStrategy1();
		StrategyIF strategy2 = new ConcreteStrategy2();
		
		Context context1 = new Context(strategy1);
		Context context2 = new Context(strategy2);
		
		context1.contextInterface("J2EE Unleashed");
		context2.contextInterface("J2EE Unleashed");
		context1.contextInterface("The Secret Commissions");
		context2.contextInterface("The Secret Commissions");
	}

}
