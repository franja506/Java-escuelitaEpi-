package ivan;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {
	Cliente cliente= new Cliente(1,"ivan");
	Cliente cli2= new Cliente(2,"pepe");
	Cliente cli3= new Cliente(2,"lg");
	CuentaCorriente c3 = new CuentaCorriente(3,cliente,100);
	CuentaCorriente c4 = new CuentaCorriente(4,cli2,10);
	CuentaCorriente c5 = new CuentaCorriente(5,cli3,100);
	
	@Test
	public void probarGiroFuncionando(){
		c3.depositar(10);
		c3.extraer(80);
		assertEquals(-70, c3.getSaldo());
	}
	
	@Test
	public void extraerMasDelGiro(){
		c4.depositar(10);
		c4.extraer(30);
		assertEquals(10, c4.getSaldo());
		assertFalse(c4.extraer(30));
	}
	
	
	@Test
	public void DepositarCorrienteTest(){
		c5.depositar(100);
		assertEquals(100, c5.getSaldo());
		assertTrue(c5.depositar(100));
	}

}
