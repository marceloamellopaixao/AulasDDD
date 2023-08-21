package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {
	
	// Static TXT para receber strings
	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	// Static INTEIRO para receber inteiros
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	// Static REAL para receber valores decimais
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
		
		int i = 0;
		
		// Entrada (i)
		do {
			// String tipo, String marca, int quantidade, double valor
			vetorProdutos[i] = new Produto();
			vetorProdutos[i].setTipo(txt("Digite o tipo:"));
			vetorProdutos[i].setMarca(txt("Digite a marca:"));
			vetorProdutos[i].setQuantidade(inteiro("Digite a Quantidade:"));
			vetorProdutos[i].setValor(real("Digite o valor:"));
			
			i++;
		} while(JOptionPane.showConfirmDialog(null, "Adicionar Produto no Carrinho?", "Carrinho de Compras", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		// Saídas (contador)
		for (int contador = 0; contador < i; contador++) {
			System.out.println(
		  "[--------------------------------------------------------]" 
		+ "\n[----------------------[ CARRINHO ]----------------------]" 
		+ "\n[--------------------------------------------------------]" 
		+ "\nTipo de Produto: " + vetorProdutos[contador].getTipo()
		+ "\nMarca de Produto: " + vetorProdutos[contador].getMarca()
		+ "\nQuantidade de Produto: " + vetorProdutos[contador].getQuantidade()
		+ "\nValor de Produto: " + vetorProdutos[contador].getValor()
							+ "\nValor Total: " + valorTotal(vetorProdutos, i)
		+ "\n");
		}
		


	}

}
