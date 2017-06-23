package christian;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import christian.Cuenta;

public class CuentaTest {
	Cuenta cuenta;
	String nombreCliente = "Juan Perez";
	long idCuenta = 125;
	
	public Cuenta buildCuenta() {
		return new Cuenta(idCuenta, nombreCliente);
	}
	
	@Before
	public void setup() {
		cuenta = this.buildCuenta();
	}
	
	@Test
	public void laCuentaTieneId125() {
		
		assertEquals(125,cuenta.getId());
	}
	
	@Test
	public void elNombreDeLaCuentaEsJuanPerez() {
		assertEquals(nombreCliente,cuenta.getNombreCliente());
	}
	
	@Test
	public void deposito50yTengo50DeSaldoActual() {
		long valorAgregar = 50;
		cuenta.depositar(valorAgregar);
		assertEquals(valorAgregar,cuenta.getSaldo());
	}
	
	@Test
	public void consultoSaldoInicialCero() {
		assertEquals(0,cuenta.getSaldo());
	}
	
	@Test
	public void deposito50yExtrae20Correctamente() {
		Cuenta cuenta = this.buildCuenta();
		cuenta.depositar(50);
		assertTrue(cuenta.extraer(20));
	}
	
	
	/* Fail Test */
	
	@Test
	public void extraigoUnMontoMayorAlSaldoInicial() {
		assertFalse(cuenta.extraer(20));
	}
	
	@Test
	public void extraigoUnMontoNegativo() {
		assertFalse(cuenta.extraer(-99));
	}
	
	@Test
	public void depositoUnMontoNegativo() {
		assertFalse(cuenta.depositar(-192));
	}

}
