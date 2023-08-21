package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {

	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int number(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double value(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		// Instânciar Objetos
		// String nome, String email, int idade, double renda, String cpf
		PessoaFisica objPF = new PessoaFisica(
				txt("Digite o nome:"), 
				txt("Digite o e-mail:"), 
				number("Digite a idade:"), 
				value("Digite a Renda:"), 
				txt("Digite o CPF:"));
		
		// String nome, String email, int idade, double renda, String cnpj
		PessoaJuridica objPJ = new PessoaJuridica(
				txt("Digite o nome da empresa:"), 
				txt("Digite o e-mail:"), 
				number("Digite a idade:"), 
				value("Digite a Renda:"), 
				txt("Digite o CNPJ:"));
		
		System.out.println(
				"[------------------------------------------]"
		+ "\n[-------------- PESSOA FISICA -------------]"
		+ "\n[------------------------------------------]"
		+ "\n\nNome: " + objPF.getNome()
		+ "\nE-mail: " + objPF.getEmail()
		+ "\nIdade: " + objPF.getIdade()
		+ "\nRenda: " + objPF.getRenda()
		+ "\nCPF: " + objPF.getCpf()
		+ "\nIdentificador: " + objPF.identificador()
		+ "\nTaxa: " + objPF.pagarTaxa()
		+ "\n\n[------------------------------------------]"
		+ "\n[------------- PESSOA JURIDICA ------------]"
		+ "\n[------------------------------------------]"
		+ "\n\nNome da Empresa: " + objPJ.getNome()
		+ "\nE-mail: " + objPJ.getEmail()
		+ "\nIdade: " + objPJ.getIdade()
		+ "\nRenda: " + objPJ.getRenda()
		+ "\nCNPJ: " + objPJ.getCnpj()
		+ "\nIdentificador: " + objPJ.identificador()
		+ "\nTaxa: " + objPJ.pagarTaxa());

	}

}
