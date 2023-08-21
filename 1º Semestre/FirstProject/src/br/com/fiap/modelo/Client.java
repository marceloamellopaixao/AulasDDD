package br.com.fiap.modelo;

public class Client {
	
// Visibilidade, tipo de dado e variável	
	private String nome;
	private int idade;
	
//	Setters
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public void setIdade (int idade){
		this.idade = idade;
	}
	
//	Getters
	public String getNome() {
		return nome;
	}
	public int getIdade(){
		return idade;
	}
}
