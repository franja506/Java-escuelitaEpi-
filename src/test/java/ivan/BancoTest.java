package ivan;

import static org.junit.Assert.*;

import org.junit.Test;

public class BancoTest {
	
	Banco banco = new Banco(1,"Banco Provincia");
	Cuenta c1 = new Cuenta(1,"ivan");
	CuentaCorriente c2 = new CuentaCorriente(2,"jose",100);
	Cliente cliente = new Cliente(1,"gustavo");
	
	@Test
	public void CreacionDelBancotest() {
		Banco b1 = new Banco(2,"Santander");
		assertEquals(2, b1.getId());
		assertEquals("Santander", b1.getNombre());
	}
	
	@Test
	public void AgregarCuentaAlBancoTest() {
		banco.agregarCuenta(c1);
		assertEquals(1,banco.getCuentas().size());
	}
	
	@Test
	public void AgregarCuentaRepetida() {
		banco.agregarCuenta(c1);
		banco.agregarCuenta(c1);
		assertEquals(1,banco.getCuentas().size());
	}
	
	@Test
	public void AgregarCuentaCorriente() {
		banco.agregarCuentaCorriente(c2);
		assertEquals(1,banco.getCuentasCorrientes().size());
	}
	
	@Test
	public void AgregarCuentaCorrienteRepetida() {
		banco.agregarCuentaCorriente(c2);
		banco.agregarCuentaCorriente(c2);
		assertEquals(1,banco.getCuentasCorrientes().size());
	}
	
	@Test
	public void AgregarCliente() {
		banco.agregarCliente(cliente);
		assertEquals(1,banco.getClientes().size());
	}
	
	@Test
	public void AgregarClienteRepetide() {
		banco.agregarCliente(cliente);
		banco.agregarCliente(cliente);
		assertEquals(1,banco.getClientes().size());
	}
	
	
	

}
