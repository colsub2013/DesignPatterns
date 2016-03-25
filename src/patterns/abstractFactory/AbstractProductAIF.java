package patterns.abstractFactory;

/**
 *	Interfaz que contiene los metodos del objeto a crear.
 *
 *	-> Va a ser implementada por clases del objeto a crear (ProductA1 y ProductA2)
 *
 *	-> Va a ser implementada por el factory de creacion 
 *	   (AbstractProductAIF - Sus métodos de creacion devuelven objetos de este tipo)
 */
public interface AbstractProductAIF {
	public void actionA();
}