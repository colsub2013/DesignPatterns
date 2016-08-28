package generics.stackOverflow.example2;

import generics.stackOverflow.Class1;

public class Tiping {

	public static void main(String[] args) 
		throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		foo(String.class);
		foo(int.class);
		foo(java.math.BigDecimal.class);
		foo(Class1.class);
	}

	// Procesamiento diferenciado según el tipo que se le pasa.
	private static void foo(Class<?> cls) 
		throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		if (cls == String.class) {
			System.out.println("String type.");
		} else if (cls == int.class) {
			System.out.println("int type.");
		} else if (cls == java.math.BigDecimal.class) {
			System.out.println("java.math.BigDecimal type.");
		} else if (cls == Class1.class) {
			System.out.println("Class1 type.");
			Class1 class1 = (Class1) cls.newInstance();
			class1.print();
		}
	}

}
