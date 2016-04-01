package patterns.structural.facade;

/**
 * 	ESTRUCTURAL - Objetivo:
 * 	
 * 	Describe una interfaz de mas alto nivel que hace al subsistema 
 * 	mas facil de usar
 * 	
 *	Protege a los clientes de la complejidad de los componentes del subsistema
 *
 *	Promueve acoplamiento desajustado entre el subsistema y sus clientes
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Se necesita una interfaz simple para un subsistema complejo
 *	
 *	Hay varias dependencias entre clientes y las clases de implementacion 
 *	de una abstraccion
 *	
 *	Se necesita capa de subsistemas
 * 
 * *********************************************************************
 * 	Forma de armarlo: (todo va por instanciacion)
 * 	
 * 	Se crean un par de subsistemas, los cuales tienen cada uno varios
 * 	metodos distintos con cierta logica util
 * 	(SubSystem1 y SubSystemN)
 * 
 * 	Se crea el facade, que es una clase que contiene un metodo global
 * 	con ciertas instanciaciones de dichos subsistemas e invocaciones 
 * 	a sus metodos correspondientes
 * 	(Facade)	
 * 	
 * 	En el main se instancia el facade y se usa su unico metodo correspondiente
 * 	que contiene la logica de sus subsistemas
 
 * *********************************************************************
 */
public class FacadePattern {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.action();
	}

}
