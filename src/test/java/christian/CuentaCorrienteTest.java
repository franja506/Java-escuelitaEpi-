package christian;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import christian.CuentaCorriente;

public class CuentaCorrienteTest {
	CuentaCorriente cuenta;
	long id;
	String nombreCliente = "Juan Perez";
	long cantGiroEnDescubierto = 100;
	
	public CuentaCorriente buildCuentaCorriente() {
		return new CuentaCorriente(id,nombreCliente,cantGiroEnDescubierto);
	}
	
	@Before
	public void setup() {
		cuenta = this.buildCuentaCorriente();
	}
	
	
	@Test
	public void tengo100DeGiroEnDescubiertoHabilitado() {
		assertEquals(cantGiroEnDescubierto,cuenta.giroEnDescubiertoHabilidado());
	}
	
	@Test
	public void extraigo150yNoPermitePorqueNoHaySuficienteGiro() {
		assertFalse(cuenta.extraer(150));
	}
	
	@Test
	public void extraigo100QueCoincideConElGiroEnDescubiertoHabilitado() {
		assertTrue(cuenta.extraer(100));
	}
	
	@Test
	public void extraigo80Deposito150YTengo70DeSaldo() {
		long extraer = 80;
		long depositar = 150;
		long saldoActual = 70;
		
		assertTrue(cuenta.extraer(extraer));
		assertTrue(cuenta.depositar(depositar));
		assertEquals(saldoActual, cuenta.getSaldo());
	}
	
	@Test
	public void Deposito500Extraigo100Extraigo450YTengoMenos50DeSaldo() 
	{
		assertTrue(cuenta.depositar(500));
		assertTrue(cuenta.extraer(100));
		assertTrue(cuenta.extraer(450));
		assertEquals(-50,cuenta.getSaldo());
	}
	
	@Test
	public void extraigo50Extraigo150YNoMePermitePorqueNoHaySuficienteGiro() {
		long extraer1 = 50;
		long extraer2 = 150;
		
		assertTrue(cuenta.extraer(extraer1));
		assertFalse(cuenta.extraer(extraer2));
	}
	
	@Test
	public void extraigo20yTengoMenos20DeSaldo() {
		assertTrue(cuenta.extraer(20));
		assertEquals(-20,cuenta.getSaldo());
	}
	
	
	
	
}
