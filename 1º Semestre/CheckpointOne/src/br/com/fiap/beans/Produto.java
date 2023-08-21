package br.com.fiap.beans;

public class Produto {
	private String nomeProduto;
	private String marca;
	private double valor;
	
	// Setters = Recebe os dados
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	// Getters = Saída de dados
	public String getNomeProduto() {
		return nomeProduto;
	}
	public String getMarca() {
		return marca;
	}
	public double getValor() {
		return valor;
	}
}
