package brian;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testCuentaNueva() {
		Cuenta cuenta = new Cuenta(10, "Brian");
		cuenta.depositar(10);
		assertNotNull(cuenta);
		assertEquals(10, cuenta.getSaldo());	
	}
}
