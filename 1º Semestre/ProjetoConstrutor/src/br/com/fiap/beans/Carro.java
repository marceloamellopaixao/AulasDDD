package br.com.fiap.beans;

public class Carro {
	// Visibilidade, Tipo de Dados e o nome da váriavel
	private String marca;
	private String modelo;
	private int ano;
	private double valor;
	private PecasCarro pecasCarro;
	
	// Método Construtor Vazio
	public Carro() {
		super();
	}
	
	// Método Construtor Cheio
	public Carro(String marca, String modelo, int ano, double valor, PecasCarro pecasCarro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.pecasCarro = pecasCarro;
	}
	
	// Método Construtor só com atributos da própria classe
		public Carro(String marca, String modelo, int ano, double valor) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
			this.valor = valor;
		}
	// Setters
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setPecasCarro(PecasCarro pecasCarro) {
		this.pecasCarro = pecasCarro;
	}
	
	
	// Getters
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public double getValor() {
		return valor;
	}

	public PecasCarro getPecasCarro() {
		return pecasCarro;
	}
}
