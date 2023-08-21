package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorWhile {

	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int num(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	static double valorTotal(Produto[] p, int i) {
		double total = 0;

		for (int c = 0; c < i; c++) {
			total += p[c].getValor() * p[c].getQuantidade();
		}

		return total;
	}

	public static void main(String[] args) {
		// Instânciar objetos

		Produto[] vetorProdutos = new Produto[3];

		int indice = 0;
		int continuar = 0;

		while (continuar == 0) {
			vetorProdutos[indice] = new Produto();
			vetorProdutos[indice].setTipo(txt("Digite o tipo:"));
			vetorProdutos[indice].setMarca(txt("Digite a marca:"));
			vetorProdutos[indice].setQuantidade(num("Digite a quantidade:"));
			vetorProdutos[indice].setValor(real("Digite o valor do produto"));

			indice++;

			continuar = JOptionPane.showConfirmDialog(null, "Deseja Adicionar + ao Carrinho?", "Carrinho de Compras",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}

		for (int contador = 0; contador < indice; contador++) {
			System.out.println("[-------------------------------------------------------------------]"
					+ "\n[---------------------------- [CARRINHO] ---------------------------]"
					+ "\n[-------------------------------------------------------------------]" + "\n"
					+ "\nTipo do Produto: " + vetorProdutos[contador].getTipo() + "\nMarca do Produto: "
					+ vetorProdutos[contador].getMarca() + "\nQuantidade do Produto: "
					+ vetorProdutos[contador].getQuantidade() + "\nValor do Produto: "
					+ vetorProdutos[contador].getValor() + "\nValor total: " + valorTotal(vetorProdutos, indice));
		}
	}

}
