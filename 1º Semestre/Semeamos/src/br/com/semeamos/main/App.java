package br.com.semeamos.main;

import javax.swing.JOptionPane;

import br.com.semeamos.beans.Agroindustria;
import br.com.semeamos.beans.CadastroResiduos;
import br.com.semeamos.beans.CategoriaInsumo;
import br.com.semeamos.beans.Contato;
import br.com.semeamos.beans.EmpresaFertilizante;
import br.com.semeamos.beans.Endereco;
import br.com.semeamos.beans.InformacoesProducao;
import br.com.semeamos.beans.Login;
import br.com.semeamos.beans.ProdutorRural;
import br.com.semeamos.beans.Raiz;
import br.com.semeamos.beans.Transacao;

public class App {

	static String inputString (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inputInt (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double inputDouble (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {

		EmpresaFertilizante objEmpresaFertilizante = new EmpresaFertilizante(
				inputString("Digite a RazãoSocial da Empresa: "),
				inputString("Digite o CNPJ da Empresa: ")
		);

		Endereco enderecoEmpresaFertilizante = new Endereco(
				inputString("Digite o logradouro da Empresa de Fertilizante: "),
				inputString("Digite o cep da Empresa de Fertilizante: "),
				inputString("Digite o bairro da Empresa de Fertilizante: "),
				inputString("Digite o estado da Empresa de Fertilizante: "),
				inputString("Digite a cidade da Empresa de Fertilizante: "),
				inputString("Digite o complemento da Empresa de Fertilizante: "),
				inputInt("Digite o número da Empresa de Fertilizante: ")
		);

		Contato contatoEmpresaFertilizante = new Contato(
				inputString("Digite o telefone(fixo) da Empresa de Fertilizante: "),
				inputString("Digite o celular da Empresa de Fertilizante: "),
				inputString("Digite o endereço e-mail da Empresa de Fertilizante: ")
		);

		Login loginEmpresaFertilizante = new Login(
			inputString("Digite o login de usuário da Empresa de Fertilizante: "),
			inputString("Digite a senha de usuário da Empresa de Fertilizante: ")
		);
		
		objEmpresaFertilizante.setEndereco(enderecoEmpresaFertilizante);
		objEmpresaFertilizante.setContato(contatoEmpresaFertilizante);
		objEmpresaFertilizante.setLogin(loginEmpresaFertilizante);
		
		ProdutorRural objProdutorRural = new ProdutorRural(
				inputString("Digite o nome completo do Produtor Rural: "),
				inputString("Digite o CPF do Produtor Rural: "),
				inputString("Digite o RG do Produtor Rural: ")
		);
		
		Endereco enderecoProdutorRural= new Endereco(
				inputString("Digite o logradouro do Produtor Rural: "),
				inputString("Digite o cep do Produtor Rural: "),
				inputString("Digite o bairro do Produtor Rural: "),
				inputString("Digite o estado do Produtor Rural: "),
				inputString("Digite a cidade do Produtor Rural: "),
				inputString("Digite o complemento do Produtor Rural: "),
				inputInt("Digite o número do Produtor Rural: ")
		);

		Contato contatoProdutorRural = new Contato(
				inputString("Digite o telefone(fixo) do Produtor Rural: "),
				inputString("Digite o celular do Produtor Rural: "),
				inputString("Digite o endereço e-mail do Produtor Rural: ")
		);

		Login loginProdutorRural = new Login(
			inputString("Digite o login de usuário do Produtor Rural: "),
			inputString("Digite a senha de usuário do Produtor Rural: ")
		);

		InformacoesProducao objInformacoesProducao = new InformacoesProducao(
			inputString("Digite o tipo da produção do Produtor Rural: "),
			inputDouble("Digite a quantidadeProduzida do Produtor Rural: "),
			inputDouble("Digite o preço avalidado da produção do Produtor Rural: ")
		);
		
		objProdutorRural.setEndereco(enderecoProdutorRural);
		objProdutorRural.setContato(contatoProdutorRural);
		objProdutorRural.setLogin(loginProdutorRural);
		objProdutorRural.setInformacoesProducao(objInformacoesProducao);
		
		Agroindustria objAgroindustria = new Agroindustria(
				inputString("Digite a RazãoSocial da Agroindustria: "),
				inputString("Digite o CNPJ da Agroindustria: ")
		);

		Endereco enderecoAgroindustria= new Endereco(
				inputString("Digite o logradouro da Agroindustria: "),
				inputString("Digite o cep da Agroindustria: "),
				inputString("Digite o bairro da Agroindustria: "),
				inputString("Digite o estado da Agroindustria: "),
				inputString("Digite a cidade da Agroindustria: "),
				inputString("Digite o complemento da Agroindustria: "),
				inputInt("Digite o número da Agroindustria: ")
		);

		Contato contatoAgroindustria = new Contato(
				inputString("Digite o telefone(fixo) da Agroindustria: "),
				inputString("Digite o celular da Agroindustria: "),
				inputString("Digite o endereço e-mail da Agroindustria: ")
		);

		Login loginAgroindustria = new Login(
			inputString("Digite o login de usuário da Agroindustria: "),
			inputString("Digite a senha de usuário da Agroindustria: ")
		);

		objAgroindustria.setEndereco(enderecoAgroindustria);
		objAgroindustria.setContato(contatoAgroindustria);
		objAgroindustria.setLogin(loginAgroindustria);
		
		CadastroResiduos objCadastroResiduos  = new CadastroResiduos(
				inputString("Digite o tipo do residuo: "),
				inputString("Digite o lote do residuo: "),
				inputDouble("Digite o peso do residuo: "),
				inputDouble("Digite o preço por KG do residuo: ")
		);

		CategoriaInsumo objCategoriaInsumo = new CategoriaInsumo(
				inputString("Digite a categoria do insumo: "),
				inputDouble("Digite o preço do insumo: "),
				inputDouble("Digite a quantidade comprada de insumo: ")
		);
		
		Transacao objTransacao = new Transacao(
				inputDouble("Digite o valor da Transação: "),
				inputString("Digite o tipo da Transação: ")
		);
		
		Transacao[] listaTransacao = new Transacao[] {
				objTransacao
		};
		
		Agroindustria[] listaAgroindustria = new Agroindustria[] {
				objAgroindustria
		};
		
		EmpresaFertilizante[] listaEmpresaFertilizante = new EmpresaFertilizante[] {
			objEmpresaFertilizante	
		};
		
		ProdutorRural[] listaProdutorRural = new ProdutorRural[] {
			objProdutorRural	
		};
		
		Raiz objRaiz = new Raiz();
		objRaiz.setTransacao(listaTransacao);
		objRaiz.setAgroindustria(listaAgroindustria);
		objRaiz.setEmpresaFertilizante(listaEmpresaFertilizante);
		objRaiz.setProdutorRural(listaProdutorRural);
		
		
		System.out.println("-------------------------------------------------------"
			+ "\n              Informações sobre o sistema"
			+ "\n-------------------------------------------------------"
		);
		
		System.out.println(
				  "\n*******************************************************"
				+ "\n          Informações Empresa de Fertilizante"
				+ "\n*******************************************************"
				+ "\n- Razão Social: " + objEmpresaFertilizante.getRazaoSocial()
				+ "\n- CNPJ: " + objEmpresaFertilizante.getCnpj()
				+ "\n*******************************************************"
				+ "\n           Informações de Endereço da Empresa"
				+ "\n*******************************************************"
				+ "\n- Logradouro: " + objEmpresaFertilizante.getEndereco().getLogradouro()
				+ "\n- Cep: " + objEmpresaFertilizante.getEndereco().getCep()
				+ "\n- Bairro: " + objEmpresaFertilizante.getEndereco().getBairro()
				+ "\n- Estado: " + objEmpresaFertilizante.getEndereco().getEstado()
				+ "\n- Cidade: " + objEmpresaFertilizante.getEndereco().getCidade()
				+ "\n- Complemento: " + objEmpresaFertilizante.getEndereco().getComplemento()
				+ "\n- Número: " + objEmpresaFertilizante.getEndereco().getNumero()
				+ "\n*******************************************************"
				+ "\n           Informações de Contato da Empresa"
				+ "\n*******************************************************"
				+ "\n- Telefone(fixo): " + objEmpresaFertilizante.getContato().getTelefone()
				+ "\n- Celular: " + objEmpresaFertilizante.getContato().getCelular()
				+ "\n- E-mail: " + objEmpresaFertilizante.getContato().getEmail()
				+ "\n*******************************************************"
				+ "\n           Informações de Usuário da Empresa"
				+ "\n*******************************************************"
				+ "\n- Login: " + objEmpresaFertilizante.getLogin().getLogin()
				+ "\n- Senha: " + objEmpresaFertilizante.getLogin().getSenha()
				+ "\n*******************************************************"
				+ "\n\n-------------------------------------------------------"
		);
		
		System.out.println(
				  "\n*******************************************************"
				+ "\n             Informações do Produtor Rural"
				+ "\n*******************************************************"
				+ "\n- Nome Completo: " + objProdutorRural.getNomeCompleto()
				+ "\n- CPF: " + objProdutorRural.getCpf()
				+ "\n- RG: " + objProdutorRural.getRg()
				+ "\n*******************************************************"
				+ "\n          Informações de Endereço do Produtor"
				+ "\n*******************************************************"
				+ "\n- Logradouro: " + objProdutorRural.getEndereco().getLogradouro()
				+ "\n- Cep: " + objProdutorRural.getEndereco().getCep()
				+ "\n- Bairro: " + objProdutorRural.getEndereco().getBairro()
				+ "\n- Estado: " + objProdutorRural.getEndereco().getEstado()
				+ "\n- Cidade: " + objProdutorRural.getEndereco().getCidade()
				+ "\n- Complemento: " + objProdutorRural.getEndereco().getComplemento()
				+ "\n- Número: " + objProdutorRural.getEndereco().getNumero()
				+ "\n*******************************************************"
				+ "\n           Informações de Contato do Produtor"
				+ "\n*******************************************************"
				+ "\n- Telefone(fixo): " + objProdutorRural.getContato().getTelefone()
				+ "\n- Celular: " + objProdutorRural.getContato().getCelular()
				+ "\n- E-mail: " + objProdutorRural.getContato().getEmail()
				+ "\n*******************************************************"
				+ "\n           Informações de Usuário da Empresa"
				+ "\n*******************************************************"
				+ "\n- Login: " + objProdutorRural.getLogin().getLogin()
				+ "\n- Senha: " + objProdutorRural.getLogin().getSenha()
				+ "\n*******************************************************"
				+ "\n          Informações da Produção do Produtor"
				+ "\n*******************************************************"
				+ "\n- Tipo da Produção: " + objProdutorRural.getInformacoesProducao().getTipoProducao()
				+ "\n- Quantidade Produzida: " + objProdutorRural.getInformacoesProducao().getQuantidadeProduzida()
				+ "\n- Proço Avaliado da Produção: " + objProdutorRural.getInformacoesProducao().getPrecoAvalidadoDaProducao()
				+ "\n*******************************************************"
				+ "\n\n-------------------------------------------------------"
		);
		
		System.out.println(
				  "\n*******************************************************"
				+ "\n             Informações da Agroindústria"
				+ "\n*******************************************************"
				+ "\n- Razão Social: " + objAgroindustria.getRazaoSocial()
				+ "\n- CNPJ: " + objAgroindustria.getCnpj()
				+ "\n*******************************************************"
				+ "\n        Informações de Endereço da Agroindústria"
				+ "\n*******************************************************"
				+ "\n- Logradouro: " + objAgroindustria.getEndereco().getLogradouro()
				+ "\n- Cep: " + objAgroindustria.getEndereco().getCep()
				+ "\n- Bairro: " + objAgroindustria.getEndereco().getBairro()
				+ "\n- Estado: " + objAgroindustria.getEndereco().getEstado()
				+ "\n- Cidade: " + objAgroindustria.getEndereco().getCidade()
				+ "\n- Complemento: " + objAgroindustria.getEndereco().getComplemento()
				+ "\n- Número: " + objAgroindustria.getEndereco().getNumero()
				+ "\n*******************************************************"
				+ "\n        Informações de Contato da AgroIndústria"
				+ "\n*******************************************************"
				+ "\n- Telefone(fixo): " + objAgroindustria.getContato().getTelefone()
				+ "\n- Celular: " + objAgroindustria.getContato().getCelular()
				+ "\n- E-mail: " + objAgroindustria.getContato().getEmail()
				+ "\n*******************************************************"
				+ "\n        Informações de Usuário da Agroindústria"
				+ "\n*******************************************************"
				+ "\n- Login: " + objAgroindustria.getLogin().getLogin()
				+ "\n- Senha: " + objAgroindustria.getLogin().getSenha()
				+ "\n*******************************************************"
				+ "\n\n-------------------------------------------------------"
		);
		
		System.out.println(
				  "\n*******************************************************"
				+ "\n                Informações de Residuos"
				+ "\n*******************************************************"
				+ "\n- Tipo do Residuo: " + objCadastroResiduos.getTipo()
				+ "\n- Lote do Residuo: " + objCadastroResiduos.getLote()
				+ "\n- Peso do residuo: " + objCadastroResiduos.getPeso()
				+ "\n- Perço do Residuo por KG: " + objCadastroResiduos.getPrecoKg()
				+ "\n- Calculo do preço: " + objCadastroResiduos.CalcularPreco(objCadastroResiduos.getPeso(), objCadastroResiduos.getPrecoKg())
				+ "\n*******************************************************"
				+ "\n\n-------------------------------------------------------"
		);
		
		System.out.println(
				  "\n*******************************************************"
				+ "\n            Informações de Categoria Insumo"
				+ "\n*******************************************************"
				+ "\n- Categoria do Insumo: " + objCategoriaInsumo.getCategoria()
				+ "\n- Preço do Insumo: " + objCategoriaInsumo.getPreco()
				+ "\n- Quantidade comprada de Insumo" + objCategoriaInsumo.getQuantidadeComprada()
				+ "\n- Calculo preço gasto: " + objCategoriaInsumo.CalcularPreco(objCategoriaInsumo.getPreco(), objCategoriaInsumo.getQuantidadeComprada())
				+ "\n*******************************************************"
				+ "\n\n-------------------------------------------------------"
		);

		System.out.println(
				  "\n*******************************************************"
				+ "\n               Informações da Transação"
				+ "\n*******************************************************"	
				+ "\n- Valor da Transação: " + objTransacao.getValor()
				+ "\n- Tipo da Transação: " + objTransacao.getTipo()
				+ "\n*******************************************************"
				+ "\n\n-------------------------------------------------------"
		);

		System.out.println(
				
				  "\n*******************************************************"
				+ "\n                  Informações da Raiz"
				+ "\n*******************************************************"	
				+ "\n- Listagem Empresas Fertilizante: " + objRaiz.verificaEmpresaFertilizante(objEmpresaFertilizante)
				+ "\n- Listagem Agroindústria: " + objRaiz.verificaAgroindustria(objAgroindustria)
				+ "\n- Listagem Produtor Rural: " + objRaiz.verificaProdutorRural(objProdutorRural)
				+ "\n- Listagem Transação: " + objRaiz.verificaTransacao(objTransacao)
				+ "\n*******************************************************"
				+ "\n\n-------------------------------------------------------"
		);
		
		
	}

}
