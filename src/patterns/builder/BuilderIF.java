package patterns.builder;

/**
 * Interfaz que sera implementada por el builder concreto
 * el cual provee metodos para la construccion y obtencion
 * de/l builder/s a crear
 */
public interface BuilderIF {
	public void buildProduct();
	public ProductIF getProduct();
}