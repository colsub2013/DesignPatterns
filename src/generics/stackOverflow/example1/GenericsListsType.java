package generics.stackOverflow.example1;

import generics.stackOverflow.Class1;
import generics.stackOverflow.Class2;
import generics.stackOverflow.GeneralClass;

import java.util.ArrayList;
import java.util.List;

public class GenericsListsType {
	
	List<GeneralClass> gcList = new ArrayList<GeneralClass>();
	
	// Esta lista principal contiene un almacén de objetos tipados
	// que extienden de una superclase y de la misma superclase.
	public GenericsListsType() {
		super();
		gcList.add(new GeneralClass());
		gcList.add(new Class1());
		gcList.add(new Class2());
	}

	// Se devuelve entidad tomada de la lista principal
	// en caso de que se encuentre ese tipo.
	public <T extends Object> List<T> tomarEntidades(Class<T> clazz) {
	  List<T> result = new ArrayList<T>();
	  // Se itera lista principal.
	  for (GeneralClass  entity : gcList) {
		  // Se chequea si la clase pasada está en la lista principal.
		  if (entity.getClass() == clazz) {
			  // Se recupera objeto de clase pasada en caso de coincidir.
		      result.add((T) entity);
		  } 
	  }	  
	  return result;
	}
}
