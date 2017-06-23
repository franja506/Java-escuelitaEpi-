package christian;

import static org.junit.Assert.*;

import org.junit.Test;

import christianVaras.Cuenta;

public class CuentaTest {
	String nombreCliente = "Juan Perez";
	Cuenta cuenta = new Cuenta(125, nombreCliente);
	
	@Test
	public void laCuentaTieneNumero125() {
		assertEquals(125,cuenta.getIdCuenta());
	}
	
	@Test
	public void elNombreDeLaCuentaEsJuanPerez() {
		assertEquals(nombreCliente,cuenta.getNombreCliente());
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
		
		assertEquals(saldoExtraer,saldoExtraido);
	}
	
	public void tengo40DeSaldo() {
		assertEquals(40,cuenta.getSaldo());
	}
	

}
