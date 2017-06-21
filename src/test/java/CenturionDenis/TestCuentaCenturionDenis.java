package CenturionDenis;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestCuentaCenturionDenis {

	@Test
	public void testeaDepositar() {
		Cuenta c1 = new Cuenta(1);
		c1.depositar(11);
		Assert.assertEquals(11, c1.getSaldo());
		
	}
	
	@Test
	public void testeaExtraer(){
		Cuenta c2 = new Cuenta(1);
		c2.depositar(10);
		c2.extraer(6);
		Assert.assertEquals(4, c2.getSaldo());
	}

}
