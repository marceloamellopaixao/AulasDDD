package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.beans.Teste;
import br.com.fiap.dao.LivroDAO;

public class TesteCadastro {
	
	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int num(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		LivroDAO dao = new LivroDAO();
		
		Livro objLivro = new Livro();
		
		Teste objTeste = new Teste();
		
		objTeste.setEscolha(txt("Escolha para o CRUD (C = Create, U = Update ou Del = Delete):"));
		
		System.out.println("Conectando com o banco de dados!\n");
		
		switch (objTeste.getEscolha().toLowerCase()) {
		
		case "c":

			// bloco de código que será executado
			objLivro.setCodigo(num("Digite o código do livro:"));
			objLivro.setTitulo(txt("Digite o titulo do livro:"));
			objLivro.setValor(real("Digite o valor do livro:"));
			System.out.println(dao.inserir(objLivro));
		break;

		case "u":

			// bloco de código que será executado
			objLivro.setCodigo(num("Digite o código do livro:"));
			objLivro.setTitulo(txt("Digite o titulo do livro:"));
			objLivro.setValor(real("Digite o valor do livro:"));
			System.out.println(dao.atualizar(objLivro));
		break;

		case "del":
			objLivro.setCodigo(num("Digite o código do livro:"));
			// bloco de código que será executado
			System.out.println(dao.deletar(objLivro));
		break;

		default:

			// bloco de código que será executado se nenhum dos cases for aceito
			System.out.println("Não obteve êxito");
					
		}
		
		System.out.println("\nBanco de dados fechado com sucesso!");
		
	}

}
