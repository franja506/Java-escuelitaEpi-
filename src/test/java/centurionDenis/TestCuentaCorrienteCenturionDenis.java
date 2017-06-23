package centurionDenis;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestCuentaCorrienteCenturionDenis {
	
	@Test
	public void testeaGetNombre(){
		CuentaCorriente c = new CuentaCorriente(1, 0, "Dennis");
		assertEquals(1, c.getNroCuenta());
		assertEquals(0, c.getSaldo());
		assertEquals(c.getNombreCliente(), "Dennis");
	}
	
	@Test
	public void testeaDepositar(){
		CuentaCorriente c = new CuentaCorriente(1,0, "asd");
		c.depositar(100);
		assertEquals(100, c.getSaldo());
	}

	@Test
	public void testeaCuentaCorriente(){
		CuentaCorriente c = new CuentaCorriente(1,0, "Dennis");
		assertTrue(c.depositar(50));
		assertTrue(c.extraer(100));
		assertEquals(-50, c.getSaldo());
	}
	
	@Test
	public void testeaExtraerMasDeLaCantidad(){
		CuentaCorriente c = new CuentaCorriente(1,0, "Dennis");
		c.depositar(50);
		boolean a = c.extraer(5000);
		assertTrue(a);
	}
	
}