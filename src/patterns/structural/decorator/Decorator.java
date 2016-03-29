package patterns.structural.decorator;

/**
 * Este es el decorador en el cual metodo/s
 * es invocado con una instancia del componente concreto
 * el cual tiene una referencia a la interfaz del componente.
 */
public class Decorator implements ComponentIF {

	ComponentIF component = new ConcreteComponent();
	
	@Override
	public void action() {
		component.action();
	}
}
