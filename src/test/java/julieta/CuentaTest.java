package julieta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	Cuenta nuevaCuenta = new Cuenta(111, "pepe");
	
	@Test
	public void testDepositarEnCuenta() {
		nuevaCuenta.depositar(100);				
		assertEquals(100, nuevaCuenta.getSaldo());
	}
	
	@Test
	public void testExtraerDeCuenta(){
		nuevaCuenta.depositar(100);	
		nuevaCuenta.extraer(100);
		assertEquals(0, nuevaCuenta.getSaldo());
	}
	
	@Test
	public void testDepositarEnCuentaMontoNegativo(){
		boolean depositar = nuevaCuenta.depositar(-10);
		assertFalse(depositar);
		assertEquals(0, nuevaCuenta.getSaldo());
	}
	
	@Test
	public void testExtraerEnCuentaMontoNegativo(){
		boolean extraer = nuevaCuenta.extraer(-10);
		assertFalse(extraer);
		assertEquals(0, nuevaCuenta.getSaldo());
	}
}

