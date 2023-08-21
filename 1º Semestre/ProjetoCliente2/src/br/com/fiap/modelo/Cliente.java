package br.com.fiap.modelo;

public class Cliente {
	// Visibilidade, Tipo, Váriavel
	private String nome;
	private int idade;
	private double peso;
	private Endereco endereco;
	
	// Setters
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}
	
	// Getters
	public String getNome(){
		return nome;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public Endereco getEndereco(){
		return endereco;
	}
}
