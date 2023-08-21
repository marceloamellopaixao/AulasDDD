package br.com.fiap.beans;

public class Telefone {
	private String telefoneFixo;
	private String telefoneCelular;
	private String telefoneComercial;
	private String telefoneContato;

	
	// Setters = Entrada de dados
	public void setTelefoneFixo(String telefoneFixo){
		this.telefoneFixo = telefoneFixo;
	}
	
	public void setTelefoneCelular(String telefoneCelular){
		this.telefoneCelular = telefoneCelular;
	}
	
	public void setTelefoneComercial(String telefoneComercial){
		this.telefoneComercial = telefoneComercial;
	}
	
	public void setTelefoneContato(String telefoneContato){
		this.telefoneContato = telefoneContato;
	}
	
	// Getters = Saída de dados
	public String getTelefoneFixo(){
		return telefoneFixo;
	}
	
	public String getTelefoneCelular(){
		return telefoneCelular;
	}
	
	public String getTelefoneComercial(){
		return telefoneComercial;
	}
	
	public String getTelefoneContato(){
		return telefoneContato;
	}
}
