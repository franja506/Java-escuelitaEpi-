package brian;

import java.util.ArrayList;
import java.util.List;

import dipi.ICuenta;

public class Banco {
	private List<Cuenta> cuentas;
	private List<Cliente> clientes;
	private String nombre;

	public Banco(String nombre) {
		this.cuentas = new ArrayList<Cuenta>();
		this.clientes = new ArrayList<Cliente>();
		this.nombre = nombre;
	}

	public void altaCliente(String nombre) {
		Cliente c = new Cliente(nombre);
		Cuenta c1 = new Cuenta(cuentas.size(), nombre);
		CuentaCorriente cc = new CuentaCorriente(cuentas.size(), (long) (Math.random() * 4000 + 1000), nombre);
		CuentaCorriente cc2 = new CuentaCorriente(cuentas.size(), (long) (Math.random() * 4000 + 1000), nombre);

		c.getCuentas().add(c1);
		c.getCc().add(cc);
		c.getCc().add(cc2);

		this.altaCuenta(cc);
		this.altaCuenta(cc2);
		this.altaCuenta(c1);
		this.clientes.add(c);
	}

	public void altaCuenta(ICuenta c) {
		if (c instanceof Cuenta)
			this.cuentas.add((Cuenta) c);
		else if (c instanceof CuentaCorriente)
			this.cuentas.add((CuentaCorriente) c);
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
