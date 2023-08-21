package br.com.fiap.beans;

public class Cliente {
	private String nome;
	private Endereco endereco;
	private String cpf;
	private String rg;
	
	// Setters = Entrada de Dados
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	// Getters = Saída de dados
	public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
}
