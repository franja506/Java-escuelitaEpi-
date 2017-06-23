package pancho;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDepositosCuenta {

	@Test
	public void deposito10PesosyElSaldoActualEs10() {
		Cuenta cuenta = new Cuenta(123456789,0,"Juan Perez");
		cuenta.depositar(10);
		assertEquals(10, cuenta.getSaldo());
	}
	
	@Test
	public void depositoUnNumeroNegativoYNoMeDeja() {
		Cuenta cuenta = new Cuenta(12312,12,"Juan Perez");
		assertEquals(false,cuenta.depositar(-10));
		assertEquals(12, cuenta.getSaldo());
	}
	
	@Test
	public void depositoMontoCeroYNoMeDeja() {
		Cuenta cuenta = new Cuenta(127894,999,"Juan Perez");
		assertEquals(false,cuenta.depositar(0));
		assertEquals(999, cuenta.getSaldo());
	}
	
}

