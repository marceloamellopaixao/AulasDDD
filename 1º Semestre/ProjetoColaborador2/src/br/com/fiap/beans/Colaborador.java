package br.com.fiap.beans;

public class Colaborador {
	// Visibilidade, Tipo de Dado e Nome da Variável
	private String nome;
	private String cargo;
	private double valorHora;
	private double quantidadeHoras;
	private double percentual;
	private Endereco endereco;
	
	// Metodo construtor vazio
	public Colaborador() {
		super();
	}
	
	// Metodo construtor cheio
	public Colaborador(String nome, String cargo, double valorHora, double quantidadeHoras, double percentual, Endereco endereco) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;
		this.percentual = percentual;
		this.endereco = endereco;
	}
	
	
	// Metodo construtor com atributos da própria classe
	public Colaborador(String nome, String cargo, double valorHora, double quantidadeHoras, double percentual) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;
		this.percentual = percentual;
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	// Getters
	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public double getValorHora() {
		return valorHora;
	}

	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public double getPercentual() {
		return percentual;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	// Metodo Worker
	public double calcularSalario() {
		return valorHora * quantidadeHoras;
	}
	
	public double calcularIr() {
		return calcularSalario() * percentual/100;
	}
	
	public String informacaoSalario() {
		String informacao;
		
		if (calcularSalario() <= 2000) {
			informacao = "Não será descontado o Imposto de Renda, valor salarial menor que 2000.";
		}
		else {
			informacao = "O valor do Imposto de Renda que será descontado é de R$ " + calcularIr();
		}
		
		return informacao;
	}
	
	public double salarioLiquido() {
		double salario;
		
		if (calcularSalario() <= 2000) {
			salario = calcularSalario();
		}
		else {
			salario = calcularSalario() - calcularIr();
		}
		
		return salario;
	}
	
}
