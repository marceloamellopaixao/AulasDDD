package br.com.fiap.beans;

public class Livro {
	private int codigo;
	private String titulo;
	private double valor;
	
	public Livro() {
		super();
	}
	
	public Livro(int codigo, String titulo, double valor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public double getValor() {
		return valor;
	}
	
}
