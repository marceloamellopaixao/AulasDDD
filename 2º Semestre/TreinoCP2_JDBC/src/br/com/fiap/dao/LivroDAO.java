package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Livro;
import br.com.fiap.conexoes.ConexaoFactory;

public class LivroDAO {
	public Connection minhaConexao;
	
	public LivroDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Insert
	public String inserir(Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO T_FIAP_LIVRO VALUES (?,?,?)");
		
		stmt.setInt(1, livro.getCodigo());
		stmt.setString(2, livro.getTitulo());
		stmt.setDouble(3, livro.getValor());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso!";
	}
	
	// Update
	public String atualizar(Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("UPDATE T_FIAP_LIVRO set TITULO_LIVRO = ?, VALOR_LIVRO = ?"
				+ " WHERE CODIGO_LIVRO = ?");
				
		stmt.setString(1, livro.getTitulo());
		stmt.setDouble(2, livro.getValor());
		stmt.setInt(3, livro.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Atualizado os Dados com Sucesso!";
	}
	
	// Delete
	public String deletar(Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM T_FIAP_LIVRO"
				+ " WHERE CODIGO_LIVRO = ?");
		
		stmt.setInt(1, livro.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Deletado com Sucesso!";
	}
}
