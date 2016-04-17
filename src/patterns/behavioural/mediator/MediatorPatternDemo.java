package patterns.behavioural.mediator;

/**
 * 	COMPORTAMIENTO - Objetivo:
 *	
 *	Definir un objeto que encapsula como interactua un set de objetos
 *  (acoplamiento desajustado evitando que los objetos se refieren el 
 *  uno al otro explicitamente, permitiendo que cualquier interaccion
 *  varie independientemente)
 *  
 *	Descacopla colegas
 *
 * 	Simplifica protocolos de objeto
 * 
 *  Centraliza el control
 *  
 *  Los componentes individuales son mas faciles de tratar ya que no 
 *  necesitan pasarse mensajes
 *  
 *  Los componentes no necesitan contener logica para tratar con su 
 *  intercomunicacion y asi son mas genericos
 *
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	- Un set de objetos se comunica en maneras complejas pero bien definidas
 *
 *  - Se requiere comportamiento personalizado distribuido entre varios objetos
 *    sin subclases. Esto se usa en sistemas basados en mensaje. Los mensajes 
 *    mismos son los medios por los cuales son desacoplados los objetos relacionados
 *
 * *********************************************************************
 * 	Forma de armarlo:
 * 
 *	1. Se crea clase concreta que contiene un metodo estatico 
 *	con la logica de negocio y toma un objeto creado como argumento 
 *
 * 	2. Se crea un objeto que contiene una propiedad con getter, setter 
 *  y constructor y un metodo que invoca al metodo estatico de la clase concreta
 *
 *  En el main:
 *  
 *  - Crear objetos de clase concreta con constructor con argumentos
 *  
 *  - Con los objetos creados se usa un metodo que envia los mensajes 
 *    de la clase concreta 
 * *********************************************************************
 */
public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}
