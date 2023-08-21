package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class TesteCliente {

	public static void main(String[] args) {
		// Instânciar os objetos
		
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		
		// Setters = Entrada de dados
		// Objeto Cliente
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ")));
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		// Objeto Endereço
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o nome da sua rua: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua casa: ")));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite seu CEP: "));
		objEndereco.setBairro(JOptionPane.showInputDialog("Digite o nome do seu bairro: "));
		objEndereco.setMunicipio(JOptionPane.showInputDialog("Digite o nome do seu municipio: "));
		objEndereco.setEstado(JOptionPane.showInputDialog("Digite o nome do seu estado: "));
		// Objeto Telefone
		objTelefone.setTelefoneFixo(JOptionPane.showInputDialog("Digite seu telefone fixo: "));
		objTelefone.setTelefoneCelular(JOptionPane.showInputDialog("Digite seu telefone Celular: "));
		objTelefone.setTelefoneComercial(JOptionPane.showInputDialog("Digite seu telefone Comercial: "));
		objTelefone.setTelefoneContato(JOptionPane.showInputDialog("Digite seu telefone Contato: "));
		
		// Saída de dados
		System.out.println("Nome: " + objCliente.getNome() +
				"\nIdade: " + objCliente.getIdade() + " anos." +
				"\nPeso: " + objCliente.getPeso() + " kilos." +
				"\nLogradouro: " + objCliente.getEndereco().getLogradouro() + 
				"\nNúmero: " + objCliente.getEndereco().getNumero() + 
				"\nCEP: " + objCliente.getEndereco().getCep() + 
				"\nBairro: " + objCliente.getEndereco().getBairro() + 
				"\nMunicipio: " + objCliente.getEndereco().getMunicipio() + 
				"\nEstado: " + objCliente.getEndereco().getEstado() + 
				"\n\nTelefone Fixo: " + objCliente.getTelefone().getTelefoneFixo() + 
				"\nTelefone Celular: " + objCliente.getTelefone().getTelefoneCelular() + 
				"\nTelefone Comercial: " + objCliente.getTelefone().getTelefoneComercial() + 
				"\nTelefone Contato: " + objCliente.getTelefone().getTelefoneContato());
	}

}
