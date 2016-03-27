package patterns.structural.composite;

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
