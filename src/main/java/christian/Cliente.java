package christian;

import java.util.LinkedList;
import java.util.List;

import dipi.ICuenta;

public class Cliente {
	long id;
	String nombre;
	List<ICuenta> cuentas = new LinkedList<ICuenta>();
	
	public Cliente(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	
	public void addCuenta(ICuenta cuenta) {
		cuentas.add(cuenta);
	}
	
	public void getCantCuentasComunes() {
		
	}

	
	
}
