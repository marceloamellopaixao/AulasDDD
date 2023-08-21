package br.com.semeamos.beans;

public class Conta {

	private Contato contato;
	private Endereco endereco;
	private Login login;
	
	public Conta() {
		super();
	}

	public Conta(Contato contato, Endereco endereco, Login login) {
		super();
		this.contato = contato;
		this.endereco = endereco;
		this.login = login;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	public Contato getContato() {
		return contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Login getLogin() {
		return login;
	}
	
}
