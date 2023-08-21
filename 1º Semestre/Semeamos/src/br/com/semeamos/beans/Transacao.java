package br.com.semeamos.beans;

public class Transacao {

	private double valor;
	private String tipo;
	
	public Transacao() {
		super();
	}

	public Transacao(double valor, String tipo) {
		super();
		this.valor = valor;
		this.tipo = tipo;
	}

	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getValor() {
		return valor;
	}

	public String getTipo() {
		return tipo;
	}

	
	
}
