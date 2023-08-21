package br.com.fiap.beans;

public class Colaborador {
	private String nome;
	private String cargo;
	private Endereco endereco;
	private double valorHora;
	private double qtdadeHora;

	// Metodo Construtor vazio
	public Colaborador() {
		super();
	}

	// Metodo Construtor cheio
	public Colaborador(String nome, String cargo, Endereco endereco, double valorHora, double qtdadeHora) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.endereco = endereco;
		this.valorHora = valorHora;
		this.qtdadeHora = qtdadeHora;
	}

	// Metodo Construtor cheio sem o atributo de referência
	public Colaborador(String nome, String cargo, double valorHora, double qtdadeHora) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.qtdadeHora = qtdadeHora;
	}

	// Setters (Entrada de Dados)
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	public void setQtdadeHora (double qtdadeHora) {
		this.qtdadeHora = qtdadeHora;
	}
	
	// Getters (Saída de Dados)
	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public double getValorHora() {
		return valorHora;
	}

	public double getQtdadeHora() {
		return qtdadeHora;
	}
	
	// Metodos Workers (Cálculos)
	/*
	 * public double calcularSalario(double qtdadeHoras) {
		return valorHora * qtdadeHoras;
	}
	*/
	
	public double calcularSalario() {
		return valorHora * qtdadeHora;
	}
}
