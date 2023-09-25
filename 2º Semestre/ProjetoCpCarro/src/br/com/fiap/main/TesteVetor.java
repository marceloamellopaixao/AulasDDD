package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;

public class TesteVetor {
	
	static String txt(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int num(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		// Instânciar o objeto
		
		Carro[] objCarro = new Carro[5];
		
		int indice = 0;
		
		do {
			
			objCarro[indice] = new Carro();
			objCarro[indice].setMarca(txt("Digite a marca:"));
			objCarro[indice].setModelo(txt("Digite o modelo:"));
			objCarro[indice].setAno(num("Digite o ano:"));
			objCarro[indice].setValor(real("Digite o valor:"));
			
			indice++;
			
		}while(JOptionPane.showConfirmDialog(null, "Deseja adquirir mais carros?", "Compras Online",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		for (int contador = 0; contador < indice; contador++) {
			System.out.println(
					    "[--------------------------------------------------------]" 
					+ "\n[-----------------------[ CARROS ]-----------------------]" 
					+ "\n[--------------------------------------------------------]\n"
					+ "\nMarca do Carro: " + objCarro[contador].getMarca()
					+ "\nModelo do Carro: " + objCarro[contador].getModelo()
					+ "\nAno do Carro: " + objCarro[contador].getAno()
					+ "\nValor do Carro: " + objCarro[contador].getValor()
					+ "\n");
		}
		
	}

}
