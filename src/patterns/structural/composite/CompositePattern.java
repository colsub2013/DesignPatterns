package patterns.structural.composite;

/**
 * 	ESTRUCTURAL - Objetivo:
 * 	
 * 	Permite a clientes operar de manera generica sobre objetos
 *
 *	Define jerarquias de clase consistentes de objetos primitivo y complejo
 *
 * 	Provee flexibilidad de estructura con una interfaz manejable
 * 
 * *********************************************************************
 *	Usar en casos de:
 *	
 *	Representar una jerarquia de objetos total o parcial
 *
 *	Clientes capaces de ignorar diferencias entre objetos variantes en la
 *	jerarquia
 *
 *	Estructura dinamica con cualquier nivel de complejidad
 * 
 * *********************************************************************
 * 	Forma de armarlo:
 * 
 * 	Crear una clase abstracta componente con algun metodo abstracto 
 *  y los demas no abstractos
 *  (Component)
 *  
 *  Crear una clase Composite (compuesto) que extienda la clase abstracta componente
 *  e implemente todos los metodos declarados en esta
 *  (Composite)
 *  
 *  Crear una clase Leaf que extiende la clase abstracta componente y redefine
 *  solo ciertos metodos necesarios de esa clase (no es obligatorio redefinir todos
 *  los metodos no abstractos de la clase componente). 
 *  Esta clase contiene la estructura.
 *  (Leaf)
 *  	
 * 	En el main, se instancian por ejemplo ciertos componentes en la estructura de un arbol 
 *  mediante referencias a la clase componente e instancias de objetos tanto a la estructura 
 *  como al composite, y se usan metodos redefinidos del composite para agregarlos o removerlos
 *	
 * *********************************************************************
 */
public class CompositePattern {

	public static void main(String[] args) {
		
		// Crea hojas (leaves)
		Component leaf1 = new Leaf(" leaf#1");
		Component leaf2 = new Leaf(" leaf#2");
		Component leaf3 = new Leaf(" leaf#3");
		
		// Crea ramas (branches)
		Component branch1 = new Composite(" branch1"); 
		Component branch2 = new Composite(" branch2"); 
		
		// Crea tronco (trunk)
		Component trunk = new Composite("trunk");
		
		// Agrega leaf1 y leaf2 a branch1
		branch1.add(leaf1);
		branch1.add(leaf2);
		
		// Agrega branch1 a trunk
		trunk.add(branch1);
		
		// Agrega leaf3 a branch2
		branch2.add(leaf3);
		
		// Agrega branch2 a trunk
		trunk.add(branch2);
		
		// Composicion del tronco
		System.out.println("Displaying trunk composition:");
		trunk.display();
		
		// Quita branch1 y branch2 a trunk
		trunk.remove(branch1);
		trunk.remove(branch2);
		
		// Muestra composicion del tronco ahora
		System.out.println("Displaying trunk composition now");
		trunk.display();
		
	}

}
