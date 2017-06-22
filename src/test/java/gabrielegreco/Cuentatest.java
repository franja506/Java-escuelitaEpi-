package gabrielegreco;


import org.junit.Test;

import gabrielegreco.Cuenta;
import gabrielegreco.CuentaCorriente;

public class Cuentatest {

	@Test
	public void test() {
			int i=1234;
			Cuenta cuenta=new Cuenta(i,"Greco Gabriele");
			int deposito=100;
			cuenta.deposito(deposito);
			int monto=150;
			cuenta.extraccion(monto);
			cuenta.verSaldo();
			CuentaCorriente cuentacorriente=new CuentaCorriente(i,"Greco",1500);
	}

}
