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
		Cuenta c1 = new Cuenta(cuentas.size(), cliente);
		CuentaCorriente cc = new CuentaCorriente(cuentas.size(), (long) (Math.random() * 4000 + 1000), cliente);
		CuentaCorriente cc2 = new CuentaCorriente(cuentas.size(), (long) (Math.random() * 4000 + 1000), cliente);

		cliente.getCuentas().add(c1);
		cliente.getCuentas().add(cc);
		cliente.getCuentas().add(cc2);

		this.altaCuenta(cc);
		this.altaCuenta(cc2);
		this.altaCuenta(c1);
		
		this.clientes.add(cliente);
	}
}
