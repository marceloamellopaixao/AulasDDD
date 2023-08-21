package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {
	private String rg;
	private String cpf;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}

	public PessoaFisica(String nome, String email, int idade, double renda, String rg, String cpf) {
		super(nome, email, idade, renda);
		this.rg = rg;
		this.cpf = cpf;
	}

	public PessoaFisica(String nome, String email, int idade, double renda) {
		super(nome, email, idade, renda);
		// TODO Auto-generated constructor stub
	}

	// Setters
	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// Getters
	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	// Override
	public String identificador() {
		return "PF!";
	}
}
