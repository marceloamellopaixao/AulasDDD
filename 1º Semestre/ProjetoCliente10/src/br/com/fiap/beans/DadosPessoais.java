package br.com.fiap.beans;

public class DadosPessoais {
	private String rg;
	private String cpf;
	private String titulo;
	private String dataNasc;
	
	// Setters
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	// Getters
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDataNasc() {
		return dataNasc;
	}
}
