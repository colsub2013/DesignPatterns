package patterns.structural.flyweight;


/**
 *	Clase que contiene la implementacion del metodo 
 *  al que se aplicara el patron 
 */
public class ConcreteFlyweight implements FlyweightIF {
	
	private boolean state;
	
	public ConcreteFlyweight(State state) {
		this.state = state.isState();
	}
	
	@Override
	public void action(State state) {
		System.out.println(
			"ConcreteFlyweight.action(" + state.isState() + ") called.");
		this.state = state.isState();
		System.out.println("ConcreteFlyweight.state = " + this.state);
	}

}