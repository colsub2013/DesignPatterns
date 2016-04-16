package patterns.behavioural.strategy;

/**
 *	2. Clases concretas que implementan metodos
 *	de interfaz de estrategia con logica de operacion 
 */
public class ConcreteStrategy1 implements StrategyIF {

	@Override
	public void algorithmInterface(String parm) {
		System.out.println(parm.toUpperCase());
	}
	
}
