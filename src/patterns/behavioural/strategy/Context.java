package patterns.behavioural.strategy;

/**
 *	3. Clase contexto que contiene referencia a la interfaz de estrategia
 *	que se usa en el constructor, y contiene otro metodo que invoca al
 *	metodo declarado en la interfaz de estrategia. 
 */
public class Context {

	StrategyIF strategy;

	public Context(StrategyIF parm) {
		this.strategy = parm;
	}
	
	public void contextInterface(String parm) {
		strategy.algorithmInterface(parm);
	}
	
}
