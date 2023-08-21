package br.com.semeamos.beans;

public class InformacoesProducao {

	private String tipoProducao;
	private double quantidadeProduzida, precoAvalidadoDaProducao;
	
	public InformacoesProducao() {
		super();
	}

	public InformacoesProducao(String tipoProducao, double quantidadeProduzida, double precoAvalidadoDaProducao) {
		super();
		this.tipoProducao = tipoProducao;
		this.quantidadeProduzida = quantidadeProduzida;
		this.precoAvalidadoDaProducao = precoAvalidadoDaProducao;
	}

	public String getTipoProducao() {
		return tipoProducao;
	}

	public double getQuantidadeProduzida() {
		return quantidadeProduzida;
	}

	public double getPrecoAvalidadoDaProducao() {
		return precoAvalidadoDaProducao;
	}

	public void setTipoProducao(String tipoProducao) {
		this.tipoProducao = tipoProducao;
	}

	public void setQuantidadeProduzida(double quantidadeProduzida) {
		this.quantidadeProduzida = quantidadeProduzida;
	}

	public void setPrecoAvalidadoDaProducao(double precoAvalidadoDaProducao) {
		this.precoAvalidadoDaProducao = precoAvalidadoDaProducao;
	}
	
	
	
	
}
