package patterns.structural.flyweight;

/**
 * 	ESTRUCTURAL - Objetivo:
 * 	
 * 	Compartir para soporte de gran numero de objetos de grano-fino
 * 	de manera eficiente
 * 
 * 	Reduce el nro de objetos con los que tratar
 * 
 * 	Reduce la cantidad de memoria y dispositivos de almacenamiento
 * 	requeridos si los objetos son persistidos		
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Aplicacion con gran cantidad de objetos
 *	
 *	Los costos de almacenamiento son altos por la cantidad de objetos
 *
 *	La aplicacion no depende de la identidad del objeto
 * 
 * *********************************************************************
 * 	Forma de armarlo:
 * 	
 * 	Crear una interfaz flyweight que contiene la declaracion del metodo
 * 	al que se le aplicara el patron
 * 	(FlyweightIF)
 *
 *	Crear una clase cuyo objeto representara cierto estado booleano
 *	(State)
 *	
 *	Crear una clase concreta que contiene un metodo que toma un objeto
 *	de estado y contiene la logica de negocio correspondiente
 *	(ConcreteFlyweight)
 *
 *	Crear una clase factory que contiene un metodo static que toma un 
 *  parametro como clave del map y  devuelve una instancia del factory
 *  concreto con referencia a la interfaz factory
 *  (FlyweightFactory)
 *  
 * 	En el main:
 * 	- Crear objetos de estado con un estado determinado
 * 	- Se crean varias referencias a interfaz flyweight con factories
 * 	- Se aplican los metodos de las referencias flyweight con valores
 * 	  de estado como argumento
 * 	(FlyweightPattern)		
 *
 * *********************************************************************
 */
public class FlyweightPattern {

	public static void main(String[] args) {
		
		State stateF = new State(false);
		State stateT = new State(true);
		
		FlyweightIF myfwkey1 = FlyweightFactory.getFlyweight("myfwkey");
		FlyweightIF myfwkey2 = FlyweightFactory.getFlyweight("myfwkey");
		
		System.out.println("Call flyweight action with state=false");
		myfwkey1.action(stateF);
		System.out.println("Call flyweight action with state=true");
		myfwkey2.action(stateT);
	}

}
