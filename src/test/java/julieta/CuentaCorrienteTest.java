package julieta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {
	
	CuentaCorriente nuevaCuenta = new CuentaCorriente(222,"pepe", 8000);

	@Test
	public void testDepositarEnCuentaCorriente() {
		nuevaCuenta.depositar(100);				
		assertEquals(100, nuevaCuenta.getSaldo());
	}
	
	@Test
	public void testExtraerDeCuentaCorriente(){
		nuevaCuenta.depositar(100);	
		nuevaCuenta.extraer(100);
		assertEquals(0 ,nuevaCuenta.getSaldo());
	}
	
	@Test
	public void testExtraerDeCuentaCorrienteEnGiroEnDescubierto(){
		nuevaCuenta.depositar(100);	
		nuevaCuenta.extraer(1100);
		assertEquals(7000 ,nuevaCuenta.getSaldo());
	}
	
	@Test
	public void testExtraerDeCuentaCorrienteMontoMayorAlMaximo(){
		nuevaCuenta.depositar(100);	
		boolean depositar = nuevaCuenta.extraer(9100);
		assertFalse(depositar);
	}

}
