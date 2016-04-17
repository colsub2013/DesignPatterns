package patterns.behavioural.interpreter;

/**
 *	1. Interfaz interprete que declara un metodo
 *  interprete 
 */
public interface Expression {
	public boolean interpret(String context);
}
