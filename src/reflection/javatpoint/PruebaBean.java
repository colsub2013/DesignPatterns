package reflection.javatpoint;

public class PruebaBean {

	private int campoint;
	private String campoString;
	
	public PruebaBean() {
		super();
	}

	public PruebaBean(int campoint, String campoString) {
		super();
		this.campoint = campoint;
		this.campoString = campoString;
	}
	
	public int getCampoint() {
		return campoint;
	}
	public void setCampoint(int campoint) {
		this.campoint = campoint;
	}
	public String getCampoString() {
		return campoString;
	}
	public void setCampoString(String campoString) {
		this.campoString = campoString;
	}
	
	public void print() {
		System.out.println("Printing a test.");
	}

}
