package christian;

import java.util.LinkedList;
import java.util.List;

import dipi.ICuenta;

public class Banco {
	List<ICuenta> cuentas = new LinkedList<ICuenta>();
	List<Cliente> clientes = new LinkedList<Cliente>();
	
	public void addCuenta(ICuenta cuenta) {
		cuentas.add(cuenta);
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	
	
	
}
