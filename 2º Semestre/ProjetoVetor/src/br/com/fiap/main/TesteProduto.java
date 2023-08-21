package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto {

	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		// Determinar o limite do vetor
		Produto[] vetorProduto = new Produto[5];
		
		int indice = 0; // Posição no vetorProduto = [0]
		
		do {
			// Entradas
			
			// String tipo, String marca, int quantidade, double valor
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(txt("Tipo do Produto:"));
			vetorProduto[indice].setMarca(txt("Marca do Produto:"));
			vetorProduto[indice].setQuantidade(inteiro("Digite a Quantidade:"));
			vetorProduto[indice].setValor(real("Valor do Produto:"));
			
			
			indice++;
			

		}
		while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de Compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
			// Saídas
			for(int contador = 0; contador < indice; contador ++) {
				System.out.println(
						"\n[---------------------- [PRODUTOS] ----------------------]"
						+ "\n\nTipo do Produto: " + vetorProduto[contador].getTipo()
						+ "\nMarca do Produto: " + vetorProduto[contador].getMarca()
						+ "\nQuantidade: " + vetorProduto[contador].getQuantidade()
						+ "\nValor: " + vetorProduto[contador].getValor());
			}
		

		
		

	}

}
