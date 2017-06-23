package gabrielegreco;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {
	 
	@Test
	public void Depositoysaco() { //deposito 1000 y saca 100
		CuentaCorriente cuenta = new CuentaCorriente(1324, "Greco Gabriele", 0);
		assertTrue("Monto Depositado", cuenta.depositar(1000));
		assertEquals(1000, cuenta.getSaldo());
		cuenta.extraer(100);
		assertEquals(900, cuenta.getSaldo());

	}
	@Test
	public void Deposito1000() {//deposito100 activo giro descubierto
		CuentaCorriente cuenta = new CuentaCorriente(1324, "Greco Gabriele", -1000);
		assertTrue("Monto Depositado", cuenta.depositar(1000));
		assertEquals(1000, cuenta.getSaldo());
		cuenta.extraer(1500);
		assertEquals(-500, cuenta.getSaldo());

	}
	@Test
	public void Deposito0YSaco1000(){//Deposito 0 y saco 1000
		CuentaCorriente cuenta = new CuentaCorriente(1324, "Greco Gabriele",-1000);
		assertFalse("Monto Depositado", cuenta.depositar(0));
		assertEquals(0, cuenta.getSaldo());
		assertTrue("Monto Depositado", cuenta.extraer(1000));
		assertEquals(-1000, cuenta.getSaldo());
		
	}

}
