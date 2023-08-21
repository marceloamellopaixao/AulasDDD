package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.beans.DadosPessoais;
import br.com.fiap.beans.Produto;

public class TesteCliente {

	public static void main(String[] args) {
		// Instânciar os Objetos (" NomeClasse nomeObjeto = new Classe(); ")
		
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		DadosPessoais objDdsPessoais = new DadosPessoais();
		Produto objProduto = new Produto();
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ")));
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		objCliente.setDadosPessoais(objDdsPessoais);
		
		// Objeto Endereço
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Nome do Logradouro: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número da casa: ")));
		objEndereco.setBairro(JOptionPane.showInputDialog("Digite o nome do Bairro: "));
		objEndereco.setMunicipio(JOptionPane.showInputDialog("Digite o municipio: "));
		objEndereco.setEstado(JOptionPane.showInputDialog("Digite seu Estado: "));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite seu CEP: "));
		
		
		// Objeto Telefone
		objTelefone.setTelFixo("(11)1234-5678");
		objTelefone.setTelCelular("(21) 91234-5678");
		objTelefone.setTelComercial("(14) 91234-5678");
		objTelefone.setTelContato("(61) 1234-5678");
		
		// Objeto Dados Pessoais
		objDdsPessoais.setRg("xx.xxx.xxx-x");
		objDdsPessoais.setCpf("xxx.xxx.xxx-xx");
		objDdsPessoais.setTitulo("xxxxxx-xx");
		objDdsPessoais.setDataNasc(JOptionPane.showInputDialog("Digite sua data de nascimento: "));
		
		// Objeto Produto
		objProduto.setNomeProduto("Placa de Vídeo RTX3090 12GB VRAM 256bits");
		objProduto.setMarcaProduto("NVIDIA");
		objProduto.setDescProduto("Esta placa de vídeo permite que você tenha gráficos ultra-realistas e etc.");
		objProduto.setValorProduto(3210.00);
		
		System.out.println(
		  "-----"
		+ "Dados Pessoais"
		+ "-----"
		+ "\n\nNome: " + objCliente.getNome() 
		+ "\nIdade: " + objCliente.getIdade()
		+ "\nPeso: " + objCliente.getPeso()
		+ "\nEndereço: " + objCliente.getEndereco().getLogradouro() 
		+ ", Nº " + objCliente.getEndereco().getNumero() 
		+ " - " + objCliente.getEndereco().getBairro() 
		+ ", " + objCliente.getEndereco().getMunicipio()
		+ " / " + objCliente.getEndereco().getEstado()
		+ ", CEP: " + objCliente.getEndereco().getCep()
		+ "\nTelefone: " + objCliente.getTelefone().getTelFixo()
		+ " | " + objCliente.getTelefone().getTelCelular()
		+ " | " + objCliente.getTelefone().getTelComercial()
		+ " | " + objCliente.getTelefone().getTelContato()
		+ "\n\n-----"
		+ "Documentos"
		+ "-----"
		+ "\n\nRG: " + objCliente.getDadosPessoais().getRg()
		+ "\nCPF: "  + objCliente.getDadosPessoais().getCpf()
		+ "\nTitulo:" + objCliente.getDadosPessoais().getTitulo()
		+ "\nData de Nasc: " + objCliente.getDadosPessoais().getDataNasc()
		+ "\n\n-----"
		+ "Produto"
		+ "-----"
		+ "\n\nNome do Produto: " + objProduto.getNomeProduto()
		+ "\nMarca: " + objProduto.getMarcaProduto()
		+ "\nDescrição: " + objProduto.getDescProduto()
		+ "\nValor: R$ " + objProduto.getValorProduto());
	}

}
