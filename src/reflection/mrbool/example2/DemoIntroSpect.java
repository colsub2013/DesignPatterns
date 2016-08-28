package reflection.mrbool.example2;

import java.lang.reflect.Method;

public class DemoIntroSpect {
	public static void main(String[] args) {
		try {
		  // Se obtiene instancia de Class a partir de fqn del objeto.
	      Class<?> clazz = Class.forName("reflection.mrbool.example1.EMPVO");
	      // Se obtienen métodos del objeto (incluyendo los heredados de Object)
	      Method [] methods = clazz.getMethods();
	      for (Method method : methods) {
	        System.out.println("Method Name = " +method.getName());
	      }
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    }
	}
}
