package calculadoraSalario;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraSalarioTest {	

	private Funcionario func1;
	private Funcionario func2;
	private Funcionario func3;
	private Funcionario func0;


	@Before
	public void setUp() throws Exception {
		
		this.func1 = new Funcionario("volney", "volney@gmail.com", 3500.00, Cargo.DESENVOLVEDOR);
		this.func2 = new Funcionario("volney", "volney@gmail.com", 2500.00, Cargo.DESENVOLVEDOR);
		this.func3 = new Funcionario("volney", "volney@gmail.com", 3000.00, Cargo.DESENVOLVEDOR);
		this.func0 = new Funcionario("volney", "volney@gmail.com", 0.00, Cargo.DESENVOLVEDOR);

	}
	
	@Test
	public void testaDesenvolvedor() throws Exception{
				
		Assert.assertEquals(Double.valueOf(2800), func1.getSalarioLiquido(), 0.0);
		Assert.assertEquals(Double.valueOf(2250), func2.getSalarioLiquido(), 0.0);
		Assert.assertEquals(Double.valueOf(2400), func3.getSalarioLiquido(), 0.0);
		Assert.assertEquals(Double.valueOf(0), func0.getSalarioLiquido(), 0.0);
		
	}
	
	
	
}