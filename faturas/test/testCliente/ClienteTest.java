package testCliente;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
	
	private ClienteFacade cf = new ClienteFacade();
	private Cliente cliente;
	
	@Before
	public void criaCliente() {
		cliente = cf.criaCliente("Jorginho", "12/04/2023", "PB");
	}
	
	@Test
	public void testeCriaCliente() {
		/* TODO */
	}
	
	@Test
	public void testeCriaClienteExceptions() {
		/* TODO */
	}
	
	@Test
	public void testeEditaCliente() {
		/* TODO */
	}
	
	@Test
	public void testeEditaClienteExceptions() {
		/* TODO */
	}

}
