package vanessa;

import static org.junit.Assert.*;

import org.junit.Test;

import vanessa.Cuenta;

public class CuentaTest {

	/*Cuentas */
	@Test
	public void testDepositosCuenta() {
		Cuenta c = new Cuenta(1, "Vanessa Balleste");
		boolean depositar = c.depositar(50);
		assertTrue(depositar);
		assertEquals(50, c.getSaldo());
		
		depositar = c.depositar(-50);
		assertFalse(depositar);
		assertEquals(50, c.getSaldo());
	}
	
	@Test
	public void testExtraccionMayorAlSaldoCuenta() {
		Cuenta c = new Cuenta(1, "Vanessa Balleste");
		c.depositar(50);
		boolean extraer = c.extraer(60);
		assertFalse(extraer);
		assertEquals(50, c.getSaldo());
		
		assertFalse(c.extraer(-50));
		assertEquals(50, c.getSaldo());
	}
			
	
}
