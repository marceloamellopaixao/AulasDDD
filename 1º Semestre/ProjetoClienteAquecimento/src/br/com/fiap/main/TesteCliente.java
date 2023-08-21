package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// Instânciar o Objeto
		Cliente objetoCliente = new Cliente();
		
		// Entrada de dados do Objeto na Variável
		objetoCliente.setNome("Marcelo Augusto");
		objetoCliente.setIdade(18);
		
		// Saída de dados do Objeto pela Variável
		System.out.println(objetoCliente.getNome());
		System.out.println(objetoCliente.getIdade());
	}

}
