package brian;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Cuenta> cuentas;
	private List<CuentaCorriente> cc;
	private String nombre;

	public Cliente(String nombre) {
		this.cuentas = new ArrayList<Cuenta>();
		this.cc = new ArrayList<CuentaCorriente>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public List<CuentaCorriente> getCc() {
		return cc;
	}

	public void setCc(List<CuentaCorriente> cc) {
		this.cc = cc;
	}
}
