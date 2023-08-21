package br.com.fiap.beans;

public class Oficina {
	// Visibilidade, Tipo de Dados e o Nome da variável.
	private String nome;
	private String cnpj;
	private Carro carro;
	private Endereco endereco;
	private Colaborador colaborador;
	
	// Metodo Construtor Vazio
	public Oficina() {
		super();
	}
	
	// Metodo Construtor sem atributos de referência (Outras classes)
	public Oficina(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	// Metodo Construtor Cheio
	public Oficina(String nome, String cnpj, Carro carro, Endereco endereco, Colaborador colaborador) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.carro = carro;
		this.endereco = endereco;
		this.colaborador = colaborador;
	}
	
	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	// Getters
	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Carro getCarro() {
		return carro;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}
	
}
