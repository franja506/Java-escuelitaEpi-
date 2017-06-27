package julieta;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class BancoTest {
	Banco unBanco = new Banco("Galicia");
	Cliente unCliente = new Cliente("Julieta");
	
	@Test
	public void testAgregarCuentaAsociadaAUnCliente(){
		CuentaCorriente unaCuentaCorriente = unBanco.agregarCuentaCorrienteAsociadaAUnCliente(111, unCliente, 8000);
		CuentaCorriente otraCuentaCorriente = unBanco.agregarCuentaCorrienteAsociadaAUnCliente(112, unCliente, 7000);
		Cuenta unaCuenta = unBanco.agregarCuentaAsociadaAUnCliente(123, unCliente);
		Set<Cuenta> resultadoEsperado = new HashSet<Cuenta>();
		resultadoEsperado.add(unaCuentaCorriente);	
		resultadoEsperado.add(otraCuentaCorriente);
		resultadoEsperado.add(unaCuenta);
		assertEquals(unBanco.getCuentas(), resultadoEsperado);
	}
	
	@Test 
	public void testAgregarCuentaCorrienteAsociadaAUnCliente(){
		CuentaCorriente unaCuentaCorriente = unBanco.agregarCuentaCorrienteAsociadaAUnCliente(111, unCliente, 8000);
		Set<Cuenta> resultadoEsperado = new HashSet<Cuenta>();
		resultadoEsperado.add(unaCuentaCorriente);
		assertEquals(unBanco.getCuentas(), resultadoEsperado);
	}

	@Test(expected=excepcionIdRepetido.class)
	public void testAgregarCuentaCorrienteYaExistente(){
		unBanco.agregarCuentaCorrienteAsociadaAUnCliente(111, unCliente, 8000);
		unBanco.agregarCuentaCorrienteAsociadaAUnCliente(111, unCliente, 8000);
	}
}
