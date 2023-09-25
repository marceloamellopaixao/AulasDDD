package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexoes.ConexaoFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Instânciar o objeto
		Connection c = new ConexaoFactory().conexao();
		System.out.println("Conectado com o Banco de Dados.");
		c.close();
	}

}
