package gabrielegreco;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {
	private boolean valor;
	 private CuentaCorriente cuenta=new CuentaCorriente(1324,"Greco Gabriele", -1500);
	@Test
	public void Deposito100() {
		valor=cuenta.depositar(600);
		assertTrue("Monto Depositado", valor);
	}
	@Test
	public void ActivarGiroDescubierto() {
		cuenta.depositar(500);
		valor=cuenta.extraer(1000);
		
		assertTrue("ExtraccionCompleta",valor);
		
	}
	@Test
	public void Deposito0() {
		valor=cuenta.depositar(0);
		assertFalse("ExtraccionCompleta",valor);
		
	}
	
	

}
