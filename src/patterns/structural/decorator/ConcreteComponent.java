package patterns.structural.decorator;

/**
 *	Esta es la clase concreta a la que se aplica el patron,
 *  o sea la clase a ser decorada e implementa la interfaz
 *  que contiene el metodo de utilidad. 
 */
public class ConcreteComponent implements ComponentIF {

	@Override
	public void action() {
		System.out.println("ConcreteComponent.action() called.");
	}

}
