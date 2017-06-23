package pancho;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComprobacionDatosCuenta {

	@Test
	public void todosLosDatosAsignadosEnElConstructorSonCorrectos() {
		Cuenta cuenta = new Cuenta(123459678,120,"Juan Perez");
		assertEquals(123459678,cuenta.getId());
		assertEquals(120,cuenta.getSaldo());
		assertEquals("Juan Perez",cuenta.getNombreCliente());
	}
}
