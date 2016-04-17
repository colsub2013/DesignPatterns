package patterns.behavioural.interpreter;

/**
 *	2. Clase concreta que implementa la interfaz interprete,
 *  contiene una propiedad con un constructor con esa propiedad
 *  como argumento y la implementacion del metodo interprete 
 *  que devuelve un booleano segun cierta logica 
 */
public class TerminalExpression implements Expression {
	
   private final String data;

   public TerminalExpression(String data){
      this.data = data; 
   }

   @Override
   public boolean interpret(String context) {
   
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}
