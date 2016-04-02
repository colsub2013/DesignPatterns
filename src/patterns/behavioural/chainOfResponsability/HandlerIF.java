package patterns.behavioural.chainOfResponsability;

/**
 *	2. Interfaz para procesar la peticion,
 *	declara un metodo que toma como argumento
 *	al objeto Request el cual procesara
 */
public interface HandlerIF {
	public void processRequest(Request request);
}
