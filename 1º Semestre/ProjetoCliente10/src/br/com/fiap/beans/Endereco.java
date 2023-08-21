package br.com.fiap.beans;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String Municipio;
	private String Estado;
	private String cep;
	

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
		Municipio = municipio;
	}
	public void setEstado(String estado) {
		Estado = estado;
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
		return Municipio;
	}
	public String getEstado() {
		return Estado;
	}
	public String getCep() {
		return cep;
	}
	
}
