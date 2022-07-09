
import static org.junit.Assert.assertEquals;

import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;

import challenge.Usuarios;


public class UsuariosTest {

	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void listarUsuarios() {
		
		Usuarios users = new Usuarios();
		users.getUsuarios();
		assertEquals(HttpStatus.SC_OK, 200);

	}
	
	
	@Test
	public void cadastrarNovoUsuario() {
		
		Usuarios users = new Usuarios();
		String payload = "{\"nome\":\"teste123\",\"email\":\"sadfadfa@email.com.br\",\"password\":\"teste123\",\"administrador\":\"true\"}";
		users.postUsuarios(payload);
        assertEquals(HttpStatus.SC_CREATED, 201);

	}

}
