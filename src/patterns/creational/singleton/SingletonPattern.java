package patterns.creational.singleton;

/**
 * CREACIONAL - Objetivo:
 * 
 * Asegura que una clase tiene solo una instancia y provee un punto de
 * acceso global a esta.
 * 
 * Acceso a unica instancia de la clase
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Se necesita una unica instancia de una clase y debe ser accesible
 *  a clientes desde un punto de acceso bien conocido 
 * 
 * *********************************************************************
 * Forma de armarlo:
 * 
 * Se crea una clase que tiene un metodo synchronized para obtener la 
 * instancia, getters y setters con valores y metodos para comprobar
 * equidad e info por valores de hash de la instancia
 * 
 * Para el main:
 * 
 * Se crea una clase Singleton con getInstance()
 * 
 * Se fija un valor
 * 
 * Se comprueba unicidad de la instancia
 *	
 * *********************************************************************
 */
public class SingletonPattern {

	public static void main(String[] args) {

		System.out.println("Getting Singleton instance s1");
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1.getInfo() = " + s1.getInfo());

		System.out.println("Getting Singleton instance s2");
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2.getInfo() = " + s2.getInfo());
		
		System.out.println("s1.setValue(42)");
		s1.setValue(42);
		
		System.out.println("s1.getValue() = " + s1.getValue());
		System.out.println("s2.getValue() = " + s2.getValue());
		System.out.println(
			"s1.equals(s2) = " + s1.equals(s2) 
			+ ", s2.equals(s1) = " + s2.equals(s1));
		
		// Lo siguiente no compilara
		// Singleton s3 = (Singleton) s1.clone();
	}

}
