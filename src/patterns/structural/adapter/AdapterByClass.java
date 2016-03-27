package patterns.structural.adapter;

/**
 *	Clase que al adaptar por clase utiliza subclassing
 *  del adaptee (ademas de implementar interfaz target)
 *  Contiene metodo que invoca al metodo del adaptee 
 */
public class AdapterByClass extends Adaptee implements TargetIF {

	public AdapterByClass() {
		System.out.println("AdapterByClass constructed.");
	}

	@Override
	public String newRequest() {
		return this.oldRequest();
	}

}
