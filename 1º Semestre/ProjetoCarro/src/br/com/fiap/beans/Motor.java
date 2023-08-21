package br.com.fiap.beans;

public class Motor {
	// Visibilidade, tipo de dado e nome da váriavel
	private String marcaMotor;
	private double potencia;
	private int valvulas;
	private String tipoCambio;
	
	// Setters
	public void setMarcaMotor(String marcaMotor) {
		this.marcaMotor = marcaMotor;
	}
	
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public void setValvulas(int valvulas) {
		this.valvulas = valvulas;
	}
	
	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	// Getters
	public String getMarcaMotor() {
		return marcaMotor;
	}
	
	public double getPotencia() {
		return potencia;
	}
	
	public int getValvulas() {
		return valvulas;
	}
	
	public String  getTipoCambio() {
		return tipoCambio;
	}
}
