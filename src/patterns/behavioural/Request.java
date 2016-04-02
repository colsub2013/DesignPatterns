package patterns.behavioural;

/**
 *	1. Primero se crea una clase peticion que 
 *	tiene un getter de una propiedad y logica sobre el
 *	valor que debe tener esa propiedad en el constructor 
 */
public class Request {
	
	public static final int EQUITY_ORDER = 100;
	public static final int BOND_ORDER = 200;
	
	private int type;

	public Request(int type) throws Exception {
		if ((type == EQUITY_ORDER) || (type == BOND_ORDER)) {
			this.type = type;
		} else {
			throw new Exception("Unknown request type " + type + "."); 
		}
	}

	public int getType() {
		return type;
	}
	
}