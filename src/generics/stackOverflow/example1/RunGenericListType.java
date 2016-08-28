package generics.stackOverflow.example1;

import generics.stackOverflow.Class1;
import generics.stackOverflow.Class3;
import generics.stackOverflow.GeneralClass;

import org.springframework.util.CollectionUtils;

public class RunGenericListType {
	public static void main(String[] args) {
		GenericsListsType glt = new GenericsListsType();
		// Se indica si cada uno de los tipos pasados 
		// se recuperó de la lista principal.
		if (!CollectionUtils.isEmpty(glt.tomarEntidades(Class1.class))) {
			System.out.println("Class1 obtenido de Lista principal");
		}
		if (!CollectionUtils.isEmpty(glt.tomarEntidades(GeneralClass.class))) {
			System.out.println("GeneralClass obtenido de Lista principal");
		}
		if (!CollectionUtils.isEmpty(glt.tomarEntidades(Class3.class))) {
			System.out.println("Class3 obtenido de Lista principal");
		}
	}
}