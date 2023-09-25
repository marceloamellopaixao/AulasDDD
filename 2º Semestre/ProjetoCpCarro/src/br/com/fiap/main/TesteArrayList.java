package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;

public class TesteArrayList {
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
		
		List<Carro> listaCarro = new ArrayList<Carro>();
		
		Carro objCarro = null;
		
		int continuar = 0;
		
		while(continuar == 0) {
			objCarro = new Carro();
			objCarro.setMarca(txt("Digite a marca:"));
			objCarro.setModelo(txt("Digite o modelo:"));
			objCarro.setAno(num("Digite o ano:"));
			objCarro.setValor(real("Digite o valor:"));
			
			listaCarro.add(objCarro);
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja adquirir mais carros?", "Compra Online",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		};
		
		for (Carro carro : listaCarro) {
			System.out.println(
				    "[--------------------------------------------------------]" 
				+ "\n[-----------------------[ CARROS ]-----------------------]" 
				+ "\n[--------------------------------------------------------]\n"
				+ "\nMarca do Carro: " + carro.getMarca()
				+ "\nModelo do Carro: " + carro.getModelo()
				+ "\nAno do Carro: " + carro.getAno()
				+ "\nValor do Carro: " + carro.getValor()
				+ "\n");
		}

	}

}
