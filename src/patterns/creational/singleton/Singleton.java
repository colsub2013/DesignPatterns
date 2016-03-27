package patterns.creational.singleton;

/**
 *	Se crea una clase final que contiene una instancia de esta clase y un valor 
 *	a definirse. Esta tiene un constructor, y un metodo para synchronized para obtener 
 *	la instancia de esa clase. Tiene un metodo getInfo para obtener el hashcode de la instancia,
 *  getters y setters para valores int, y un metodo equals para comparar los hashcodes de 
 *  cada instancia. 
 */
public final class Singleton {
	
	private static Singleton instance;
	private int value;
	
	public Singleton() {
		System.out.println("Singleton constructed.");
	}
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public String getInfo() {
		return getClass().getName() + ", id#" + System.identityHashCode(this); 
	}
	
	public int getValue() { return value; }
	
	public void setValue(int parm) { value = parm; }
	
	public boolean equals(Singleton parm) {
		return (System.identityHashCode(this) == System.identityHashCode(parm));
	}
}
