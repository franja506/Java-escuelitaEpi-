package julieta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testDepositarEnCuenta() {
		Cuenta nuevaCuenta = new Cuenta(111);
		nuevaCuenta.depositar(100);
	}
	
}

