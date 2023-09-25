package br.com.fiap.beans;

public class Carro {
	private String marca, modelo;
	private int ano;
	private double valor;
	
	public Carro() {
		super();
	}
	
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
	
	
	
}
