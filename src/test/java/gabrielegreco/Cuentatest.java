package gabrielegreco;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cuentatest {

	@Test
	public void testMontoNegativo() {
		Cuenta cuenta = new Cuenta(1234, "Greco Gabriele");
		assertFalse("Monto no depositado",cuenta.depositar(-100));
		assertEquals(0, cuenta.getSaldo());
	}
	@Test
	public void testMontoAceptado() {
		Cuenta cuenta = new Cuenta(1234, "Greco Gabriele");
		assertTrue("Monto depositado",cuenta.depositar(1500));
		assertEquals(1500, cuenta.getSaldo());
	
		
	}
}
