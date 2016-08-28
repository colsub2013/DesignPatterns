package reflection.programcreek.example2;

import java.lang.reflect.Method;

import reflection.programcreek.Foo;

public class ReflectionHelloWorld {

	public static void main(String[] args) {
		Foo f = new Foo();
		Method method;
		try {
			// Se obtiene un metodo 'print' si es que existe.	
			method = f.getClass().getMethod("print", new Class<?>[0]);
			// En caso de encontrarse se ejecuta.
			method.invoke(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
