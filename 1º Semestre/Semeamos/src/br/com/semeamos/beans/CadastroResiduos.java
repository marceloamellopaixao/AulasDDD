package br.com.semeamos.beans;

public class CadastroResiduos {
	
	private String tipo, lote;
	private double peso, precoKg;
	
	public CadastroResiduos() {
		super();
	}

	public CadastroResiduos(String tipo, String lote, double peso, double precoKg) {
		super();
		this.tipo = tipo;
		this.lote = lote;
		this.peso = peso;
		this.precoKg = precoKg;
	}

	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecoKg(double precoKg) {
		this.precoKg = precoKg;
	}
	
	public String getTipo() {
		return tipo;
	}

	public String getLote() {
		return lote;
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecoKg() {
		return precoKg;
	}

	//Função responsável por calcular o preço dos residuos pelo peso solicitado.
	public double CalcularPreco(double peso, double precoKg) {
		return precoKg*peso;
	}
	
}
