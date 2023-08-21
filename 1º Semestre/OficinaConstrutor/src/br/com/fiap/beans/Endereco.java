package br.com.fiap.beans;

public class Endereco {
	// Visibilidade, Tipo de Dados e o Nome da variável.
	private String logradouro;
	private int numero;
	private String bairro;
	private String municipio;
	private String estado;
	private String cep;
	
	
	// Metodo Construtor vazio
	public Endereco() {
		super();
	}

	// Metodo Construtor Cheio
	public Endereco(String logradouro, int numero, String bairro, String municipio, String estado, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.cep = cep;
	}

	// Setters
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getBairro() {
		return bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}
}
