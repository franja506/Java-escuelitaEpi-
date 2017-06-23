package centurionDenis;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestCuentaCorrienteCenturionDenis {

	@Test
	public void testeaCuentaCorriente(){
		CuentaCorriente c = new CuentaCorriente(1,0, "Dennis");
		c.depositar(50);
		c.extraer(100);
		Assert.assertEquals(-50, c.getSaldo());
	}

}
