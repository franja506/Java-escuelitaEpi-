package gabrielegreco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dipi.ICliente;
import dipi.ICuenta;

public class Cliente implements ICliente{
	 private String nombreCliente;
	 private Set<ICuenta> conjuntoCuentasCliente = new HashSet<ICuenta>();

	 
	public Cliente(String nombreCliente){
		this.nombreCliente=nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Set<ICuenta> getCuentas() {
		return conjuntoCuentasCliente;
	}

	public String getNombre() {
		return nombreCliente;
	}

	public void agregarCuenta(ICuenta cuenta) {
			conjuntoCuentasCliente.add(cuenta);
	}
	 
}
