package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TestePessoa {

	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		// Instânciar os objetos
		
		// String nome, String email, int idade, double renda, String rg, String cpf
		PessoaFisica objPf = new PessoaFisica(txt("Digite seu nome:"),
				txt("Digite seu e-mail:"),
				inteiro("Digite sua idade:"),
				decimal("Digite sua renda:"),
				txt("Digite seu RG:"),
				txt("Digite seu CPF:"));
		
		// String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(txt("Digite o nome da empresa:"),
				txt("Digite o e-mail da empresa:"),
				inteiro("Digite a idade da empresa:"),
				decimal("Digite a renda da empresa:"),
				txt("Digite a Razão Social:"),
				txt("Digite o CNPJ:"));
		
		Endereco objEndereco = new Endereco(txt("Digite seu logradouro:"));
		
		objPf.setEndereco(objEndereco);
		objPj.setEndereco(objEndereco);
		
		System.out.println(
		  "-----------------------------------" 
		+ "\n   INFORMAÇÕES PESSOA FISICA   \n" 
		+ "-----------------------------------"
		+ "\n\nNome: " + objPf.getNome()
		+ "\nE-mail: " + objPf.getEmail()
		+ "\nIdade: " + objPf.getIdade() + " Anos."
		+ "\nRenda: R$ " + objPf.getRenda()
		+ "\nRG: " + objPf.getRg()
		+ "\nCPF: " + objPf.getCpf()
		+ "\nLogradouro: " + objPf.getEndereco().getLogradouro()
		+ "\nIdentificador: " + objPf.identificador()
		+ "\n\n-----------------------------------" 
		+ "\n   INFORMAÇÕES PESSOA JURIDICA   \n" 
		+ "-----------------------------------sd"
		+ "\n\nNome: " + objPj.getNome()
		+ "\nE-mail: " + objPj.getEmail()
		+ "\nIdade: " + objPj.getIdade() + " Anos."
		+ "\nRenda: R$ " + objPj.getRenda()
		+ "\nRazão Social: " + objPj.getRazaoSocial()
		+ "\nCNPJ: " + objPj.getCnpj()
		+ "\nLogradouro: " + objPj.getEndereco().getLogradouro()
		+ "\nIdentificador: " +  objPj.identificador());
	}

}
