package pancho;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComprobacionDatosCuentaCorriente {

	@Test
	public void todosLosDatosAsignadosEnElConstructorSonCorrectos() {
		CuentaCorriente cuenta = new CuentaCorriente(123459678,120,"Armando Paredes",3000);
		assertEquals(123459678,cuenta.getId());
		assertEquals(120,cuenta.getSaldo());
		assertEquals("Armando Paredes",cuenta.getNombreCliente());
	}
}
