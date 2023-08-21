package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteCliente {

	public static void main(String[] args) {
		// Instânciar os objetos
		
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Produto objProduto = new Produto();
		
		// Objeto Cliente
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		objCliente.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
		objCliente.setRg(JOptionPane.showInputDialog("Digite seu RG: "));
		objCliente.setEndereco(objEndereco);
		
		// Objeto Endereço
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o seu logradouro: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do local: ")));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite o seu CEP: "));
		objEndereco.setBairro(JOptionPane.showInputDialog("Digite o seu bairro: "));
		objEndereco.setCidade(JOptionPane.showInputDialog("Digite a sua cidade: "));
		objEndereco.setEstado(JOptionPane.showInputDialog("Digite o seu Estado: "));
		objEndereco.setNacionalidade(JOptionPane.showInputDialog("Digite sua nacionalidade: "));
		
		// Objeto Produto
		objProduto.setNomeProduto("Notebook c/Placa de Vídeo NVIDIA 8GB VRAM");
		objProduto.setMarca("Lenovo");
		objProduto.setValor(5225.00);
		
		System.out.println("Nome: " + objCliente.getNome() 
		+ "\nCPF: " + objCliente.getCpf() 
		+ "\nRG: " + objCliente.getRg()
		+ "\nLogradouro: " + objCliente.getEndereco().getLogradouro() 
		+ "\nNumero: " + objCliente.getEndereco().getNumero()
		+ "\nCEP: " + objCliente.getEndereco().getCep()
		+ "\nBairro: " + objCliente.getEndereco().getBairro()
		+ "\nCidade: " + objCliente.getEndereco().getCidade()
		+ "\nEstado: " + objCliente.getEndereco().getEstado()
		+ "\nNacionalidade: " + objCliente.getEndereco().getNacionalidade()
		+ "\n\n-------------"
		+ "\nProduto interessado"
		+ "\n-------------"
		+ "\n\nNome do Produto: " + objProduto.getNomeProduto()
		+ "\nMarca do Produto: " + objProduto.getMarca()
		+ "\nValor: R$ " + objProduto.getValor());
	}

}
