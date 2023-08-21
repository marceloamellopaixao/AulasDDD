package br.com.fiap.beans;

public class Colaborador {
	// Visibilidade, Tipo de Dados e o nome da váriavel
	private String nome;
	private int idade;
	private String rg;
	private String cargo;
	private double valorHora;

	// Método Construtor Vazio
	public Colaborador() {
		super();
	}
	
	// Método Construtor Cheio
	public Colaborador(String nome, int idade, String rg, String cargo, double valorHora) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cargo = cargo;
		this.valorHora = valorHora;
	}
	
	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	// Getters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getRg() {
		return rg;
	}

	public String getCargo() {
		return cargo;
	}

	public double getValorHora() {
		return valorHora;
	}
	
	// Metodo Worker
	public double calcularTotalSalario(int quantidadeHoras){
		return valorHora + quantidadeHoras;
	}
}
