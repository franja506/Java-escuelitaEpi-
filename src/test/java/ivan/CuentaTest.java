package ivan;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void ExtraerNegativotest() {
		int nro = 1234;
		String cliente= "ivan delcuadri";
		Cuenta cuenta = new Cuenta(nro, cliente);
		cuenta.depositar(100);
		cuenta.extraer(-10);
		
		}
	
	@Test
	public void CrearCuentas(){
		int nro = 1234;
		String cliente= "ivan delcuadri";
		Cuenta cuenta = new Cuenta(nro, cliente);
	}
}
