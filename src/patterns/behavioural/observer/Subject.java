package patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *	2. Clase sujeto que tiene 2 propiedades, una lista de objetos Observer vacia
 *	y un estado numerico, para el que se tiene un getter y un setter, el setter
 *	ademas llama a un metodo que itera la lista de observers e invoca
 *	a metodos de actualizacion declarados en la clase abstracta observer.
 *	Hay otro metodo para agregar objetos a la lista 
 */
public class Subject {
	
   private final List<Observer> observers = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}
