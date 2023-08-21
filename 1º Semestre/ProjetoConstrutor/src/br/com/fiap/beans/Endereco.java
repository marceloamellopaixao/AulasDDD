package br.com.fiap.beans;

public class Endereco {
	// Visibilidade, Tipo de Dados e o nome da váriavel
	private String logradouro;
	private int numero;
	private String cep;
	
	// Método Construtor Vazio
	public Endereco(){
		super();
	}
	
	// Método Construtor Cheio
	public Endereco(String logradouro, int numero, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}

	// Setters (Entrada de Dados)
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	// Getters (Saída de Dados)
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
