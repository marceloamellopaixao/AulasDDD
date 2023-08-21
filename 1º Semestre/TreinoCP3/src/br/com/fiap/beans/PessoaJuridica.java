package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial;
	private String cnpj;

	// Metodo Construtor Vazio
	public PessoaJuridica() {
		super();
	}

	// Metodo Construtor Cheio
	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	// Metodo Construtor com Herança
	public PessoaJuridica(String nome, String email, int idade, double renda, String razaoSocial, String cnpj) {
		super(nome, email, idade, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	// Setters
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	// Getters
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	// Override
	public String identificador() {
		return "PJ!";
	}
}
