package pancho;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDepositosCuentaCorriente {

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
