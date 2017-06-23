package pancho;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExtraccionesCuentaCorriente {

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
	
	
	

}
