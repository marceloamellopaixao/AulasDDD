package br.com.semeamos.beans;

public class Agroindustria extends Conta{

	private String razaoSocial, cnpj;
	
	public Agroindustria() {
		super();
	}

	public Agroindustria(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	
}
