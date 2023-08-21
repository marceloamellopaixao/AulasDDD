package br.com.fiap.beans;

public class Endereco {
	private String logradouro;
	private int numero;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String nacionalidade;

	// Metodo construtor vazio
	public Endereco() {
		super();
	}

	// Metodo construtor cheio
	public Endereco(String logradouro, int numero, String cep, String bairro, String cidade, String estado,
			String nacionalidade) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.nacionalidade = nacionalidade;
	}

	// Setters (Entrada de Dados)
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	// Getters (Saída de Dados)
	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

}
