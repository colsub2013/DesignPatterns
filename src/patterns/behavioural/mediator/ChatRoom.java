package patterns.behavioural.mediator;

import java.util.Date;

/**
 *	1. Se crea clase concreta que contiene un metodo estatico 
 *	con la logica de negocio y toma un objeto creado como argumento 
 */
public class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}