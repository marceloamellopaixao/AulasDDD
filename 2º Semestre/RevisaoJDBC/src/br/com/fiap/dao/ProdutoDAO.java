package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProdutoDAO {
	public Connection minhaConexao;
	
	// Metodo Construtor com Sucesso
	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Insert
	public String inserir (Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("insert into T_FIAP_PRODUTOS values (?,?,?,?,?)");
				
		stmt.setInt(1, produto.getCodigo());
		stmt.setString(2, produto.getTipo());
		stmt.setString(3, produto.getMarca());
		stmt.setDouble(4, produto.getValorCompra());
		stmt.setDouble(5, produto.getValorVenda());
		stmt.execute();
		stmt.close();
				/*
				 * 	id_produto INT primary key,
				    tp_produto varchar2(100),
				    mc_produto varchar2(100),
				    vl_venda number(9,2) default 0,
				    vl_compra number(9,2) default 0
				 * */
		
		return "Cadastrado com Sucesso!";
	}
}
