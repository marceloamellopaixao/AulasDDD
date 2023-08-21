package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class TesteCliente {

	public static void main(String[] args) {
		// Instânciar os objetos
		
		Produto objProduto = new Produto(JOptionPane.showInputDialog("Digite o tipo de dados: "),
				JOptionPane.showInputDialog("Digite a marca: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor: ")));
		
		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("Digite seu nome: "), 
				Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso: ")), objProduto);
		
		/* Objeto Cliente
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso: ")));
		objCliente.setProduto(objProduto);
		*/
		
		// Objeto Produto
		objProduto.setTipo("Celular");
		objProduto.setMarca("Motorola");
		objProduto.setQuantidade(1);
		objProduto.setValor(150.00);
		
		System.out.println("Nome: " + objCliente.getNome() 
		+ "\nIdade: " + objCliente.getIdade()
		+ "\nPeso: " + objCliente.getPeso()
		+ "\n\n-----------"
		+ "\nProduto"
		+ "\n-----------"
		+ "\n\nTipo de Produto: " + objCliente.getProduto().getTipo()
		+ "\nMarca: " + objCliente.getProduto().getMarca()
		+ "\nQuantidade: " + objCliente.getProduto().getQuantidade()
		+ "\nValor: " + objCliente.getProduto().getValor());
		
		String msg = 
			"Nome: " + objCliente.getNome() 
		+ "\nIdade: " + objCliente.getIdade()
		+ "\nPeso: " + objCliente.getPeso()
		+ "\n\n-----------"
		+ "\nProduto"
		+ "\n-----------"
		+ "\n\nTipo de Produto: " + objCliente.getProduto().getTipo()
		+ "\nMarca: " + objCliente.getProduto().getMarca()
		+ "\nQuantidade: " + objCliente.getProduto().getQuantidade()
		+ "\nValor: " + objCliente.getProduto().getValor();
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
