package patterns.behavioural.interpreter;

/**
 *	2. Clase concreta que implementa la interfaz interprete,
 *  contiene una propiedad con un constructor con esa propiedad
 *  como argumento y la implementacion del metodo interprete 
 *  que devuelve un booleano segun cierta logica 
 */
public class AndExpression implements Expression {
	 
   private Expression expr1 = null;
   private Expression expr2 = null;

   public AndExpression(Expression expr1, Expression expr2) { 
      this.expr1 = expr1;
      this.expr2 = expr2;
   }

   @Override
   public boolean interpret(String context) {		
      return expr1.interpret(context) && expr2.interpret(context);
   }
}
