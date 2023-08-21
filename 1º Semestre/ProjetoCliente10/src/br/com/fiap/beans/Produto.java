package br.com.fiap.beans;

public class Produto {
	private String nomeProduto;
	private String marcaProduto;
	private String descProduto;
	private double valorProduto;
	
	// Setters
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}
	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	// Getters
	public String getNomeProduto() {
		return nomeProduto;
	}
	public String getMarcaProduto() {
		return marcaProduto;
	}
	public String getDescProduto() {
		return descProduto;
	}
	public double getValorProduto() {
		return valorProduto;
	}	
}
