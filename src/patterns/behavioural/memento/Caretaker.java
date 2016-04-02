package patterns.behavioural.memento;

/**
 *	3. La clase caretaker contiene la una posible secuencia 
 *	de uso de este patron:
 *	- Se crea instancia originador y se fijan ciertos valores a sus propiedades
 *	- Con la instancia originador se crea el memento
 * 	- Se fijan valores nuevos para las propiedades del originador
 * 	- Con la instancia originador se recobra el memento
 */
public class Caretaker {
	public static void run() {
		// Crea originador y fija valores.
		System.out.println("Creating originator and setting initial values.");
		Originator originator = new Originator();
		originator.setState(true);
		originator.setName("The Originator");
		System.out.println(originator);
		
		// Crea memento
		System.out.println("Creating memento.");
		Memento memento = originator.createMemento();
		
		// Cambia valores del originador
		System.out.println("Changing originator values.");
		originator.setState(false);
		originator.setName("To be undone.");
		System.out.println(originator);
		
		// Recobra el estado del memento
		System.out.println("Recovering originator values from memento.");
		originator.recoverFromMemento(memento);
		System.out.println(originator);
	}
}
