package br.com.fiap.main;
import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Motor;

public class TesteCarro {

	public static void main(String[] args) {
		// Instanciar os objetos
		Carro objetoCarro = new Carro();
		Motor objetoMotor = new Motor();
		
		
		objetoCarro.setMarca("Chevrolet");
		objetoCarro.setModelo("Camaro");
		objetoCarro.setAno(2022);
		objetoCarro.setMotor(objetoMotor);
		objetoCarro.setValor(2500000.00);
		
		objetoMotor.setMarcaMotor("General Motors");
		objetoMotor.setTipoCambio("Automático");
		objetoMotor.setValvulas(32);
		objetoMotor.setPotencia(2.0);
		
		System.out.println(
				"Marca: " + objetoCarro.getMarca() + 
				"\nModelo: " + objetoCarro.getModelo() + 
				"\nAno: " + objetoCarro.getAno() + 
				"\n\nInfo Motor: " + 
				"\n- Marca do Motor: " + objetoMotor.getMarcaMotor() + 
				"\n- Tipo de Câmbio: " + objetoMotor.getTipoCambio() + 
				"\n- Válvulas: " + objetoMotor.getValvulas() + 
				"\n- Potência: " + objetoMotor.getPotencia() + 
				"\n\nValor: R$ " + objetoCarro.getValor()
		);
	}
}
