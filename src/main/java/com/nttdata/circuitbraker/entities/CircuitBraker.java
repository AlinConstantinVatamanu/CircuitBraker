package com.nttdata.circuitbraker.entities;

public class CircuitBraker {
	
	private int intentosFallados;
	private int intentosOk;
	private int limiteError;
	
	public CircuitBraker(int intentosFallados, int intentosOk, int limiteError) {
		this.intentosFallados = intentosFallados;
		this.intentosOk = intentosOk;
		this.limiteError = limiteError;
	}
	
	public String getStatus() {
		String status = null;
		int total = intentosFallados + intentosOk;
		int limiteFallos = (total * limiteError) /100; 
		if (intentosFallados == 0) {
			status = "CLOSED";
		}
		else if (intentosFallados > limiteFallos) {
			status = "OPEN";
		}
		else 
			status = "HALF-OPEN";
		
		return status;
	}
	

}
