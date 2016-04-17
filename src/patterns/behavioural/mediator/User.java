package patterns.behavioural.mediator;

/**
 * 	2. Se crea un objeto que contiene una propiedad con getter, setter 
 *  y constructor y un metodo que invoca al metodo estatico de la clase concreta
 */
public class User {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

   public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
}
