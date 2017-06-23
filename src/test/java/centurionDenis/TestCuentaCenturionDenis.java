package centurionDenis;

import static org.junit.Assert.*;

import org.junit.Test;

import centurionDenis.Cuenta;
import junit.framework.Assert;

public class TestCuentaCenturionDenis {

	@Test
	public void testeaSiDepositar() {
		Cuenta c1 = new Cuenta(1, 0);
		c1.depositar(11);
		Assert.assertEquals(11, c1.getSaldo());
	}
	
	@Test
	public void testeaSiExtraer(){
		Cuenta c2 = new Cuenta(1, 0);
		c2.depositar(10);
		c2.extraer(6);
		Assert.assertEquals(4, c2.getSaldo());
	}
	
	@Test
	public void testeaDepositar(){
		Cuenta c = new Cuenta(1, 0, "Dennis");
		boolean bandera = c.depositar(100);
		Assert.assertTrue(bandera);
	}
	
	@Test
	public void testeaExtraer(){
		Cuenta c = new Cuenta(1, 0, "Dennis");
		boolean bandera = c.extraer(100);
		Assert.assertFalse(bandera);
	}
	
	@Test
	public void testeaNombreCliente(){
		Cuenta c2 = new Cuenta(1, 0);
		c2.setNombreCliente("Denis");
		Assert.assertEquals("Denis", c2.getNombreCliente());
		
	}
	
	@Test
	public void testeaNumeroDeCliente(){
		Cuenta c = new Cuenta(1);
		Assert.assertEquals(1, c.getNroCuenta());
	}

}
