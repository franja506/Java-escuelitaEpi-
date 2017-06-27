package julieta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	Cuenta nuevaCuenta = new Cuenta(111, null);
	
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
	
	@Test(expected=excepcionMontoNegativo.class)
	public void testDepositarEnCuentaMontoNegativo(){
		nuevaCuenta.depositar(-10);
	}
	
	@Test(expected=excepcionMontoNegativo.class)
	public void testExtraerEnCuentaMontoNegativo(){
		nuevaCuenta.extraer(-10);
	}
}

