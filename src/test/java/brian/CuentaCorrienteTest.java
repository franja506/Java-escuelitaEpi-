package brian;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {
	
	Cliente cliente = new Cliente("Brian");
	CuentaCorriente cc = new CuentaCorriente(1, 1000, cliente);

	@Test
	public void testDepositar() {
		// Meto 2000 en la cuenta corriente
		assertEquals(true, cc.depositar(2000));
		assertEquals(2000, cc.getSaldo());
	}

	@Test
	public void testExtraer() {
		// Si la operacion es exitosa la funcion devuelve true
		cc.depositar(2000);
		assertEquals(true, cc.extraer(1000));
		assertEquals(1000, cc.getSaldo());
	}

	@Test
	public void testGiroEnDescubierto() {
		// Meto 2000 en la cuenta corriente
		cc.depositar(2000);

		// Testeo de que el giro a descubierto no haya sido utilizado.
		assertEquals(false, cc.isGiroEnDescubiertoUtilizado());

		// Si la operacion es exitosa la funcion devuelve true
		assertEquals(true, cc.extraer(3000));

		// Caso contrario, devuelve false, ya que en este caso ya use el giro en
		// descubierto
		assertEquals(false, cc.extraer(3000));

		// Aca testeo de que el giro en descubierto haya sido utilizado, tiene
		// que devolver true
		assertEquals(true, cc.isGiroEnDescubiertoUtilizado());
		assertEquals(0, cc.getSaldo());
		
		cc.depositar(2000);
		assertFalse(cc.isGiroEnDescubiertoUtilizado());
		
	}
}
