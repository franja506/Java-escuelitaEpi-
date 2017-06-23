package pancho;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void todosLosDatosAsignadosEnElConstructorSonCorrectos() {
		CuentaCorriente cuenta = new CuentaCorriente(123459678,120,"Armando Paredes",3000);
		assertEquals(123459678,cuenta.getId());
		assertEquals(120,cuenta.getSaldo());
		assertEquals("Armando Paredes",cuenta.getNombreCliente());
	}
	
	@Test
	public void extraigoUnMontoCeroYNoMeDeja() {
		CuentaCorriente cuenta = new CuentaCorriente(123456789,1235,"Armando Paredes",3000);
		assertEquals(false, cuenta.extraer(0));
		assertEquals(1235, cuenta.getSaldo());
	}
	
	@Test
	public void extraigoUnMontoNegativoYNoMeDeja() {
		CuentaCorriente cuenta = new CuentaCorriente(123456789,1000,"Armando Paredes",3000);
		assertEquals(false, cuenta.extraer(-100));
		assertEquals(1000, cuenta.getSaldo());
	}
	
	@Test 
	public void extraigoUnMontoYMeModificaElSaldo() {
		CuentaCorriente cuenta = new CuentaCorriente(123456789,12000,"Armando Paredes",3000);
		assertEquals(true, cuenta.extraer(14500));
		assertEquals(-2500, cuenta.getSaldo());
	}
	@Test
	public void extraigoUnMontoSuperiorAlQuePuedoYNoMeDeja() {
		CuentaCorriente cuenta = new CuentaCorriente(123459,12000,"Armando Paredes",3000);
		assertEquals(false, cuenta.extraer(16000));
		assertEquals(12000, cuenta.getSaldo());
	}
	
	@Test 
	public void giroEnDescubiertoYLuegoDeposito() {
		CuentaCorriente cuenta = new CuentaCorriente(123459,0,"Armando Paredes",100);
		assertTrue(cuenta.extraer(50));
		assertEquals(-50, cuenta.getSaldo());
		
	}
	
	@Test
	public void depositoUnMontoYSeActualizaElSaldo() {
		CuentaCorriente cuenta = new CuentaCorriente(123456789,0,"Armando Paredes",3000);
		cuenta.depositar(77758);
		assertEquals(77758, cuenta.getSaldo());
	}
	
	@Test
	public void depositoUnNumeroNegativoYNoMeDeja() {
		CuentaCorriente cuenta = new CuentaCorriente(12312,12,"Armando Paredes",300);
		assertEquals(false,cuenta.depositar(-10));
		assertEquals(12, cuenta.getSaldo());
	}
	
	@Test
	public void depositoMontoCeroYNoMeDeja() {
		CuentaCorriente cuenta = new CuentaCorriente(127894,999,"Armando Paredes",1000);
		assertEquals(false,cuenta.depositar(0));
		assertEquals(999, cuenta.getSaldo());
	}

}
