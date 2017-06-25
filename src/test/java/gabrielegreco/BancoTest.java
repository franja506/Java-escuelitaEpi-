package gabrielegreco;

import static org.junit.Assert.*;

import org.junit.Test;

public class BancoTest {

	@Test
	public void testCreaDosCuentas() { //creo dos cuentas deposito y saco en una de las cuentas;
		Banco santanderRio = new Banco("SANTANDER RIO");
		santanderRio.agregarCliente("JUAN");
   		santanderRio.agregarCuenta("JUAN",2,-500);
		assertTrue(santanderRio.depositar("JUAN", 2, 600));
		assertEquals(600, santanderRio.verDatos("JUAN",2));
		assertTrue(santanderRio.extraer("JUAN", 2, 500));
		assertEquals(100, santanderRio.verDatos("JUAN",2));
	}
	@Test
	public void testCreanCuentaConIdExistente() { 
		Banco santanderRio = new Banco("SANTANDER RIO");
		santanderRio.agregarCliente("JUAN");
   		santanderRio.agregarCliente("TOMAS");
   		santanderRio.agregarCuenta("JUAN",2,-500);
   		assertFalse(santanderRio.agregarCuenta("TOMAS",2,0));
	}
	@Test
	public void testDepoistarSaldoNegativo() { //Deposito -500 en una Cuenta Corriente
		Banco santanderRio = new Banco("SANTANDER RIO");
		santanderRio.agregarCliente("JUAN");
   		santanderRio.agregarCuenta("JUAN",2,-500);
   		assertFalse(santanderRio.depositar("TOMAS",2,-600));
	}
	@Test
	public void testAvtivarGiroDescubierto() { //Activo girodescubierto en una Cuenta Corriente
		Banco santanderRio = new Banco("SANTANDER RIO");
		santanderRio.agregarCliente("JUAN");
   		santanderRio.agregarCuenta("JUAN",2,-1000);
		assertTrue(santanderRio.depositar("JUAN", 2, 600));
		assertTrue(santanderRio.extraer("JUAN", 2, 900));
		assertEquals(-300, santanderRio.verDatos("JUAN",2));
	}
	@Test
	public void crearDosCuentasConMismoNombre() { //Intento agregar dos clientes con mismo 
		Banco santanderRio = new Banco("SANTANDER RIO");//nombre
		santanderRio.agregarCliente("JUAN");
		assertFalse(santanderRio.agregarCliente("JUAN"));
	}
	@Test
	public void testAgregarmasCuentasQueCuentasCorrientes() { //creo dos cuentas deposito y saco en una de las cuentas;
		Banco santanderRio = new Banco("SANTANDER RIO");
		santanderRio.agregarCliente("JUAN");
   		santanderRio.agregarCuenta("JUAN",2,-500);
   		santanderRio.agregarCuenta("JUAN",3,0);
   		assertFalse(santanderRio.agregarCuenta("JUAN",4,0));

	}
}
