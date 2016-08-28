package reflection.javatpoint;

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
			 

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e ) {
			e.printStackTrace();
		}
	}
}
