package br.com.fiap.modelo;

public class Endereco {
	// Variáveis
	private String logradouro;
	private int numero;
	private String bairro;
	private String municipio;
	private String estado;
	
	// Setters
	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	
	public void setMunicipio(String municipio){
		this.municipio = municipio;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	// Getters
	public String getLogradouro(){
		return logradouro;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public String getBairro(){
		return bairro;
	}
	
	public String getMunicipio(){
		return municipio;
	}
	
	public String getEstado(){
		return estado;
	}
}
