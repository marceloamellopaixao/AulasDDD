package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial;
	private String cnpj;

	// Sobre carga
	
	// Metodo Construtor Vazio
	public PessoaJuridica() {
		super();
	}

	// Metodo Construtor cheio
	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	// Metodo Construtor cheio com Herança:Superclass -> Herda alguns dados da
	// classe Pessoa
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

	// Sobre Escrita
	public String identificador() {
		return "Pessoa Juridica";
	}
}
