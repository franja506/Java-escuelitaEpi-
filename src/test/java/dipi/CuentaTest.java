package dipi;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class CuentaTest {

	@Test
	public void testCrearUnaCuenta() {
		Cuenta cuenta = new Cuenta(10);
		CuentaCorriente ca = new CuentaCorriente();
		
		cuenta.getId();
		
		System.out.println(ca.toString());
		System.out.println(cuenta.toString());
		
		assertEquals(cuenta.toString(), ca.toString());
	}
}
