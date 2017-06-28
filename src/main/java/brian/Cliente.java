package brian;

import java.util.HashSet;
import java.util.Set;

import dipi.ICliente;
import dipi.ICuenta;

public class Cliente implements ICliente{
	private Set<ICuenta> cuentas;
	private String nombre;

	public Cliente(String nombre) {
		this.cuentas = new HashSet<ICuenta>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<ICuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Set<ICuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public void agregarCuenta(ICuenta cuenta) {
		this.getCuentas().add(cuenta);
	}
}
