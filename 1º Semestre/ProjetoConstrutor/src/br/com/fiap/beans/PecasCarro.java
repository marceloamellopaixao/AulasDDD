package br.com.fiap.beans;

public class PecasCarro {
	// Visibilidade, Tipo de Dados e o nome da váriavel
	private String motor;
	private String combustivel;
	private String roda;

	// Método Construtor Vazio
	public PecasCarro() {
		super();
	}
	
	// Método Construtor Cheio
	public PecasCarro(String motor, String combustivel, String roda) {
		super();
		this.motor = motor;
		this.combustivel = combustivel;
		this.roda = roda;
	}
	
	// Setters
	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}
	
	// Getters
	public String getMotor() {
		return motor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public String getRoda() {
		return roda;
	}
	
}
