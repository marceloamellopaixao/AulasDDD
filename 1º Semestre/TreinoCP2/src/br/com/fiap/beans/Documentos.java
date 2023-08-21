package br.com.fiap.beans;

public class Documentos {
	private String rg;
	private String cpf;
	private String sus;
	private String pis;
	private String tituloEleitor;

	// Setters
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSus(String sus) {
		this.sus = sus;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	
	// Getters
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSus() {
		return sus;
	}
	public String getPis() {
		return pis;
	}
	public String getTituloEleitor() {
		return tituloEleitor;
	}
}
