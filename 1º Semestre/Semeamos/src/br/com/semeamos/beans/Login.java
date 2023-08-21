package br.com.semeamos.beans;

public class Login {

	private String login, senha;

	public Login() {
		super();
	}

	public Login(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}


	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
	
}
