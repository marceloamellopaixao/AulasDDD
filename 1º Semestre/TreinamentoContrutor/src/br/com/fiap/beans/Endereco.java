package br.com.fiap.beans;

public class Endereco {
	
	// 
	private String logradouro;
	private int numero;
	private String cep;
	private String bairro;
	private String municipio;
	private String estado;
	
	// Metodo Construtor vazio
	public Endereco() {
		super();
	}
	
	// Metodo Contrutor Cheio
	public Endereco(String logradouro, int numero, String cep, String bairro, String municipio, String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
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

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getBairro() {
		return bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getEstado() {
		return estado;
	}	
}
