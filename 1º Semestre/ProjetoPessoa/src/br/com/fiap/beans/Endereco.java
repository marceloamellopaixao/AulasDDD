package br.com.fiap.beans;

public class Endereco {
	// Visibilidade, tipo de dado e variavel
	private String logradouro;
	
	// Sobre carga
	
	// Metodo Construtor vazio
	public Endereco() {
		super();
	}
	
	// Metodo Construtor Cheio
	public Endereco(String logradouro) {
		super();
		this.logradouro = logradouro;
	}

	// Setters
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	// Getters
	public String getLogradouro() {
		return logradouro;
	}
	
}
