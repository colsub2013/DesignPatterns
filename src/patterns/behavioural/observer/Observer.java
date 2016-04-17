package patterns.behavioural.observer;

/**
 *	1. Se crea clase abstracta sujeto que contiene una propiedad 
 *  tipo sujeto y un metodo abstracto de actualizacion 
 */
public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}
