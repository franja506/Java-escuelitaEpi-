package pancho;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {
	@Test
	public void todosLosDatosAsignadosEnElConstructorSonCorrectos() {
		Cuenta cuenta = new Cuenta(123459678, 120, "Juan Perez");
		assertEquals(123459678, cuenta.getId());
		assertEquals(120, cuenta.getSaldo());
		assertEquals("Juan Perez", cuenta.getNombreCliente());
	}

	@Test
	public void deposito10PesosyElSaldoActualEs10() {
		Cuenta cuenta = new Cuenta(123456789, 0, "Juan Perez");
		cuenta.depositar(10);
		assertEquals(10, cuenta.getSaldo());
	}

	@Test
	public void depositoUnNumeroNegativoYNoMeDeja() {
		Cuenta cuenta = new Cuenta(12312, 12, "Juan Perez");
		assertEquals(false, cuenta.depositar(-10));
		assertEquals(12, cuenta.getSaldo());
	}

	@Test
	public void depositoMontoCeroYNoMeDeja() {
		Cuenta cuenta = new Cuenta(127894, 999, "Juan Perez");
		assertEquals(false, cuenta.depositar(0));
		assertEquals(999, cuenta.getSaldo());
	}

	@Test
	public void saco100PesosDeLaCuentayMeModificaElSaldo() {
		Cuenta cuenta = new Cuenta(123459678, 120, "Juan Perez");
		assertEquals(true, cuenta.extraer(100));
		assertEquals(20, cuenta.getSaldo());
	}

	@Test
	public void sacoUnMontoNegativoYNoMeDeja() {
		Cuenta cuenta = new Cuenta(123459678, 120, "Juan Perez");
		assertEquals(false, cuenta.extraer(-100));
		assertEquals(120, cuenta.getSaldo());
	}

	@Test
	public void sacoUnMontoCeroYNoMeDeja() {
		Cuenta cuenta = new Cuenta(123459678, 120, "Juan Perez");
		assertEquals(false, cuenta.extraer(0));
		assertEquals(120, cuenta.getSaldo());
	}

}
