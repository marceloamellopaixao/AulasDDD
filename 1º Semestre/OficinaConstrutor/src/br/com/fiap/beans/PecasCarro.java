package br.com.fiap.beans;

public class PecasCarro {
	// Visibilidade, Tipo de Dados e o Nome da variável.
	private String motor;
	private String combustivel;
	private String rodas;
	
	// Construtor vazio
	public PecasCarro() {
		super();
	}
	
	// Construtor Cheio
	public PecasCarro(String motor, String combustivel, String rodas) {
		super();
		this.motor = motor;
		this.combustivel = combustivel;
		this.rodas = rodas;
	}

	public String getMotor() {
		return motor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public String getRodas() {
		return rodas;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public void setRodas(String rodas) {
		this.rodas = rodas;
	}
	
	
}
