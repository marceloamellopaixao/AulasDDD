package br.com.fiap.beans;

public class Produto {
	private String tipo, marca;
	private int codigo;
	private double valorVenda, valorCompra;
	
	// Construtor vazio
	public Produto() {
		super();
	}
	
	// Construtor Cheio
	public Produto(String tipo, String marca, int quantidade, double valorVenda, double valorCompra) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.codigo = quantidade;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}
	
	// Setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setCodigo(int quantidade) {
		this.codigo = quantidade;
	}
	
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	// Getters
	public String getTipo() {
		return tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public double getValorVenda() {
		return valorVenda;
	}
	
	public double getValorCompra() {
		return valorCompra;
	}
}