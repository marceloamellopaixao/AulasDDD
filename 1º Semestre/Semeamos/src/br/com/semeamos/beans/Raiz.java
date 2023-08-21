package br.com.semeamos.beans;

import java.util.Arrays;

public class Raiz {

	private EmpresaFertilizante empresaFertilizante[];
	private Agroindustria agroindustria[];
	private ProdutorRural produtorRural[];
	private Transacao transacao[];
	
	public Raiz() {
		super();
	}

	public Raiz(EmpresaFertilizante[] empresaFertilizante, Agroindustria[] agroindustria, ProdutorRural[] produtorRural,
			Transacao[] transacao) {
		super();
		this.empresaFertilizante = empresaFertilizante;
		this.agroindustria = agroindustria;
		this.produtorRural = produtorRural;
		this.transacao = transacao;
	}

	public void setEmpresaFertilizante(EmpresaFertilizante[] empresaFertilizante) {
		this.empresaFertilizante = empresaFertilizante;
	}

	public void setAgroindustria(Agroindustria[] agroindustria) {
		this.agroindustria = agroindustria;
	}

	public void setProdutorRural(ProdutorRural[] produtorRural) {
		this.produtorRural = produtorRural;
	}

	public void setTransacao(Transacao[] transacao) {
		this.transacao = transacao;
	}

	public EmpresaFertilizante[] getEmpresaFertilizante() {
		return empresaFertilizante;
	}

	public Agroindustria[] getAgroindustria() {
		return agroindustria;
	}

	public ProdutorRural[] getProdutorRural() {
		return produtorRural;
	}

	public Transacao[] getTransacao() {
		return transacao;
	}
	
	//Função responsável por fazer a verificação se a empresa de fertilizante existe na raiz. 
	public String verificaEmpresaFertilizante(EmpresaFertilizante empresaFerlizante) {
		if(Arrays.asList(this.empresaFertilizante).contains(empresaFerlizante)) {
			return "Essa Empresa de Fertilizante faz parte dessa raiz";
		}else {
			return "Essa Empresa de Fertilizante não faz parte dessa raiz";
		}
	}
	//Função responsável por fazer a verificação se a agroindustria existe na raiz.
	public String verificaAgroindustria(Agroindustria agroindustria) {
		if(Arrays.asList(this.agroindustria).contains(agroindustria)) {
			return "Essa Agroindústria faz parte dessa raiz";
		}else {
			return "Essa Agroindústria não faz parte dessa raiz";
		}
	}
	//Função responsável por fazer a verificação se o produtor rural existe na raiz.
	public String verificaProdutorRural(ProdutorRural produtorRural) {
		if(Arrays.asList(this.produtorRural).contains(produtorRural)) {
			return "Esse Produtor Rural faz parte dessa raiz";
		}else {
			return "Esse Produtor Rural não faz parte dessa raiz";
		}
	}
	//Função responsável por fazer a verificação se a transação existe na raiz.
	public String verificaTransacao(Transacao transacao) {
		if(Arrays.asList(this.transacao).contains(transacao)) {
			return "Essa Transação faz parte dessa raiz";
		}else {
			return "Essa Transação não faz parte dessa raiz";
		}
	}
	
}
