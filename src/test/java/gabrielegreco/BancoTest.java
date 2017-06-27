package gabrielegreco;


import static org.junit.Assert.*;

import org.junit.Test;

public class BancoTest {
	@Test
	 public void testPrueba(){
		Banco hsbc = new Banco("HSBC");
		Cliente juan = new Cliente("Juan");
		hsbc.agregarCliente(juan);
		Cuenta cuentaNueva=new Cuenta(32,-1000);
		assertTrue(hsbc.agregarCuenta(juan,cuentaNueva));
		assertTrue( hsbc.depositar(400,cuentaNueva,juan));
		assertEquals(400,hsbc.getSaldo(cuentaNueva));
		assertTrue(hsbc.extraer(cuentaNueva,600));
		assertEquals(-200,hsbc.getSaldo(cuentaNueva));
		
		
		
	}

	
	
}
