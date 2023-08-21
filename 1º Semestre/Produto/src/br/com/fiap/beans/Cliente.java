package br.com.fiap.beans;

public class Cliente {
	
	// Visibilidade, Tipo de dados e nome da variável.
	
	private String nome;
	private int idade;
	private double peso;
	private Produto produto;
	
	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	// Getters
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	// Metódo Construtor Vazio
	
	public Cliente(){
		super();
	}
	
	// Metódo Construtor Cheio
	public Cliente(String nome, int idade, double peso, Produto produto) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.produto = produto;
	}
}
