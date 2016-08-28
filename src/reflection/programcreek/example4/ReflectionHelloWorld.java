package reflection.programcreek.example4;

import java.lang.reflect.Constructor;

import reflection.programcreek.Foo;

public class ReflectionHelloWorld {
	public static void main(String[] args) {
		Class<?> c = null;
		Foo f1 = null;
		Foo f2 = null;
		try {
			// Se crea instancia Class a partir de FQN.
			c = Class.forName("reflection.programcreek.Foo");
			// Se obtienen todos los constructores.
			Constructor<?> cons[] = c.getConstructors();
			// Se obtienen instancias a partir de constructores.
			// Ojo con el CASTING!
			f1 = (Foo) cons[0].newInstance();
			f2 = (Foo) cons[1].newInstance("def");
		} catch (Exception e) {
			e.printStackTrace();
		}
		f1.printExpression();
		f2.printExpression();

	}
}
