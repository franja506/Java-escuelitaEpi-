package vanessa;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	/*Cuentas Corrientes*/
	@Test
	public void testDepositosCuentaCorriente() {
		 
		CuentaCorriente c = new CuentaCorriente(1, "Vanessa Balleste", 100);
		boolean depositar = c.depositar(50);
		assertTrue(depositar);
		assertEquals(50, c.getSaldo());
		
	}
	
	@Test
	public void testExtraerCuentaCorriente() {
		CuentaCorriente c = new CuentaCorriente(1, "Vanessa Balleste", 100);
		boolean extraer = c.extraer(50);
		
		/*Extraer usando giro descubierto, queda saldo negativo*/
		assertTrue(extraer);
		assertEquals(-50, c.getSaldo());
		assertEquals(50, c.getMontoDisponibleGiroDescubierto());
		
		/*Extraer monto negativo*/
		extraer = c.extraer(-50);
		assertFalse(extraer);
			
		/*Extraer monto mayor al disponible*/
		extraer = c.extraer(500);	
	}
	
	@Test
	public void tesDepositarCuentaCorriente() {
		CuentaCorriente c = new CuentaCorriente(1, "Vanessa Balleste", 100);
		boolean depositar = c.depositar(50);
		assertTrue(depositar);
		assertEquals(50, c.getSaldo());
				
	}
	
	@Test
	public void tesDepositarCuentaCorrienteSaldoNeg() {
		CuentaCorriente c = new CuentaCorriente(1, "Vanessa Balleste", 50);
		boolean depositar = c.depositar(50);
		assertTrue(depositar);
		assertEquals(50, c.getSaldo());
	}
	
	@Test
	public void testGiroDescubierto() {
		CuentaCorriente c = new CuentaCorriente(1, "Vanessa Balleste", 100);
		assertEquals(100, c.giroEnDescubiertoHabilidado());
		c.depositar(50);
		assertEquals(100, c.giroEnDescubiertoHabilidado());
		
		/*Descontar de giro en descubierto, saldo negativo*/
		c.extraer(60);
		assertEquals(90, c.getMontoDisponibleGiroDescubierto());
		assertEquals(-10, c.getSaldo());
		
		/*Extraer monto mayor al saldo disponible luego de haber 
		 * quedado en saldo negativo, haciendo uso de giro descubierto*/
		assertFalse(c.extraer(100));
		
	}
}
