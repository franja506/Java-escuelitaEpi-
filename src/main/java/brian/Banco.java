package brian;

import java.util.HashSet;
import java.util.Set;

import dipi.IBanco;
import dipi.ICliente;
import dipi.ICuenta;

public class Banco implements IBanco {
	private Set<ICuenta> cuentas;
	private Set<ICliente> clientes;
	private String nombre;

	public Banco(String nombre) {
		this.cuentas = new HashSet<ICuenta>();
		this.clientes = new HashSet<ICliente>();
		this.nombre = nombre;
	}

	public void altaCuenta(ICuenta c) {
		this.cuentas.add(c);
	}

	public void altaCuentas(Set<ICuenta> c) {
		this.cuentas.addAll(c);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<ICuenta> getCuentas() {
		return this.cuentas;
	}

	public Set<ICliente> getClientes() {
		return this.clientes;
	}

	@Override
	public void agregarCliente(ICliente cliente) {
		Cuenta c1 = new Cuenta(this.cuentas.size(), cliente);
		CuentaCorriente cc = new CuentaCorriente(this.cuentas.size(), (long) (Math.random() * 4000 + 1000), cliente);
		CuentaCorriente cc2 = new CuentaCorriente(this.cuentas.size(), (long) (Math.random() * 4000 + 1000), cliente);

		cliente.getCuentas().add(c1);
		cliente.getCuentas().add(cc);
		cliente.getCuentas().add(cc2);

		this.altaCuentas(cliente.getCuentas());
		this.clientes.add(cliente);
	}
}
