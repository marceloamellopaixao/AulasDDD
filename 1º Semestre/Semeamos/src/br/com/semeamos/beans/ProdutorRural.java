package br.com.semeamos.beans;

public class ProdutorRural extends Conta {

	private String nomeCompleto, cpf, rg;
	private InformacoesProducao informacoesProducao;
	
	public ProdutorRural() {
		super();
	}

	public ProdutorRural(String nomeCompleto, String cpf, String rg) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.rg = rg;
	}

	public ProdutorRural(String nomeCompleto, String cpf, String rg, InformacoesProducao informacoesProducao) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.rg = rg;
		this.informacoesProducao = informacoesProducao;
	}
	
	public ProdutorRural(Contato contato, Endereco endereco, Login login, String nomeCompleto, String cpf, String rg, InformacoesProducao informacoesProducao) {
		super(contato, endereco, login);
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.rg = rg;
		this.informacoesProducao = informacoesProducao;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setInformacoesProducao(InformacoesProducao informacoesProducao) {
		this.informacoesProducao = informacoesProducao;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public InformacoesProducao getInformacoesProducao() {
		return informacoesProducao;
	}
	
}
