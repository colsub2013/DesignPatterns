package patterns.behavioural.command;

/**
 *	2. Se crea clase commando 1 que implementa 
 *  interfaz receptor y contiene metodos con logica de utilidad 
 */
public class Command1 implements ReceiverIF {
	@Override
	public void action() {
		System.out.println("Command1.action() called.");
	}
}
