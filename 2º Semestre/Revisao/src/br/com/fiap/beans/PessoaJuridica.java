package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {

	private String cnpj;


	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String email, int idade, double renda, String cnpj) {
		super(nome, email, idade, renda);
		// Váriavel da Classe Local
		this.cnpj = cnpj;
	};	
	
	// Setters
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	// Getters
	public String getCnpj() {
		return cnpj;
	}
	
	@Override
	public String identificador() {
		// Identifica se é Pessoa Juridica
		return "Pessoa Jurídica (PJ)";
	}

	@Override
	public double pagarTaxa() {
		// Pessoa Juridica irá pagar uma certa taxa
		double taxaRenda;
		
		if (renda > 2000) {
			return taxaRenda = renda * 20/100;
		} else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}
	

}
