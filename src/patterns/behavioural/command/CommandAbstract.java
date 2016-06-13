package patterns.behavioural.command;

/**
 *	3. Se crea clase commando abstracta que contiene la declaracion del metodo 
 *  de ejecucion a ser implementado por el commando concreto y el invocador
 */
abstract class CommandAbstract {
	public abstract void execute();
}