package calculadoraSalario;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraSalarioTest {	

	
	private Funcionario funcDev;
	private Funcionario funcDBA;
	private Funcionario funcTest;
	private Funcionario funcGer;



	@Before
	public void setUp() throws Exception {
		
		this.funcDev = new Funcionario("volney", "volney@gmail.com", 3500.00, Cargo.DESENVOLVEDOR);
		this.funcDBA = new Funcionario("volney", "volney@gmail.com", 2500.00, Cargo.DESENVOLVEDOR);
		this.funcTest = new Funcionario("volney", "volney@gmail.com", 2500.00, Cargo.DESENVOLVEDOR);
		this.funcGer = new Funcionario("volney", "volney@gmail.com", 5500.00, Cargo.DESENVOLVEDOR);

	
	}
	
	@Test
	public void testaDesenvolvedor() throws Exception{
				
		Assert.assertEquals(Double.valueOf(2800), funcDev.getSalarioLiquido(), 0.0);
		funcDev.setSalarioBase(3000);
		Assert.assertEquals(Double.valueOf(2400), funcDev.getSalarioLiquido(), 0.0);
		funcDev.setSalarioBase(2500);
		Assert.assertEquals(Double.valueOf(2250), funcDev.getSalarioLiquido(), 0.0);
		funcDev.setSalarioBase(0);
		Assert.assertEquals(Double.valueOf(0), funcDev.getSalarioLiquido(), 0.0);
		
	}
	
	@Test
	public void testaDBA() throws Exception{
				
		Assert.assertEquals(Double.valueOf(1875), funcDBA.getSalarioLiquido(), 0.0);
		funcDBA.setSalarioBase(2000);
		Assert.assertEquals(Double.valueOf(1500), funcDBA.getSalarioLiquido(), 0.0);
		funcDBA.setSalarioBase(1500);
		Assert.assertEquals(Double.valueOf(1275), funcDBA.getSalarioLiquido(), 0.0);
		funcDBA.setSalarioBase(0);
		Assert.assertEquals(Double.valueOf(0), funcDBA.getSalarioLiquido(), 0.0);
		
	}
	
	
	
}