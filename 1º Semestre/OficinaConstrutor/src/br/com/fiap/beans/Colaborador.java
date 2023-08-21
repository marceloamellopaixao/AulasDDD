package br.com.fiap.beans;

public class Colaborador {
	// Visibilidade, Tipo de Dados e o Nome da variável.
	private String nome;
	private int idade;
	private String rg;
	private String cargo;
	private double salario;
	
	// Metodo Construtor vazio
	public Colaborador() {
		super();
	}

	// Metodo Construtor cheio
	public Colaborador(String nome, int idade, String rg, String cargo, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cargo = cargo;
		this.salario = salario;
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

	public void setSalario(double salario) {
		this.salario = salario;
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

	public double getSalario() {
		return salario;
	}
}
