package br.com.fiap.beans;

public class Produto {
	
	// 
	private String tipo;
	private String marca;
	private int quantidade;
	private double valor;
	
	// Metodo construtor vazio
	public Produto() {
		super();
	}
	
	// Metodo construtor cheio
	public Produto(String tipo, String marca, int quantidade, double valor) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	// Setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	// Getters (Saída/Exibir)
	public String getTipo() {
		return tipo;
	}

	public String getMarca() {
		return marca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}
}
