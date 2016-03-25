package patterns.abstractFactory;

/**
 * 	Clase que representa objeto a crear.
 */
public class ProductB2 implements AbstractProductBIF {
	@Override
	public void actionB() {
		System.out.println("Action B through ProductB2 is invoked");
	}
}
