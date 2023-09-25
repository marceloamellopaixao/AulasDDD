package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecoes.Excecao;

public class TesteProduto {
	
	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int num(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double value(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	public static void main(String[] args) throws Excecao{
		// Instanciar
		// String tipo, String marca, int quantidade, double valorVenda, double valorCompra
		Produto objProduto = new Produto();
		
		try {
			objProduto.setTipo(txt("Digite o tipo:"));
			objProduto.setMarca(txt("Digite a marca:"));
			objProduto.setCodigo(num("Digite a quantidade:"));
			objProduto.setValorVenda(value("Digite o valor de venda:"));
			objProduto.setValorCompra(value("Digite o valor de compra:"));
		} catch(Exception e) {
			throw new Excecao(e);
		} finally {
			
		}
		
		System.out.println(
				"\nTipo: " + objProduto.getTipo()
				+ "\nMarca: " + objProduto.getMarca()
				+ "\nQuantidade: " + objProduto.getCodigo()
				+ "\nValor de Venda: " + objProduto.getValorVenda()
				+ "\nValor de Compra: " + objProduto.getValorCompra());
	}

}
