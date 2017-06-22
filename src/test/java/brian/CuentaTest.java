package brian;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testCuentaNueva() {
		CuentaCorriente cc = new CuentaCorriente(1, "Brian", 1000);
		cc.depositar(2000);
		assertEquals(false, cc.isGiroEnDescubiertoUtilizado());
		assertEquals(true, cc.extraer(3000));
		assertEquals(false, cc.extraer(3000));
		assertEquals(true, cc.isGiroEnDescubiertoUtilizado());
	}
}
