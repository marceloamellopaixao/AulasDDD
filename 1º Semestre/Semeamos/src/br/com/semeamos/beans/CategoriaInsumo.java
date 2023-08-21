package br.com.semeamos.beans;

public class CategoriaInsumo {

	private String categoria;
	private double preco, quantidadeComprada;
	
	public CategoriaInsumo() {
		super();
	}

	public CategoriaInsumo(String categoria, double preco, double quantidadeComprada) {
		super();
		this.categoria = categoria;
		this.preco = preco;
		this.quantidadeComprada = quantidadeComprada;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidadeComprada(double quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public double getPreco() {
		return preco;
	}

	public double getQuantidadeComprada() {
		return quantidadeComprada;
	}
	
	//Função responsável por calcular o valor insumo de acordo com a quantidade solicitada.
	public double CalcularPreco(double preco, double quantidadeComprada) {
		return preco*quantidadeComprada;
	}
	
	
}
