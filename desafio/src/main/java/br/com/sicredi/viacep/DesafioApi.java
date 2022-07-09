package br.com.sicredi.viacep;

import java.util.Scanner;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;

/**
 * Testa a classe ViaCEP
 */
public class DesafioApi implements br.com.parg.viacep.ViaCEPEvents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new DesafioApi().run();
    }
	
   
    public void run() {
        ViaCEP viaCEP = new ViaCEP(this);
        String cep;
        Scanner scan = new Scanner(System.in);
        System.out.println(DesafioApi.class.getName() + " - digite sair para fechar o teste!");
 
        do {
            System.out.print("Digite um cep: ");
            cep = scan.next();
            // consulta
            if (!cep.equals("sair")) {
                try {
                    viaCEP.buscar(cep);
                } catch (ViaCEPException ex) {
                    System.err.println("Ocorreu um erro na classe " + ex.getClasse() + ": " + ex.getMessage());
                }
            }
        } while (!cep.equals("sair"));
        scan.close();
    }

    public void retornaDadosCep(ViaCEP cep) {
        System.out.println();
        System.out.println("CEP " + cep.getCep() + " encontrado!");
        System.out.println("Logradouro: " + cep.getLogradouro());
        System.out.println("Complemento: " + cep.getComplemento());
        System.out.println("Bairro: " + cep.getBairro());
        System.out.println("Localidade: " + cep.getLocalidade());
        System.out.println("UF: " + cep.getUf());
        System.out.println("Ibge: " + cep.getIbge());
        System.out.println();
    }
    
    @Override
    public void onCEPSuccess(ViaCEP cep) {
        System.out.println();
        System.out.println("CEP " + cep.getCep() + " encontrado!");
        System.out.println("Logradouro: " + cep.getLogradouro());
        System.out.println("Complemento: " + cep.getComplemento());
        System.out.println("Bairro: " + cep.getBairro());
        System.out.println("Localidade: " + cep.getLocalidade());
        System.out.println("UF: " + cep.getUf());
        System.out.println("Gia: " + cep.getGia());
        System.out.println("Ibge: " + cep.getIbge());
        System.out.println();
    }

    @Override
    public void onCEPError(String cep) {
        System.out.println();
        System.out.println("Não foi possível encontrar o CEP " + cep + "!");
        System.out.println();
    }
    
    
}
