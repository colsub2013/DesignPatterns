package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 	Clase factory que tiene un metodo static que retorna 
 *  una referencia de una instancia de flyweight concreta.
 */
public class FlyweightFactory {
	
	private static Map map = new HashMap();
	
	public static FlyweightIF getFlyweight(String param) {
		
		FlyweightIF flyweight = null;
		if (map.containsKey(param)) {
			flyweight = (FlyweightIF) map.get(param);
		} else {
			flyweight = new ConcreteFlyweight(new State(true));
			map.put(param, flyweight);
			System.out.println(
				"Created flyweight " + param + " with state = true");
		}
		return flyweight;
	}
	
}
