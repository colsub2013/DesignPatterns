package patterns.structural.adapter;


/**
 *	Clase que contiene un metodo y un constructor 
 *	que es aquella que contiene informacion util 
 *  (a adaptar) 
 */
public class Adaptee {

	public Adaptee() {
		System.out.println("Adaptee constructed.");
	}
	
	public String oldRequest() {
		return "Adaptee.oldRequest() called.";
	}
	
}
