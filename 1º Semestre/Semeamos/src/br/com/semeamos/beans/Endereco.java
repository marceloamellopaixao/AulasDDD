package br.com.semeamos.beans;

public class Endereco {

	private String logradouro, cep, bairro, estado, cidade, complemento;
	private int numero;
	
	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String cep, String bairro, String estado, String cidade, String complemento, int numero) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
		this.complemento = complemento;
		this.numero = numero;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	public String getEstado() {
		return estado;
	}

	public String getCidade() {
		return cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public int getNumero() {
		return numero;
	}
	
}
