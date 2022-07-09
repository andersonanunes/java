package br.com.sicredi.viacep;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ApiTest {

	// urlbase
	private static String urlBase = "https://viacep.com.br/ws/91060900/json/";


	private static ApiTest instancia;
	private CloseableHttpClient clienteHTTP;

	// construtor
	public ApiTest() {
		this.clienteHTTP = HttpClients.createDefault();
	}

	//
	public static ApiTest getInstancia() {
		if (instancia == null) {
			instancia = new ApiTest();
		}
		return instancia;
	}

	// metodo post
	public void postResponse() {

		try {
			HttpPost consultaPost = new HttpPost(ApiTest.urlBase);

			// handler
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
				@Override
				public String handleResponse(
					final HttpResponse response) throws ClientProtocolException, IOException {
					int status = response.getStatusLine().getStatusCode();
					if (status >= 200 && status < 300) {
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity) : null;
					} else {
						throw new ClientProtocolException("Erro Inesperado status: " + status);
					}
				}
			};

			String responseBody = this.clienteHTTP.execute(consultaPost, responseHandler);
			System.out.println("_______________________________________________________");
			System.out.println(responseBody);

		} catch (Exception e) {
			Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, e);
		}
	}

	// metodo get
	public String getRequest() {

		String responseBody = null;

		try {
			HttpGet consultaGet = new HttpGet(ApiTest.urlBase);

			// handler
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
				@Override
				public String handleResponse(
					final HttpResponse response) throws ClientProtocolException, IOException {
					int status = response.getStatusLine().getStatusCode();
					if (status >= 200 && status < 300) {
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity) : null;
					} else {
						throw new ClientProtocolException("Erro Inesperado status: " + status);
					}
				}
			};

			responseBody = this.clienteHTTP.execute(consultaGet, responseHandler);
			System.out.println("-----------------------------------------------");


		} catch (Exception e) {
			Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, e);
		}

		return responseBody;
	}

}
