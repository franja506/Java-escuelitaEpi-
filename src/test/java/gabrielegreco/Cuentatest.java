package gabrielegreco;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cuentatest {

	Cuenta cuenta = new Cuenta(1234, "Greco Gabriele");
	boolean valor;
	@Test
	public void testMontoNegativo() {
		valor = cuenta.depositar(-100);
		assertFalse("Monto no depositado", valor);

	}
	@Test
	public void testMontoAceptado() {
		valor = cuenta.depositar(-100);
		assertFalse("Monto depositado", valor);
		
	}
}
