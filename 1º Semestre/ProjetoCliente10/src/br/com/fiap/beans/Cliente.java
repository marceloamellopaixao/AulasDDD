package br.com.fiap.beans;

public class Cliente {
	// Visibilidade, Tipo de Dados e o Nome da variável.
	private String nome;
	private int idade;
	private double peso;
	private Endereco endereco;
	private Telefone telefone;
	private DadosPessoais dadosPessoais;
	
	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	
	// Getters
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}
}
