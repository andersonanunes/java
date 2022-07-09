package stepDefinitions;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import br.com.sicredi.viacep.DesafioApi;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;



public class DesafioApiTestSteps {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}
	
    ViaCEP viaCEP = new ViaCEP();
    String cep;
    String cepInexistente;
    String cepInvalido;
    Scanner scan = new Scanner(System.in);
	
    @Test
	@Dado("que o usuario inseri um CEP valido")
	public String que_o_usuario_inseri_um_cep_valido() {
        System.out.println(DesafioApi.class.getName() + " - digite sair para fechar o teste!");
        System.out.print("Digite um cep: ");
        cep = scan.next();
        return cep;
    }


	@Quando("o servico e consultado")
	public void o_servico_e_consultado() {	
		String cepRecebido = cep;
		do {
        	System.out.println("CEP: " + cep);
            // consulta
            if (!cepRecebido.equals("sair")) {
                try {
                    viaCEP.buscar(cepRecebido);
                    break;
                } catch (ViaCEPException ex) {
                	System.out.println("\n*********************************************************************************************************");
                	System.err.println("\nOcorreu um erro na classe " + ex.getClasse() + ": " + ex.getMessage());
                	System.out.println("\n*********************************************************************************************************");
                	break;
                }
            }
        } while (!cepRecebido.equals("sair"));
	}

	@Entao("e retornado o CEP, logradouro, complemento, bairro, localidade, uf e ibge.")
	public void e_retornado_o_cep_logradouro_complemento_bairro_localidade_uf_e_ibge() {
        System.out.println();
        System.out.println("CEP " + viaCEP.getCep() + " encontrado!");
        System.out.println("Logradouro: " + viaCEP.getLogradouro());
        System.out.println("Complemento: " + viaCEP.getComplemento());
        System.out.println("Bairro: " + viaCEP.getBairro());
        System.out.println("Localidade: " + viaCEP.getLocalidade());
        System.out.println("UF: " + viaCEP.getUf());
        System.out.println("Ibge: " + viaCEP.getIbge());
        System.out.println();
	}

	@Test
	@Dado("que o usuario inseri um CEP que nao exista na base dos Correios")
	public String que_o_usuario_inseri_um_cep_que_nao_exista_na_base_dos_correios() {

        System.out.println(DesafioApi.class.getName() + " - digite sair para fechar o teste!");
        System.out.print("Digite um cep: ");
        cep = scan.next();
        cepInexistente = cep;
        return cepInexistente;

	}

	@Entao("e retornada um atributo erro")
	public void e_retornada_um_atributo_erro() {
        System.out.println();
        System.out.println("Atributo inválido " + cep + "!");
        System.out.println();		
	}

	@Test
	@Dado("que o usuario inseri um CEP com formato invalido")
	public String que_o_usuario_inseri_um_cep_com_formato_invalido() {
        System.out.println(DesafioApi.class.getName() + " - digite sair para fechar o teste!");
        System.out.print("Digite um cep: ");
        cep = scan.next();
        cepInvalido = cep;
        return cepInvalido;
	}

	@Entao("e retornado uma mensagem de erro")
	public void e_retornado_uma_mensagem_de_erro() {
        System.out.println();
        System.out.println("Não foi possível encontrar o CEP " + cep + "!");
        System.out.println();
	}

}
