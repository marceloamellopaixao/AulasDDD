package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteColaborador {

	public static void main(String[] args) {
		// Instânciar os objetos
		
		// String nome, String cargo, double valorHora
		Colaborador objColaborador = new Colaborador(JOptionPane.showInputDialog("Digite o nome do colaborador: "),
				JOptionPane.showInputDialog("Digite o cargo: "),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora do colaborador: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe a Quantidade de horas: ")));
		
		// String logradouro, int numero, String cep, String bairro, String cidade, String estado, String nacionalidade
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite o logradouro (Ex: Rua, Av, Rod e etc): "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")),
				JOptionPane.showInputDialog("Digite o CEP: "),
				JOptionPane.showInputDialog("Digite o bairro: "),
				JOptionPane.showInputDialog("Digite a cidade: "),
				JOptionPane.showInputDialog("Digite o estado: "),
				JOptionPane.showInputDialog("Digite a nacionalidade: "));
		
		objColaborador.setEndereco(objEndereco);
		
		System.out.println(
		  "----------\nColaborador: " + objColaborador.getNome() + "\n----------"
		+ "\n----------\nCargo: " + objColaborador.getCargo() + "\n----------" 
		+ "\n----------\nValor Hora: " + objColaborador.getValorHora() + "\n----------"
		+ "\n\n--------------------\nEndereço do Colaborador\n--------------------"
		+ "\n----------\nLogradouro: " + objColaborador.getEndereco().getLogradouro()
		+ "\nNº " + objColaborador.getEndereco().getNumero()
		+ "\nCEP: " + objColaborador.getEndereco().getCep()
		+ "\nBairro: " + objColaborador.getEndereco().getBairro()
		+ "\nCidade: " + objColaborador.getEndereco().getCidade()
		+ "\nEstado: " + objColaborador.getEndereco().getEstado()
		+ "\nNacionalidade: " + objColaborador.getEndereco().getNacionalidade() + "\n----------"
		+ "\nSalário do Colaborador: " + objColaborador.calcularSalario());
	}

}
