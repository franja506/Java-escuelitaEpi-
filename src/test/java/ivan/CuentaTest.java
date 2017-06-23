package ivan;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {
	int nro = 1234;
	String cliente= "ivan delcuadri";
	Cuenta cuenta = new Cuenta(nro, cliente);
	Cuenta c2  = new Cuenta(2,"pepe");
	
	

	@Test
	public void ExtraerNegativotest() {
		
		cuenta.depositar(100);
		cuenta.extraer(-10);
		assertEquals(100, cuenta.getSaldo());
	
		
		}
	
	@Test
	public void extraerBien(){
		cuenta.depositar(100);
		cuenta.extraer(50);
		assertEquals(50, cuenta.getSaldo());
	}
	@Test
	public void DepositarNegativos(){
		c2.depositar(10);
		c2.depositar(-1);
		assertEquals(10, c2.getSaldo());
	}
	
	@Test
	public void DepositarTest(){
		c2.depositar(10);
		assertEquals(10, c2.getSaldo());
	}
	
	
}
