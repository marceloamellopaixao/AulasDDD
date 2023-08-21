package br.com.fiap.beans;

public class Empresa {
	
	// Variáveis
	private String nome;
	private String tipo;
	private String cnpj;
	private Endereco endereco;
	
	// Metodo construtor vazio
	public Empresa() {
		super();
	}
	
	// Metodo construtor cheio
	public Empresa(String nome, String tipo, String cnpj, Endereco endereco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	// Metodo contrutor cheio sem os atributos de referência (Outras Classes)
	public Empresa(String nome, String tipo, String cnpj) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.cnpj = cnpj;
	}
	
	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// Getters
	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}
}
