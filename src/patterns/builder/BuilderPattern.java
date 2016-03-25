package patterns.builder;

/**
 * ************************************************************************
 * CREATIONAL - Crea objetos complejos en multiples pasos en vez de en un 
 * unico paso. 	 
 * 
 * ************************************************************************
 * Usar en casos de:
 * 	
 * El algoritmo para crear un objeto complejo necesita ser independiente de 
 * los componentes que componen al objeto y como estos se ensamblan
 *
 * ************************************************************************
 * Forma de armarlo: 
 * 
 * Se comienza creando una interfaz que contenga los metodos de implementacion
 * del objeto a crear 
 * (ProductIF)
 * 
 * Se crea una clase que representa el objeto complejo que sera construido por 
 * el builder e implementa los metodos de la interfaz del punto anterior
 * (ConcreteProduct)
 * 
 * Se crea una interfaz builder que contiene los metodos necesarios para 
 * construir y obtener dicho builder
 * (BuilderIF)
 * 
 * Se crea una clase builder concreta que implementa los metodos para 	
 * construir y obtener dicho builder. Ademas contiene una referencia a la 
 * interfaz asociada al producto concreto a crear
 * (ConcreteBuilder)
 * 
 * Se crea Director que es una clase que contiene un constructor y metodos 
 * que utilizan referencias a la interfaz del Builder
 * (Director)
 * 
 * ************************************************************************
 */
public class BuilderPattern {

	public static void main(String[] args) {
		
		// Crea builder por instanciacion de builder concreto.
		BuilderIF builder = new ConcreteBuilder();
		
		// Crea director con instanciacion del builder creado anteriormente.
		Director director = new Director(builder);

		// Construye Product via director
		director.construct();
		
		// Se obtiene Product via builder
		ProductIF customer = builder.getProduct();
		
		// Se usa metodo customer
		customer.action();
		
	}
}
