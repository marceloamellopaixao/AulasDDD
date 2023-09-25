package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteCadastro {

	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int num(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double value(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instânciar
		ProdutoDAO dao = new ProdutoDAO();
		Produto objProduto = new Produto();
		
		
		objProduto.setTipo(txt("Digite o tipo:"));
		objProduto.setMarca(txt("Digite a marca:"));
		objProduto.setCodigo(num("Digite a quantidade:"));
		objProduto.setValorVenda(value("Digite o valor de venda:"));
		objProduto.setValorCompra(value("Digite o valor de compra:"));
		
		System.out.println(dao.inserir(objProduto) + "Dados inseridos com sucesso!");
		
		System.out.println(
				"\nTipo: " + objProduto.getTipo()
				+ "\nMarca: " + objProduto.getMarca()
				+ "\nQuantidade: " + objProduto.getCodigo()
				+ "\nValor de Venda: " + objProduto.getValorVenda()
				+ "\nValor de Compra: " + objProduto.getValorCompra());
	}

}
