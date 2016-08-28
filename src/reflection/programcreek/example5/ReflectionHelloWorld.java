package reflection.programcreek.example5;

import java.lang.reflect.Array;

public class ReflectionHelloWorld {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		int[] newIntArray = (int[]) changeArraySize(intArray, 10);
		print(newIntArray);
		String[] atr = { "a", "b", "c", "d", "e" };
		String[] str1 = (String[]) changeArraySize(atr, 10);
		print(str1);
	}

	// Cambio del tamaño de array.
	public static Object changeArraySize(Object obj, int len) {
		// Se obtiene instancia Class a partir de un array
		// Varía en que consulta tipo de componente.
		Class<?> arr = obj.getClass().getComponentType();
		
		// Se crea instancia del array como Object 
		// pasando instancia de Class y un tamaño.
		Object newArray = Array.newInstance(arr, len);
		
		// Se obtiene tamaño del array 
		int co = Array.getLength(obj);
		// Se copia array y se retorna.
		System.arraycopy(obj, 0, newArray, 0, co);
		return newArray;
	}
	
	// Se pueden pasar tanto primitivas de array de Objetos
	// como de String.
	public static void print(Object obj) {
		// Se obtiene instancia Class a partir de Object.
		Class<?> c = obj.getClass();
		// Si no es un array no se hace nada.
		if (!c.isArray()) {
			return;
		}
		
		// Se itera el array y se imprime contenido.
		System.out.println("\nArray length: " + Array.getLength(obj));
		for (int i = 0; i < Array.getLength(obj); i++) {
			System.out.print(Array.get(obj, i) + " ");
		}
	}

}
