package reflection.javatpoint;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPI {
	public static void main(String[] args) {

		try {
			// Class Loader.
			Class<?> clazz = Class.forName("reflection.javatpoint.PruebaBean");

			// Nombre fqn de clase.
			System.out.println("Class Name: " + clazz.getName());
			
			// Se crea instancia y se ejecuta un método.
			// Si el objeto no tiene constructor sin argumentos
			// arroja una excepción InstantiationException
			PruebaBean pb = (PruebaBean) clazz.newInstance();
			// Se ejecuta método del objeto.
			pb.print();
			
			// ¿Es interfaz?
			System.out.println("¿Es interfaz?: " + clazz.isInterface());

			// ¿Es array?
			System.out.println("¿Es array?: " + clazz.isArray());
			
			// ¿Es primitiva?
			System.out.println("¿Es primitiva?: " + clazz.isPrimitive());
			
			// Se obtiene superclase.
			System.out.println("Superclase: " + clazz.getSuperclass().getName());
			 
			// Se obtiene lista de campos y se iteran sus nombres.
			Field[] fields = clazz.getDeclaredFields();
			if (fields != null) {
				int countF = 0;
				for (Field field : fields) {
					System.out.println("Campo " + countF++ + " : "  + field.getName());
				}
			}
			
			// Se obtiene lista de métodos y se iteran sus nombres.
			Method[] methods = clazz.getDeclaredMethods();
			if (methods != null) {
				int countM = 0;
				for (Method method : methods) {
					System.out.println("Método " + countM++ + " : " + method.getName());
				}
			}
			
			// Se obtiene un método particular y se ejecuta.
			Method method = clazz.getDeclaredMethod("print", new Class<?>[0]);
			method.invoke(pb, null);
			
		} catch (InstantiationException | IllegalAccessException | 
			ClassNotFoundException | NoSuchMethodException | SecurityException | 
			IllegalArgumentException | InvocationTargetException e ) {
			e.printStackTrace();
		}
	}
}
