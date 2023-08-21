package br.com.fiap.beans;
	// Classe Humano herda a Classe Mamifero.
public class Boi extends Mamifero{
	private double tamanhoChifre;
	
	// Metodo Construtor vazio
	public Boi() {
		super();
	}
	
	// Metodo Construtor cheio
	public Boi(double tamanhoChifre) {
		super();
		this.tamanhoChifre = tamanhoChifre;
	}
	
	// Metodo Construtor cheio e com Herança
	public Boi(String nome, int idade, double peso, double velocidade, double tamanhoChifre) {
		super(nome, idade, peso, velocidade);
		this.tamanhoChifre = tamanhoChifre;
	}

	// Setters
	public void setTamanhoChifre(double tamanhoChifre) {
		this.tamanhoChifre = tamanhoChifre;
	}
	
	// Getters
	public double getTamanhoChifre() {
		return tamanhoChifre;
	}
	
}
