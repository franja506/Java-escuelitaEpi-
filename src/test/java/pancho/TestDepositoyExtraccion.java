package pancho;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDepositoyExtraccion {

	@Test
	public void agrego10PesosyElSaldoActualEs10() {
		Cuenta cuenta = new Cuenta(123456789,0);
		cuenta.depositar(10);
		assertEquals(10, cuenta.verSaldo());
		
		
	}
	
	@Test
	public void saco100PesosDeLaCuentayElsaldoEs20(){
		Cuenta cuenta = new Cuenta(123459678,120);
		cuenta.extraer(100);
		assertEquals(20, cuenta.verSaldo());
	}
	

}

