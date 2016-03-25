package patterns.builder;

/**
 * Contiene un constructor y un metodo para construir un objeto concreto 
 * a traves de la referencia a una interfaz Builder. Actua por instanciacion.
 */
public class Director {
	
	BuilderIF build;

	public Director(BuilderIF build) {
		this.build = build;
	}
	
	public void construct() {
		build.buildProduct();
	}

}
