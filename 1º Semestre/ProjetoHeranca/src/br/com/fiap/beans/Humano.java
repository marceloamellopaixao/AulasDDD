package br.com.fiap.beans;
	// Classe Humano herda a Classe Mamifero.
public class Humano extends Mamifero{
	private String rg;
	
	// Metodo Construtor Vazio
	public Humano() {
		super();
	}
	
	// Metodo Construtor Cheio
	public Humano(String rg) {
		super();
		this.rg = rg;
	}
	
	// Metodo Construtor cheio e com Herança
	public Humano(String nome, int idade, double peso, double velocidade, String rg) {
		super(nome, idade, peso, velocidade);
		this.rg = rg;
	}
	
	// Setters
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	// Getters
	public String getRg() {
		return rg;
	}

}
