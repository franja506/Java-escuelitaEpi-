package ivan;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void ExtraerNegativotest() {
		/**	int nro = 1234;
			String cliente= "ivan delcuadri";
			Cuenta cuenta = new Cuenta(nro, cliente);
			System.out.println("la cuenta creada tiene el numero: " + cuenta.getId() +" y el nombre: " + cuenta.getNombreCliente() );
			
			
			System.out.println("la cuenta tiene el saldo" + cuenta.getSaldo());
			cuenta.extraer(10);
			System.out.println("la cuenta ahora tiene el saldo" + cuenta.getSaldo());
	*/}
	
	@Test
	public void CrearCuentas(){
		int nro = 1234;
		String cliente= "ivan delcuadri";
		Cuenta cuenta = new Cuenta(nro, cliente);
	}
}
