package patterns.behavioural.interpreter;

/**
 * 	http://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm	
 * 
 * 	COMPORTAMIENTO - Objetivo:
 * 	
 * 	Define una representacion de la gramatica de un lenguaje dado, junto con
 *  un interprete que usa esta representacion para interpretar sentencias 
 *  del lenguaje
 * 
 * 	- La gramatica es facil de cambiar y extender
 * 
 *  - Es directo implementar la gramatica
 * 	
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	- Gramatica de lenguaje no complicada
 *
 *  - La eficiencia no es prioridad
 *
 * *********************************************************************
 * 	Forma de armarlo:
 * 
 *	1. Interfaz interprete que declara un metodo interprete
 *
 *	2. Clase concreta que implementa la interfaz interprete, contiene una propiedad 
 *  con un constructor con esa propiedad como argumento y la implementacion del 
 *  metodo interprete que devuelve un booleano segun cierta logica 
 * 
 * 	En el main:
 * 
 *  - Se crean 2 metodos static que instancian objetos de la clase concreta
 *    con referencia a la interfaz de expresion y retornan una instancia
 *    de una 3ra clase concreta
 *    
 *  - En el metodo main se llaman a los metodos correspondientes de interpretacion
 *    segun los objetos creados en el punto anterior.  
 *	
 * *********************************************************************
 */
public class InterpreterPatternDemo {

   //Rule: Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }

   //Rule: Julie is a married women
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
   }
}
