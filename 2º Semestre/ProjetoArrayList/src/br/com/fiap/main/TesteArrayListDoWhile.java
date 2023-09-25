package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteArrayListDoWhile {

	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int num(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal() {
		double total = 0;
		return total;
	}

	public static void main(String[] args) {
		// Instânciar objetos
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto objProduto = null;
	
		// Entrada
		
		do {
			objProduto = new Produto();
			objProduto.setTipo(txt("Digite o tipo:"));
			objProduto.setMarca(txt("Digite a marca:"));
			objProduto.setQuantidade(num("Digite a quantidade:"));
			objProduto.setValor(real("Digite o valor:"));
			
			listaProdutos.add(objProduto);
			
		}while(JOptionPane.showConfirmDialog(null, "Gostaria de Adicionar mais produtos?", "Carrinho de Compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		// Saida
		// Foreach percorre todos os registros que contenham no Produto para que sejam exibidas.
		
		for (Produto p : listaProdutos) {
			System.out.println(
						"[-------------------------------------------------------------------]"
					+ "\n[---------------------------- [CARRINHO] ---------------------------]"
					+ "\n[-------------------------------------------------------------------]" + "\n\n"
					+ "\nTipo do Produto: " + p.getTipo() 
					+ "\nMarca do Produto: " + p.getMarca() 
					+ "\nQuantidade do Produto: " + p.getQuantidade()
					+ "\nValor do Produto" + p.getValor() 
					+ "\nValor total: " + valorTotal(p, i));
		}
		
		
//		for (int i = 0; i < indice; i++) {
//			System.out.println("[-------------------------------------------------------------------]"
//					+ "\n[---------------------------- [CARRINHO] ---------------------------]"
//					+ "\n[-------------------------------------------------------------------]" + "\n\n"
//					+ "\nTipo do Produto: " + objProduto.getTipo() 
//					+ "\nMarca do Produto: " + objProduto.getMarca() 
//					+ "\nQuantidade do Produto: " + objProduto.getQuantidade()
//					+ "\nValor do Produto" + objProduto.getValor() 
//					+ "\nValor total: " + valorTotal(objProduto, i));
//		}
	}

}
