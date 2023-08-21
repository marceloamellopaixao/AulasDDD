package br.com.fiap.beans;

public abstract class Pessoa {
	private String nome, email;
	private int idade;
	protected double renda;
	
	// Construtor Vazio
	public Pessoa() {
		super();
	}
	
	// Construtor Cheio
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
	
	// Metodos
	
	public abstract String identificador();
	
	public abstract double pagarTaxa();
	
	
}
