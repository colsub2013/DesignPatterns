package patterns.abstractFactory;

/**
 * 	Clase que representa objeto a crear.
 */
public class ProductB1 implements AbstractProductBIF {
	@Override
	public void actionB() {
		System.out.println("Action B through ProductB1 is invoked");
	}
}
