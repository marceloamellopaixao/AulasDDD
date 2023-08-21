package br.com.fiap.main;

// Importa o Cliente para o Principal
import br.com.fiap.modelo.Client;

public class testMain {

	public static void main(String[] args) {
		// Instânciar o Objeto
		Client objClient = new Client();
		
		// Entrada
		objClient.setNome("Marcelo Augusto");
		objClient.setIdade(18);
		
		// Saída
		System.out.println("Nome: " + objClient.getNome() + "\n" + 
		"Idade: " + objClient.getIdade());
		
	}

}
