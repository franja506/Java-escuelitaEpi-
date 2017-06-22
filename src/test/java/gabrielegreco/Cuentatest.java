package gabrielegreco;
import org.junit.Test;

import gabrielegreco.Cuenta;
import gabrielegreco.CuentaCorriente;

public class Cuentatest {

	@Test
	public void testNNNNNN() {
			int i=1234;
			Cuenta cuenta=new Cuenta(i,"Greco Gabriele");
			long deposito=100;
			cuenta.depositar(deposito);
			long monto=150;
			cuenta.extraer(monto);
			cuenta.getSaldo();
			CuentaCorriente cuentacorriente=new CuentaCorriente(i,"Greco",1500);
	}

}
