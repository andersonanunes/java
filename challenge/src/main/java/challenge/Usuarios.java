package challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Usuarios {
	
	String nome;
	String email;
	String password;
	String administrador;
	private String output;

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAdministrador() {
		return administrador;
	}
	
	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}

	
	public void getUsuarios() {
		// GET
		try{
			URL url = new URL("https://serverest.dev/usuarios");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			if (conn.getResponseCode() != 200) {
				System.out.print("deu erro... HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			System.out.println("Result Test1: .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public String postUsuarios(String payload) {
		// POST
		try {

			URL url = new URL("https://serverest.dev/usuarios");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			OutputStream os = conn.getOutputStream();
			os.write(payload.getBytes());
			os.flush();

			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Result Test2: .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return output;

	}
	
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + ", Email: " + this.getEmail() + ", Password: " + this.getPassword();
	}
}
