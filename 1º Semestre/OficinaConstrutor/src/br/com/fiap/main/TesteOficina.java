package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.PecasCarro;

public class TesteOficina {

	public static void main(String[] args) {
		// Instanciar os objetos
		Oficina objOficina = new Oficina(JOptionPane.showInputDialog("Digite o Nome: "),
				JOptionPane.showInputDialog("Digite o CNPJ: "));
		
		Colaborador objColaborador = new Colaborador();
		
		// String logradouro, int numero, String bairro, String municipio, String estado, String cep
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite o logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")),
				JOptionPane.showInputDialog("Digite o Bairro: "),
				JOptionPane.showInputDialog("Digite o Munícipio: "),
				JOptionPane.showInputDialog("Digite o Estado: "),
				JOptionPane.showInputDialog("Digite o CEP: "));
		
		Carro objCarro = new Carro();
		
		PecasCarro objPecasCarro = new PecasCarro();
		
		// Oficina
		objOficina.setCarro(objCarro);
		objOficina.setEndereco(objEndereco);
		objOficina.setColaborador(objColaborador);
		
		// Carro
		objCarro.setPecasCarro(objPecasCarro);
		
		System.out.println("Nome da Oficina: " + objOficina.getNome() 
		+ "\nLogradouro: " + objOficina.getEndereco().getLogradouro()
		+ "\n" + objOficina.getEndereco().getNumero()
		+ "\n" + objOficina.getEndereco().getBairro()
		+ "\n" + objOficina.getEndereco().getMunicipio()
		+ "\n" + objOficina.getEndereco().getEstado()
		+ "\n" + objOficina.getEndereco().getCep());
	}

}
