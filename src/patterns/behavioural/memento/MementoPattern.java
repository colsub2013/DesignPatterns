package patterns.behavioural.memento;

/**
 * 	COMPORTAMIENTO - Objetivo:
 *	
 *	Captura e internaliza el estado interno de un objeto tal que los objetos
 *	puedan ser restaurados luego a este estado
 *
 * 	Preserva limites de encapsulacion
 * 	
 * 	Simplifica el originador	
 * 	
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Snapshot que contiene info respecto al estado de un objeto puede
 *	almacenarse tal que pueda restaurarse al estado completo usando 
 *	la info del snapshot posteriormente
 *	
 *	Interfaz directa para obtener el estado deberia imponer detalles de 
 *	implementacion que romperian las reglas de encapsulacion de objeto
 *
 * *********************************************************************
 * 	Forma de armarlo:
 * 
 *  1. Clase memento plantilla con 2 propiedades al estilo POJO con constructor con 
 *  argumentos para almacenar estado 
 * 
 *  2. Clase originador que contiene las propiedades que seran almacenadas por medio 
 *  de la clase memento. Las creaciones y getters de memento para esas propiedades 
 *  son en conjunto en tanto que los setters son propios de cada propiedad
 *	
 *  3. La clase caretaker contiene la una posible secuencia de uso de este patron:
 *  
 *	- Se crea instancia originador y se fijan ciertos valores a sus propiedades
 *	- Con la instancia originador se crea el memento
 * 	- Se fijan valores nuevos para las propiedades del originador
 * 	- Con la instancia originador se recobra el memento
 * 
 * 	4. En el main, se corre el metodo static del caretaker
 *
 * *********************************************************************
 */
public class MementoPattern {
	public static void main(String[] args) {
		Caretaker.run();
	}
}