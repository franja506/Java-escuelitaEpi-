package christian;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dipi.ICuenta;

public class ClienteTest {
	Cliente cliente;
	String nombre = "Christian Varas";
	List<Integer> idCuentas = Arrays.asList(1,2,3,4);
	List<Integer> idCuentasCorrientes = Arrays.asList(5,6,7,8,9,10);
	
	long giroDescubierto;
	long idCliente = 1924;
	
	public Cliente buildCliente() {
		return new Cliente(idCliente,nombre);
	}
	
	
	public void buildCuentas() {
		
		for(Integer id:idCuentas) {
			cliente.addCuenta(new Cuenta(id,nombre));
		}
	}
	
	
	public void buildCuentasCorrientes() {
		
		for(Integer id:idCuentasCorrientes) {
			cliente.addCuenta(new CuentaCorriente(id,nombre,giroDescubierto));
		}
	}
	
	@Before
	public void setup() {
		cliente = this.buildCliente();
		this.buildCuentas();
		this.buildCuentasCorrientes();
	}
	
	@Test
	public void test() {
		
	}

}
