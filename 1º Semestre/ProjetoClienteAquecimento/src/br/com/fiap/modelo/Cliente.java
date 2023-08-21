package br.com.fiap.modelo;

public class Cliente {

	// Visibilidade, Tipo de Dado e Nome da Variável
	private String nome;
	private int idade;

	// Setters = Entrada de Dados (set)
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Getters = Saída de Dados (get)
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}
