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
		
		// Cliente
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ")));
		objCliente.setEndereco(objEndereco);
				
		// Endereço
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Nome da Rua: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número da casa: ")));
		objEndereco.setBairro(JOptionPane.showInputDialog("Digite o nome do Bairro: "));
		objEndereco.setMunicipio(JOptionPane.showInputDialog("Digite o municipio: "));
		objEndereco.setEstado(JOptionPane.showInputDialog("Digite seu Estado: "));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite seu CEP: "));
				
		// Telefone
		objTelefone.setTelFixo(JOptionPane.showInputDialog("Telefone Fixo: "));
		objTelefone.setTelCelular(JOptionPane.showInputDialog("Telefone Celular: "));
		objTelefone.setTelComercial(JOptionPane.showInputDialog("Telefone Comercial: "));
		objTelefone.setTelContato(JOptionPane.showInputDialog("Telefone Contato: "));

		// Saídas
		
		System.out.println("Nome: " + objCliente.getNome()
		+ "\nIdade: " + objCliente.getIdade()
		+ "\nPeso: " + objCliente.getPeso()
		+ "\nLogradouro: " + objCliente.getEndereco().getLogradouro()
		+ "\nNº " + objCliente.getEndereco().getNumero()
		+ "\nBairro: " + objCliente.getEndereco().getBairro()
		+ "\nMunicipio: " + objCliente.getEndereco().getMunicipio()
		+ "\nEstado: " + objCliente.getEndereco().getEstado()
		+ "\nCEP: " + objCliente.getEndereco().getCep()
		+ "\nTelefone Fixo: " + objTelefone.getTelFixo()
		+ "\nTelefone Celular: " + objTelefone.getTelCelular()
		+ "\nTelefone Comercial: " + objTelefone.getTelComercial()
		+ "\nTelefone Contato: " + objTelefone.getTelContato());
	}

}
