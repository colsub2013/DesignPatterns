package patterns.structural.facade;

/**
 *	Se crea clase facade la cual por instanciacion de 
 *	uno o mas sub-sistemas invoca metodos con logica
 *	correspondiente
 */
public class Facade {
	public void action() {
		SubSystem1 subsys1 = new SubSystem1();
		subsys1.function1A();
		subsys1.function1B();
		subsys1.function1C();
		SubSystemN subsysN = new SubSystemN();
		subsysN.functionN1();
		subsysN.functionN2();
	}
}
