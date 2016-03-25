package patterns.abstractFactory;

/**
 *	Interfaz que contiene los metodos del objeto a crear.
 *
 *	-> Va a ser implementada por clases del objeto a crear (ProductB1 y ProductB2)
 *
 *	-> Va a ser implementada por el factory de creacion 
 *	   (AbstractProductBIF - Sus métodos de creacion devuelven objetos de este tipo)
 */
public interface AbstractProductBIF {
	public void actionB();
}