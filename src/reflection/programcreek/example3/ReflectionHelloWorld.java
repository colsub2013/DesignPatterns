package reflection.programcreek.example3;

import reflection.programcreek.Foo;

public class ReflectionHelloWorld {
	public static void main(String[] args) {
		Class<?> c = null;
		Foo f = null;
		try {
			// Se obtiene instancia Class a partir de FQN.
			c = Class.forName("reflection.programcreek.example1.Foo");
			// Se crea instancia "Foo" a partir de instancia Class.
			f = (Foo) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		f.print();
	}
}