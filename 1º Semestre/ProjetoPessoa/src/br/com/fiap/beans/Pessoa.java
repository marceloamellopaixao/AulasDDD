package br.com.fiap.beans;

public class Pessoa {
	
	// Visibilidade, tipo de dado e variavel	
	private String nome;
	private String email;
	private int idade;
	private double renda;
	private Endereco endereco;
	
	// Sobrecarga
	
	// Metodo Construtor Vazio
	public Pessoa() {
		super();
	}
	
	// Metodo Construtor Cheio
	public Pessoa(String nome, String email, int idade, double renda, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
		this.endereco = endereco;
	}
	
	// Metodo Construtor Cheio sem atributos de referência
	public Pessoa(String nome, String email, int idade, double renda) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// Getters
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getIdade() {
		return idade;
	}

	public double getRenda() {
		return renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	
	// Sobre Escrita // Polimorfismo
	public String identificador() {
		return "Undefined";
	}
}
