package pancho;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExtraccionesCuenta {

	@Test
	public void saco100PesosDeLaCuentayMeModificaElSaldo(){
		Cuenta cuenta = new Cuenta(123459678,120,"Juan Perez");
		assertEquals(true, cuenta.extraer(100));
		assertEquals(20, cuenta.getSaldo());
	}
	
	@Test
	public void sacoUnMontoNegativoYNoMeDeja(){
		Cuenta cuenta = new Cuenta(123459678,120,"Juan Perez");
		assertEquals(false, cuenta.extraer(-100));
		assertEquals(120,cuenta.getSaldo());
	}
	
	@Test
	public void sacoUnMontoCeroYNoMeDeja(){
		Cuenta cuenta = new Cuenta(123459678,120,"Juan Perez");
		assertEquals(false, cuenta.extraer(0));
		assertEquals(120,cuenta.getSaldo());
	}

}
