package patterns.behavioural.command;

/**
 *	3. Se crea clase comando abstracta que contiene la declaracion del metodo 
 *  de ejecucion a ser implementado por el comando concreto y el invocador
 */
abstract class CommandAbstract {
	public abstract void execute();
}