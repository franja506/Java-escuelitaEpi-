package julieta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testDepositarEnCuenta() {
		Cuenta nuevaCuenta = new Cuenta(111);   //id de la cuenta
		nuevaCuenta.depositar(100);				//deposito en la cuenta 100
		assertTrue(nuevaCuenta.verSaldo() == 100);
	}
	
}

