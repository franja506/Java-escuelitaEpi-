package GabrieleGreco;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cuentatest {

	@Test
	public void test() {
			int i=1234;
			Cuenta cuenta=new Cuenta(i);
			int deposito=100;
			cuenta.deposito(deposito);
			int monto=10;
			cuenta.extraccion(monto);
			cuenta.ver_saldo();
	}

}
