package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{

	private String cpf;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String email, int idade, double renda, String cpf) {
		super(nome, email, idade, renda);
		// Váriavel da Classe Local
		this.cpf = cpf;
	};	
	
	// Setters
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// Getters
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String identificador() {
		// Identifica se é Pessoa Fisica
		return "Pessoa Física (PF)";
	}

	@Override
	public double pagarTaxa() {
		// Pessoa Fisica irá pagar uma certa taxa
		double taxaRenda;
		
		if (renda > 2000) {
			return taxaRenda = renda * 12/100;
		} else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}

}
