package br.com.semeamos.beans;

public class EmpresaFertilizante extends Conta {

	private String razaoSocial, cnpj;
	
	public EmpresaFertilizante() {
		super();
	}
	
	public EmpresaFertilizante(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public EmpresaFertilizante(Contato contato, Endereco endereco, Login login, String razaoSocial, String cnpj) {
		super(contato, endereco, login);
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
