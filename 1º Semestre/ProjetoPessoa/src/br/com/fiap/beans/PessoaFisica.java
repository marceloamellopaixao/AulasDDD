package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{
	private String rg;
	private String cpf;
	
	// Sobre carga
	
	// Metodo Construtor Vazio
	public PessoaFisica() {
		super();
	}
	
	// Metodo Construtor cheio
	public PessoaFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}

	// Metodo Construtor cheio com Herança/Superclass -> Herda os dados da classe Pessoa 
	public PessoaFisica(String nome, String email, int idade, double renda, String rg, String cpf) {
		super(nome, email, idade, renda);
		this.rg = rg;
		this.cpf = cpf;
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

	// Sobre Escrita
	public String identificador() {
		return "Pessoa Fisica";
	}
}
