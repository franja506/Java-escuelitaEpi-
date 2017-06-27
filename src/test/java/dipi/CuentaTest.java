package dipi;

import static org.junit.Assert.fail;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testCrearUnaCuenta() {
		Cuenta cuenta = new Cuenta(10);
		
		try {
			cuenta.extraer(-1);
			fail("Deberia tirar exception.");
		} catch (MontoNegativoCuentaException e) {
			//do nothing test passes. 
		}
		
		
//		System.out.println(ca.toString());
//		System.out.println(cuenta.toString());
//		
//		assertEquals(cuenta.toString(), ca.toString());
	}
}
