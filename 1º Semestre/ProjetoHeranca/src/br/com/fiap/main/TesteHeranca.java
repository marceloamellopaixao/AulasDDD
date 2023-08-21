package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.beans.Boi;
import br.com.fiap.beans.Humano;

public class TesteHeranca {

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
		// Instânciar os objetos

		// String nome, int idade, double peso, double velocidade, String rg
		Humano objHumano = new Humano(texto("Digite o nome do humano: "), 
				inteiro("Digite a idade do humano: "),
				decimal("Digite o peso do humano: "),
				decimal("Digite a velocidade do humano: "),
				texto("Digite o RG do humano: "));

		// String nome, int idade, double peso, double velocidade, double tamanhoChifre
		Boi objBoi = new Boi(texto("Digite o nome do boi: "), inteiro("Digite a idade do boi: "),
				decimal("Digite o peso do boi: "),
				decimal("Digite a velocidade do boi: "),
				decimal("Digite o tamanho do chifre do boi: "));
		
		System.out.println("Nome do humano: " + objHumano.getNome() 
		+ "\nIdade do humano: " + objHumano.getIdade()
		+ "\nPeso do humano: " + objHumano.getPeso()
		+ "\nVelocidade do humano: " + objHumano.getVelocidade()
		+ "\nRG do humano: " + objHumano.getRg()
		+ "\n\n"
		+ "Nome do boi: " + objBoi.getNome() 
		+ "\nIdade do boi: " + objBoi.getIdade()
		+ "\nPeso do boi: " + objBoi.getPeso()
		+ "\nVelocidade do boi: " + objBoi.getVelocidade()
		+ "\nTamanho do chifre do boi: " + objBoi.getTamanhoChifre());
	}

}
