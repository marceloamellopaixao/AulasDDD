package br.com.fiap.beans;

public class Endereco {
	// Visibilidade, Tipo de Dado e Nome da Variável
	private String logradouro;
	private int numero;
	private String cep;
	
	public Endereco() {
		super();
	}
	
	public Endereco(String logradouro, int numero, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}

	// Setters
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	// Getters
	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getCep() {
		return cep;
	}
}
