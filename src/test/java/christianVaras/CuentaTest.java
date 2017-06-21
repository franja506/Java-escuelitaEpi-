package christianVaras;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {
	Cuenta cuenta = new Cuenta(125);
	
	@Test
	public void laCuentaTieneNumero125() {
		assertEquals(125,cuenta.getIdCuenta());
	}
	
	@Test
	public void agrego50PesosyTengo50DeSaldo() {
		long valorAgregar = 50;
		cuenta.agregarSaldo(valorAgregar);
		assertEquals(valorAgregar,cuenta.getSaldo());
	}
	
	@Test
	public void saco10YMeDevuelve10() {
		long saldoExtraer = 10; 
		long saldoExtraido = cuenta.extraerSaldo(saldoExtraer);
		
		assertEquals(10,saldoExtraido);
	}
	
	public void tengo40DeSaldo() {
		assertEquals(40,cuenta.getSaldo());
	}
	

}
