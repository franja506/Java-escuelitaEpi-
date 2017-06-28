package brian;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {
	Cliente cliente = new Cliente("Brian");
	Cuenta c = new Cuenta(1, cliente);

	@Test
	public void testDepositar() {
		// Meto 2000 en la cuenta corriente
		assertEquals(true, c.depositar(2000));
		assertEquals(2000, c.getSaldo());
	}

	@Test
	public void testExtraer() {
		// Si la operacion es exitosa la funcion devuelve true
		c.depositar(2000);
		assertEquals(true, c.extraer(1000));
		assertEquals(1000, c.getSaldo());
		assertEquals(false, c.extraer(3000));
	}
}
