package brian;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import dipi.ICliente;
import dipi.ICuenta;

public class Cliente implements ICliente {
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
		if (this.cuentas.size() >= 3 && cuenta instanceof Cuenta) {
			if (this.controlCuentas()) {
				this.getCuentas().add(cuenta);
			}
		} else {
			this.getCuentas().add(cuenta);
		}
	}

	private boolean controlCuentas() {
		Iterator<ICuenta> i = this.cuentas.iterator();
		int c = 0, cc = 0;
		while (i.hasNext()) {
			if (i.next() instanceof CuentaCorriente) {
				cc++;
			} else {
				c++;
			}
		}
		return (cc > c + 1);
	}
}
