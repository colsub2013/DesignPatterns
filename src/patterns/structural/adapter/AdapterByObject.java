package patterns.structural.adapter;

/**
 *	Clase que al adaptar por objeto ademas de 
 *	implementar interfaz Target que contiene metodo/s
 *	a adaptar, contiene una variable de instancia private
 *  que se utilizara para acceder a metodo/s del adaptee.  
 */
public class AdapterByObject implements TargetIF {

	private Adaptee adaptee;
	
	public AdapterByObject() {
		System.out.println("AdapterByObject constructed.");
	}

	@Override
	public String newRequest() {
		if (this.adaptee == null) {
			this.adaptee = new Adaptee();
		}
		return this.adaptee.oldRequest();
	}
		
}
