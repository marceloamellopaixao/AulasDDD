package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteEmpresa {

	public static void main(String[] args) {
		// Instânciar os Objetos
		
		// String nome, String tipo, String cnpj
		Empresa objEmpresa = new Empresa(
				JOptionPane.showInputDialog("Digite seu nome: "),
				JOptionPane.showInputDialog("Digite o tipo da Empresa: "),
				JOptionPane.showInputDialog("Digite seu CNPJ: "));
		
		// String logradouro, int numero, String cep, String bairro, String municipio, String estado
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Digite o logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")),
				JOptionPane.showInputDialog("Digite o CEP: "),
				JOptionPane.showInputDialog("Digite o bairro: "),
				JOptionPane.showInputDialog("Digite o municipio: "),
				JOptionPane.showInputDialog("Digite o estado (Ex: SP): "));
		
		// String tipo, String marca, int quantidade, double valor
		Produto objProduto = new Produto(
				JOptionPane.showInputDialog("Digite o tipo do produto: "),
				JOptionPane.showInputDialog("Digite a marca do produto: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
		
		objEmpresa.setEndereco(objEndereco);
		
		System.out.println(
				("---------------\nDados da Empresa\n---------------\n")
				+ "\nEmpresa: " + objEmpresa.getNome()
				+ "\nTipo: " + objEmpresa.getTipo()
				+ "\nCNPJ: " + objEmpresa.getCnpj()
				+ "\n\n---------------\nEndereço da Empresa\n---------------\n"
				+ "\nLogradouro: " + objEmpresa.getEndereco().getLogradouro()
				+ "\nNumero: " + objEmpresa.getEndereco().getNumero()
				+ "\nCEP: " + objEmpresa.getEndereco().getCep()
				+ "\nBairro: " + objEmpresa.getEndereco().getBairro()
				+ "\nMunicipio: " + objEmpresa.getEndereco().getMunicipio()
				+ "\nEstado: " + objEmpresa.getEndereco().getEstado()
				+ "\n\n---------------\nProdutos da Empresa\n---------------\n"
				+ "\nTipo: " + objProduto.getTipo()
				+ "\nMarca: " + objProduto.getMarca()
				+ "\nQuantidade: UN "  + objProduto.getQuantidade()
				+ "\nValor: R$ " + objProduto.getValor());
	}

}
