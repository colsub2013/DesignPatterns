package threads.dto;

import java.util.Date;

/**
 *	DTO que simula una carga costosa de cada elemento creado. 
 */
public class CargaDTO {
	
	private double random;
	private String carga;
	private Date fechaActual;
	
	public double getRandom() {
		return random;
	}

	public void setRandom(double random) {
		this.random = random;
	}

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	public Date getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}

	public CargaDTO(double random, String carga, Date fechaActual) {
		super();
		// Operacion costosa.
		int count = 500000;
		do {
			count--;
		} while (count > 0);
		this.random = random;
		this.carga = carga;
		this.fechaActual = fechaActual;
	}
	
}
