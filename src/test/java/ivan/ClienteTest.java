package ivan;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	Cliente cli = new Cliente(1,"ivan");
	Cliente cli2 = new Cliente(2,"javier");
	Cliente cli3 = new Cliente(3,"florencia");
	Cliente cli4 = new Cliente(4,"nico");
	Cuenta c1 = new Cuenta(1,cli2);
	Cuenta c3 = new Cuenta (4,cli3);
	CuentaCorriente c2 = new CuentaCorriente(1,cli4,100);
	
	
	@Test
	public void CreacionClienteTest() {
		Cliente cliente = new Cliente (2,"pepe");
		assertEquals(2, cliente.getId());
		assertEquals("pepe",cliente.getNombre());
	}
	
	@Test
	public void agregarCuentaSinTenerCC() {
		cli.agregarCuenta(c1);
		assertEquals(0, cli.getCuentas().size());
	}
	
	@Test
	public void agregarCuenta() {
		cli.agregarCuenta(c2);
		cli.agregarCuenta(new CuentaCorriente(34,cli4,1000));
		cli.agregarCuenta(new Cuenta(23,cli4));
		assertEquals(3, cli.getCuentas().size());
	}
	
	
	@Test
	public void agregarCuentaRepetida() {
		Cliente cli2 = new Cliente(3,"felipe"); 
		cli2.agregarCuenta(new CuentaCorriente(3,cli2,120));
		cli2.agregarCuenta(new CuentaCorriente(5,cli2,100));
		cli2.agregarCuenta(c3);
		assertEquals(3, cli2.getCuentas().size());
		cli2.agregarCuenta(c3);
		assertEquals(3, cli2.getCuentas().size());
	}
	
	@Test
	public void agregarCuentaCorriente() {
		cli.agregarCuenta(c2);
		assertEquals(1, cli.getCuentas().size());
	}
	
	@Test
	public void agregarCuentaCorrienteRepetida() {
		cli.agregarCuenta(c2);
		cli.agregarCuenta(c2);
		assertEquals(1, cli.getCuentas().size());
	}
	
  

}
