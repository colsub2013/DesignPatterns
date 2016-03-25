package patterns.abstractFactory;

/**
 * 	Clase que representa objeto a crear.
 */
public class ProductA1 implements AbstractProductAIF {
	@Override
	public void actionA() {
		System.out.println("Action A through ProductA1 is invoked");
	}
}
