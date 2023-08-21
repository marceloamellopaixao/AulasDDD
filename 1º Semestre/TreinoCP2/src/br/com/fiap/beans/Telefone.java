package br.com.fiap.beans;

public class Telefone {
	private String telFixo;
	private String telCelular;
	private String telComercial;
	private String telContato;
	
	// Setters
	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}
	public void setTelComercial(String telComercial) {
		this.telComercial = telComercial;
	}
	public void setTelContato(String telContato) {
		this.telContato = telContato;
	}
	
	// Getters
	public String getTelFixo() {
		return telFixo;
	}
	public String getTelCelular() {
		return telCelular;
	}
	public String getTelComercial() {
		return telComercial;
	}
	public String getTelContato() {
		return telContato;
	}
}
