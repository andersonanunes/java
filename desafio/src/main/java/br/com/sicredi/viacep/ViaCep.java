package br.com.sicredi.viacep;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;

public class ViaCep {

	ViaCEP viacep = new ViaCEP();

	String cepString = viacep.getCep();
	String ruaString = viacep.getLogradouro();
	String complementoString = viacep.getComplemento();
	String bairroString = viacep.getBairro();
	String cidadeString = viacep.getLocalidade();
	String ufString = viacep.getUf();
	String ibgeString = viacep.getIbge();
	String giaString = viacep.getGia();

	public static void main(String[] args) throws ViaCEPException {


		ViaCEP viacep = new ViaCEP();
		viacep.buscar("06395-010");

		System.out.println(viacep.getHttpGET("https://viacep.com.br/ws/91060900/json/").toString());

	}

	@Override
	public String toString() {
		return "Endereço: " + ruaString + 
				"\nComplemento: " + complementoString + 
				"\nBairro: " + bairroString	+ 
				"\nCidade: " + cidadeString + 
				"\nUF: " + ufString + 
				"\nCod. IBGE: " + ibgeString + 
				"\nGia: " + giaString;
	}
	 

}
