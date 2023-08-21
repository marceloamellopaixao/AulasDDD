package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteColaborador {
	
	// Metodo Static
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		// Instânciar os Objetos
		
		// String nome, String cargo, double valorHora, double quantidadeHoras, double percentual
		Colaborador objColaborador = new Colaborador(texto("Digite o nome: "),
				texto("Digite o cargo: "),
				decimal("Digite o valor/hora do colaborador: "),
				decimal("Digite a quantidade de horas: "),
				decimal("Digite o percentual de imposto de renda: "));
		
		// String logradouro, int numero, String cep
		Endereco objEndereco = new Endereco(texto("Digite o logradouro: "),
				inteiro("Digite o número: "),
				texto("Digite o CEP: "));
		
		objColaborador.setEndereco(objEndereco);
		
		// Saídas
		
		System.out.println("Nome do Colaborador: " + objColaborador.getNome() 
		+ "\nCargo: " + objColaborador.getCargo() 
		+ "\nValor Hora: " + objColaborador.getValorHora()
		+ "\nQuantidade de Horas: " + objColaborador.getQuantidadeHoras()
		+ "\nPercentual: " + objColaborador.getPercentual()
		+ "\n\nLogradouro: " + objColaborador.getEndereco().getLogradouro()
		+ "\nNúmero: " + objColaborador.getEndereco().getNumero()
		+ "\nCEP:" + objColaborador.getEndereco().getCep());
		
		System.out.println("\n\nSalário Bruto: " + objColaborador.calcularSalario());
		System.out.println("\nCálculo do Imposto de Renda: " + objColaborador.calcularIr());
		System.out.println("\nInformação: " + objColaborador.informacaoSalario());
		System.out.println("\nSalário Liquido: " + objColaborador.salarioLiquido());
	}

}
