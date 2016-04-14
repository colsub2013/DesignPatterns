package patterns.behavioural.state;

/**
 * 	COMPORTAMIENTO - Objetivo:
 *	
 *	Altera comportamiento de un objeto al cambiar su estado interno, 
 *	pareciendo que el objeto ha cambiado su clase
 *
 *	Encapsula estados de un objeto como objetos discretos, con cada objeto
 *	perteneciendo a una subclase separada de una clase de estado abstracto
 *
 * 	Mantiene comportamiento especifico de estado local y comportamiento
 * 	de particiones para estados diferentes	
 *	
 *	Hace explicita a cualquier transicion de estado
 * 	
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	El comportamiento del objeto depende de su estado y debe ser capaz
 *	de cambiar su comportamiento en tiempo de ejecucion de acuerdo
 *	al nuevo estado
 *
 *	Las operaciones tienen sentencias condicionales multipartes grandes
 *	que dependen del estado del objeto
 *
 * *********************************************************************
 * 	Forma de armarlo:
 * 	
 * 	1. Se crea interfaz de estado con un metodo de muestra
 * 
 * 	2. Se crean 2 clases de estado concreto cada una con un mismo metodo
 * 	   de muestra, cada uno realiza una accion distinta
 * 	
 * 	3. Se crea clase de contexto que instancia una referencia con una 
 * 	   instancia a un objeto concreto, un metodo que por medio de la
 * 	   referencia llama a un metodo comun de ambas clases concretas
 * 	   y otro metodo que cambia de estado segun la instancia de la 
 * 	   clase concreta
 * 			
 * 	4. En el main:
 * 	   - Se crea instancia del contexto
 * 	   - Se llama al metodo que enmascara a los metodos con logica de las clases concretas
 * 	   - Se llama al metodo que cambia el estado del contexto
 * 	   - Se llama de nuevo al metodo que enmascara a los metodos con logica de las clases concretas
 * *********************************************************************
 */
public class StatePattern {

	public static void main(String[] args) {
		
		// Construye contexto
		Context context = new Context();
		
		// Peticion
		context.request();
		
		// Cambio de estado
		context.changeState();
		
		// Peticion
		context.request();
		
	}

}
