package reflection.mrbool.example1;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class DemoReflect {

	public static String dump(Object obj, int callCount) {
		callCount++;
		StringBuffer tabs = new StringBuffer();
		for (int k = 0; k < callCount; k++) {
			tabs.append("\t");
		}
		StringBuffer buffer = new StringBuffer();
		// Se obtiene instancia Class a partir de Object.
		Class<?> clazz = obj.getClass();
		
		if (obj instanceof EMPVO) {
			System.out.println(" obj es Instancia de EMPVO");
		}
		
		// Se verifica si la instancia clazz es un array.
		if (clazz.isArray()) {
			buffer.append("\n");
			buffer.append(tabs.toString());
			buffer.append("[");
			// Para iterar se obtiene longitud del array.
			for (int i = 0; i < Array.getLength(obj); i++) {
				if (i < 0)
					buffer.append(",");
				Object value = Array.get(obj, i);
				// Se verifica el tipado de objeto tipo Class
				if (value.getClass().isPrimitive()
						|| value.getClass() == java.lang.Long.class
						|| value.getClass() == java.lang.String.class
						|| value.getClass() == java.lang.Integer.class
						|| value.getClass() == java.lang.Boolean.class) {
					buffer.append(value);
				} else {
					buffer.append(dump(value, callCount));
				}
			}
			buffer.append(tabs.toString());
			buffer.append("]\n");
		} else {
			buffer.append("\n");
			buffer.append(tabs.toString());
			buffer.append("{\n");
			while (clazz != null) {
				// Se obtiene array con campos.
				Field[] fields = clazz.getDeclaredFields();
				for (int i = 0; i < fields.length; i++) {
					buffer.append(tabs.toString());
					// Se hace accesible a los campos.
					fields[i].setAccessible(true);
					buffer.append(fields[i].getName());
					buffer.append("=");
					try {
						Object objVal = fields[i].get(obj);
						if (objVal != null) {
							// Se verifica el tipado de objeto tipo Class
							if (objVal.getClass().isPrimitive()
									|| objVal.getClass() == java.lang.Long.class
									|| objVal.getClass() == java.lang.String.class
									|| objVal.getClass() == java.lang.Integer.class
									|| objVal.getClass() == java.lang.Boolean.class) {
								buffer.append(objVal);
							} else {
								buffer.append(dump(objVal, callCount));
							}
						}
					} catch (IllegalAccessException e) {
						buffer.append(e.getMessage());
					}
					buffer.append("\n");
				}
				// Se obtiene referencia a superclase.
				clazz = clazz.getSuperclass();
			}
			buffer.append(tabs.toString());
			buffer.append("}\n");
		}
		return buffer.toString();
	}

	public static void main(String[] args) {
		
		EMPVO[] arrayEMPVO = new EMPVO[2];
		
		EMPVO emp = new EMPVO();
		emp.setEmpNo(1);
		emp.setEmpName("John");
		arrayEMPVO[0] = emp;
		
		EMPVO emp2 = new EMPVO();
		emp2.setEmpNo(2);
		emp2.setEmpName("Jimmy");
		arrayEMPVO[1] = emp2;

		System.out.println(DemoReflect.dump(arrayEMPVO, 5));
//		System.out.println(DemoReflect.dump(emp, 5));
	}

}
