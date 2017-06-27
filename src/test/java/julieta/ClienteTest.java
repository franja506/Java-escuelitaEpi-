package julieta;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ClienteTest {
	
	Cliente unCliente = new Cliente("pepe");

	@Test
	public void testAgregarCuentaCorriente(){
		CuentaCorriente unaCuentaCorriente = unCliente.crearCuentaCorriente(221,8000);
		Set<Cuenta> resultadoEsperado = new HashSet<Cuenta>();
		resultadoEsperado.add(unaCuentaCorriente);	
		assertEquals(unCliente.getCuentas(), resultadoEsperado);
	}
	
	@Test(expected=excepcionCantidadDeCuentasCorrientesMenorQueCuentas.class)
	public void cantidadDeCuentasCorrientesMenorQueCuentas()
	{
		unCliente.crearCuenta(221);
	}
	
	@Test
	public void testAgregarCuenta(){
		CuentaCorriente unaCuentaCorriente = unCliente.crearCuentaCorriente(221,8000);
		Set<Cuenta> resultadoEsperado = new HashSet<Cuenta>();
		resultadoEsperado.add(unaCuentaCorriente);
		CuentaCorriente otraCuentaCorriente = unCliente.crearCuentaCorriente(222, 8000);
		resultadoEsperado.add(otraCuentaCorriente);
		Cuenta unaCuenta = unCliente.crearCuenta(111);
		resultadoEsperado.add(unaCuenta);
		assertEquals(unCliente.getCuentas(), resultadoEsperado);
	}
	
	@Test
	public void testDepositarEnCuenta(){
		unCliente.crearCuentaCorriente(221,8000);
		boolean salida = unCliente.depositarEnCuenta(221, 500);
		assertTrue(salida);
	}
	
	@Test
	public void testExtraerDeCuenta(){
		unCliente.crearCuentaCorriente(221,8000);
		unCliente.crearCuentaCorriente(222,8000);
		unCliente.crearCuenta(321);
		unCliente.depositarEnCuenta(321, 500);
		boolean salida = unCliente.extraerDeCuenta(321, 300);
		assertTrue(salida);
	}
	
	@Test(expected=excepcionFondosInsuficientes.class)
	public void testExtraerDeCuentaSinFondos(){
		unCliente.crearCuentaCorriente(221,8000);
		unCliente.crearCuentaCorriente(222,8000);
		unCliente.crearCuenta(321);
		unCliente.depositarEnCuenta(321, 500);
		unCliente.extraerDeCuenta(321, 600);
	}
}
