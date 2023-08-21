package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		
		// Inst�nciar Objetos
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		
		// Setters
		
		// Classe Cliente
		objetoCliente.setNome("Marcelo Augusto");
		objetoCliente.setIdade(18);
		objetoCliente.setPeso(81.5);
		objetoCliente.setEndereco(objetoEndereco);
		
		// Classe Endere�o
		objetoEndereco.setLogradouro("Rua baiacu");
		objetoEndereco.setNumero(263);
		objetoEndereco.setBairro("Eldorado");
		objetoEndereco.setMunicipio("Diadema");
		objetoEndereco.setEstado("S�o Paulo");
		
		
		// Getters
		System.out.println("Nome: " + objetoCliente.getNome() + 
				"\nIdade: " + objetoCliente.getIdade() + 
				"\nPeso: " + objetoCliente.getPeso() + 
				"\nEndere�o: " + objetoCliente.getEndereco().getLogradouro() + 
				", N� " + objetoCliente.getEndereco().getNumero() + 
				" - " + objetoCliente.getEndereco().getMunicipio() + 
				" / " + objetoCliente.getEndereco().getEstado());
	}

}
