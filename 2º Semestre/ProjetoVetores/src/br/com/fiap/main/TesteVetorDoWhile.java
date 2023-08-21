package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorDoWhile {

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

		// Entrada (indice)
		do {
			vetorProdutos[indice] = new Produto();
			vetorProdutos[indice].setTipo(txt("Digite o tipo:"));
			vetorProdutos[indice].setMarca(txt("Digite a marca:"));
			vetorProdutos[indice].setQuantidade(num("Digite a quantidade:"));
			vetorProdutos[indice].setValor(real("Digite o valor do produto"));

			indice++;

		} while (JOptionPane.showConfirmDialog(null, "Deseja Adicionar ao Carrinho?", "Carrinho de Compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

		for (int i = 0; i < indice; i++) {
			System.out.println("[-------------------------------------------------------------------]"
					+ "\n[---------------------------- [CARRINHO] ---------------------------]"
					+ "\n[-------------------------------------------------------------------]" + "\n\n"
					+ "\nTipo do Produto: " + vetorProdutos[i].getTipo() + "\nMarca do Produto: "
					+ vetorProdutos[i].getMarca() + "\nQuantidade do Produto: " + vetorProdutos[i].getQuantidade()
					+ "\nValor do Produto" + vetorProdutos[i].getValor() + "\nValor total: "
					+ valorTotal(vetorProdutos, i));
		}

	}

}
