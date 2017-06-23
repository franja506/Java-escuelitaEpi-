package carlos;

import org.junit.Test;

import carlos.Cuenta;

public class CuentaTest {

	@Test
	public void test() {
		Cuenta cuenta = new Cuenta(435231243,"Carlos",1200);
		CuentaCorriente cuentacorriente = new CuentaCorriente(435231243, "Carlos", 500);
		System.out.println(cuenta.getSaldo());
		cuenta.extraer(50);
		System.out.println(cuenta.getSaldo());
		cuenta.depositar(1000);
		System.out.println(cuenta.getSaldo());
		
		System.out.println(cuentacorriente.getSaldo());
		cuentacorriente.extraer(600);		
		cuenta.depositar(1000);
		System.out.println(cuentacorriente.getSaldo());
	}

}
