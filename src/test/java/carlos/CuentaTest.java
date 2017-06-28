package carlos;

import static org.junit.Assert.*;

import java.io.InvalidClassException;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import dipi.MontoNegativoCuentaException;

public class CuentaTest {

	public void test() {
		
		Banco banco = new Banco("BBVA Frances");
		
		Cliente carlos = new Cliente("Carlos", banco);
		Cliente maria = new Cliente("Maria", banco);
		
		Cuenta cuentaCarlos = new Cuenta(54212, carlos);
		CuentaCorriente cuentaCorrienteCarlos = new CuentaCorriente(54213, carlos, 1500);
		
		Cuenta cuentaMaria = new Cuenta(54112, maria);
		CuentaCorriente cuentaCorrienteMaria = new CuentaCorriente(54112, maria, 1000);
		
		
		try {
			carlos.agregarCuenta(cuentaCorrienteCarlos);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		try {
			carlos.agregarCuenta(cuentaCarlos);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		
		
		try {
			maria.agregarCuenta(cuentaCorrienteMaria);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		try {
			maria.agregarCuenta(cuentaMaria);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		
		
		try {
			banco.agregarCliente(carlos);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		try {
			banco.agregarCliente(maria);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testAgregadoFondos(){
		Banco banco = new Banco("BBVA Frances");
		
		Cliente carlos = new Cliente("Carlos", banco);
		Cliente maria = new Cliente("Maria", banco);
		
		Cuenta cuentaCarlos = new Cuenta(54212, carlos);
		CuentaCorriente cuentaCorrienteCarlos = new CuentaCorriente(54213, carlos, 1500);
		
		Cuenta cuentaMaria = new Cuenta(54112, maria);
		CuentaCorriente cuentaCorrienteMaria = new CuentaCorriente(54112, maria, 1000);
		
		
		try {
			carlos.agregarCuenta(cuentaCorrienteCarlos);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		try {
			carlos.agregarCuenta(cuentaCarlos);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		
		
		try {
			maria.agregarCuenta(cuentaCorrienteMaria);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		try {
			maria.agregarCuenta(cuentaMaria);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		
		
		try {
			banco.agregarCliente(carlos);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		try {
			banco.agregarCliente(maria);
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}
		
		try {
			cuentaCarlos.depositar(1500);
		} catch (MontoNegativoCuentaException e) {
			e.printStackTrace();
		}
		
		try {
			cuentaCorrienteCarlos.depositar(1500);
		} catch (MontoNegativoCuentaException e) {
			e.printStackTrace();
		}
		
		try {
			cuentaMaria.depositar(1500);
		} catch (MontoNegativoCuentaException e) {
			e.printStackTrace();
		}
		try {
			cuentaCorrienteMaria.depositar(1500);
		} catch (MontoNegativoCuentaException e) {
			e.printStackTrace();
		}
		try {
			cuentaCorrienteCarlos.extraer(100);
		} catch (MontoNegativoCuentaException e) {
			e.printStackTrace();
		}
		try {
			cuentaCorrienteMaria.extraer(100);
		} catch (MontoNegativoCuentaException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i = 0 ;i<40;i++){
			try {
				cuentaCorrienteMaria.extraer(100);
			} catch (MontoNegativoCuentaException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=0;i<40;i++){
			try {
				cuentaCorrienteCarlos.extraer(100);
			} catch (MontoNegativoCuentaException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=0;i<40;i++){
			try {
				cuentaCarlos.extraer(100);
			} catch (MontoNegativoCuentaException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=0;i<40;i++){
			try {
				cuentaMaria.extraer(100);
			} catch (MontoNegativoCuentaException e) {
				e.printStackTrace();
			}
		}
		
		try {
			cuentaCarlos.extraer(-100);
			fail();
		} catch (MontoNegativoCuentaException e) {
		}
		try {
			cuentaCarlos.extraer(-100);
			fail();
		} catch (MontoNegativoCuentaException e) {
		}
	}
}
