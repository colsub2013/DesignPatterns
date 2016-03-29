package patterns.structural.decorator;

/**
 *	Este es el decorador concreto, que extiende la clase que tiene 
 *  el metodo de utilidad, en este caso el decorado es declarando 
 *  y definiendo una variable de instancia. 
 */
public class ConcreteDecorator extends Decorator {
	
	String addedVariable;
	
	@Override
	public void action() {
		super.action();
		System.out.println("ConcreteDecorator.action() called.");
		addedVariable = "extra";
		System.out.println("ConcreteDecorator.addedVariable= " + this.addedVariable);
	}
	
}
