package julieta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {
	
	CuentaCorriente nuevaCuenta = new CuentaCorriente(222,"pepe", "Banco Galicia", 8000);

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
		boolean extraer = nuevaCuenta.extraer(9100);
		assertFalse(extraer);
	}

	@Test
	public void testVolverAExtraerPagandoLaDeuda(){
		nuevaCuenta.depositar(100);	
		nuevaCuenta.extraer(8100);
		nuevaCuenta.depositar(8100);
		boolean extraer = nuevaCuenta.extraer(100);
		assertTrue(extraer);
	}
	
	@Test
	public void testVolverAExtraerConGiroPagandoLaDeuda(){
		nuevaCuenta.depositar(100);	
		nuevaCuenta.extraer(8100);
		nuevaCuenta.depositar(8100);
		boolean extraer = nuevaCuenta.extraer(1100);
		assertTrue(extraer);
	}
	
	@Test
	public void testSaldoDispinible(){
		nuevaCuenta.depositar(100);	
		nuevaCuenta.extraer(8100);
		nuevaCuenta.depositar(8100);
		nuevaCuenta.extraer(1100);
		assertEquals(7000 ,nuevaCuenta.getSaldo());
	}
	
	@Test
	public void testExtraerMontoNegativo(){
		boolean extraer = nuevaCuenta.extraer(-100);
		assertFalse(extraer);
	}
	
	@Test
	public void testDepositarMontoNegativo(){
		boolean depositar = nuevaCuenta.depositar(-100);
		assertFalse(depositar);
	}
}
