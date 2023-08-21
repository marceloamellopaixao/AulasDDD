package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TestePessoa {
	
	// Metodos Static
	
	// JOptionPane - String
	static String texto(String j){
		return JOptionPane.showInputDialog(j);
	}
	
	// JOptionPane - Int
	static int inteiro(String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	// JOptionPane - Double
	static double decimal(String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		// Instânciar os Objetos
		
		// String nome, String email, int idade, double renda, String rg, String cpf
		PessoaFisica objPsFisica = new PessoaFisica(texto("Digite seu nome: "),
				texto("Digite seu e-mail: "),
				inteiro("Digite sua idade: "),
				decimal("Digite sua renda: "),
				texto("Digite o RG: "),
				texto("Digite o CPF: "));
		
		// String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		PessoaJuridica objPsJuridica = new PessoaJuridica(texto("Digite o nome da empresa: "),
				texto("Digite o e-mail da empresa: "),
				inteiro("Digite a idade da empresa: "),
				decimal("Digite a renda da empresa: "),
				texto("Digite a razão social: "),
				texto("Digite o CNPJ: "));

		Endereco objEndereco = new Endereco(texto("Digite o logradouro: "));
				
		System.out.println(
		  "------------------------------\n"
		+ "        PESSOA FISICA         \n" 
		+ "------------------------------\n" 
		+ "\nNome da Pessoa: " + objPsFisica.getNome()
		+ "\nE-mail da Pessoa: " + objPsFisica.getEmail()
		+ "\nIdade: " + objPsFisica.getIdade()
		+ "\nRenda da Pessoa: " + objPsFisica.getRenda()
		+ "\nRG da Pessoa: " + objPsFisica.getRg()
		+ "\nCPF da Pessoa: " + objPsFisica.getCpf()
		+ "\nEndereço da Pessoa: " + objEndereco.getLogradouro()
		+ "\nIdentificador: " + objPsFisica.identificador()
		+ "\n\n------------------------------\n"
		+ "       PESSOA JURIDICA        \n" 
		+ "------------------------------\n"
		+ "\nNome da Empresa: " + objPsJuridica.getNome()
		+ "\nE-mail da Empresa: " + objPsJuridica.getEmail()
		+ "\nIdade: " + objPsJuridica.getIdade()
		+ "\nRenda da Empresa: " + objPsJuridica.getRenda()
		+ "\nRazão Social: " + objPsJuridica.getRazaoSocial()
		+ "\nCNPJ: " + objPsJuridica.getCnpj()
		+ "\nEndereço da Empresa: " + objEndereco.getLogradouro()
		+ "\nIdentificador: " + objPsJuridica.identificador());
	}

}
