package reflection.programcreek.example1;

import reflection.programcreek.Foo;

public class ReflectionHelloWorld {
	public static void main(String[] args) {		
		Foo f = new Foo();
		// Se muestra el nombre de la clase fqn.
	    System.out.println(f.getClass().getName());
	}
}
