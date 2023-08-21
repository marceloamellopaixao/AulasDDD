package br.com.semeamos.beans;

public class Contato {

	private String telefone, celular, email;

	public Contato() {
		super();
	}

	public Contato(String telefone, String celular, String email) {
		super();
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public String getCelular() {
		return celular;
	}

	public String getEmail() {
		return email;
	}
	
}
