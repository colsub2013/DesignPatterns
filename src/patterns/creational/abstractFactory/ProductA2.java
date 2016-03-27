package patterns.creational.abstractFactory;

/**
 * 	Clase que representa objeto a crear.
 */
public class ProductA2 implements AbstractProductAIF {
	@Override
	public void actionA() {
		System.out.println("Action A through ProductA2 is invoked");
	}
}
