package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.PecasCarro;

public class TesteOficina {

	public static void main(String[] args) {
		// Instânciar objetos
		// String nome, String cnpj
		Oficina objOficina = new Oficina(JOptionPane.showInputDialog("Digite o nome da oficina: "),
				JOptionPane.showInputDialog("Digite o CNPJ: "));
		
		// String logradouro, int numero, String cep
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite o Logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")),
				JOptionPane.showInputDialog("Digite o CEP: "));
		
		// String marca, String modelo, int ano, double valor
		Carro objCarro = new Carro(JOptionPane.showInputDialog("Digite a Marca do Carro: "),
				JOptionPane.showInputDialog("Digite o Modelo do Carro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano do Carro: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Carro: ")));
		
		// String motor, String combustivel, String roda
		PecasCarro objPecasCarro = new PecasCarro(JOptionPane.showInputDialog("Digite o Motor do Carro: "),
				JOptionPane.showInputDialog("Digite o Combustível: "),
				JOptionPane.showInputDialog("Digite o Tipo de roda: "));
		
		// String nome, int idade, String rg, String cargo, double valorHora
		Colaborador objColaborador = new Colaborador(JOptionPane.showInputDialog("Digite o nome do Colaborador: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")),
				JOptionPane.showInputDialog("Digite o RG: "),
				JOptionPane.showInputDialog("Digite o Cargo: "),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor\\Hora: ")));
		
		// Oficina
		objOficina.setEndereco(objEndereco);
		objOficina.setCarro(objCarro);
		objOficina.setColaborador(objColaborador);

		// Carro
		objCarro.setPecasCarro(objPecasCarro);
		
		// Saídas
		System.out.println(
		  "---------------\nOficina\n---------------\n"
		+ "\nNome: " + objOficina.getNome() 
		+ "\nLogradouro da Oficina: " + objOficina.getEndereco().getLogradouro()
		+ "\nNúmero da Oficina: " + objOficina.getEndereco().getNumero()
		+ "\nCEP da Oficina: " + objOficina.getEndereco().getCep()
		+ "\n\n---------------\nCarro\n---------------\n"
		+ "\nMarca: " + objOficina.getCarro().getMarca()
		+ "\nModelo: " + objOficina.getCarro().getModelo()
		+ "\nAno: " + objOficina.getCarro().getAno()
		+ "\nValor: " + objOficina.getCarro().getValor()
		+ "\n\n---------------\nPeças do Carro\n---------------\n"
		+ "\nMotor: " + objCarro.getPecasCarro().getMotor()
		+ "\nCombustível: " + objCarro.getPecasCarro().getCombustivel()
		+ "\nRoda: " + objCarro.getPecasCarro().getRoda()
		+ "\n\n---------------\nColaborador da Oficina\n---------------\n"
		+ "\nNome: " + objOficina.getColaborador().getNome()
		+ "\nIdade: " + objOficina.getColaborador().getIdade()
		+ "\nRG: " + objOficina.getColaborador().getRg()
		+ "\nCargo: " + objOficina.getColaborador().getCargo()
		+ "\nValor\\Horas: " + objOficina.getColaborador().calcularTotalSalario(8));
	}

}
