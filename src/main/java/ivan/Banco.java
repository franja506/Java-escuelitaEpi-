package ivan;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	public List<Cliente> clientes = new ArrayList<Cliente>();
	public List<Cuenta> cuentas = new ArrayList<Cuenta>();
	public List<CuentaCorriente> cuentasCorrientes = new ArrayList<CuentaCorriente>();
	public String nombre;
	public long id;
	
	
	public Banco(long id, String nombreBanco){
		this.id = id;
		this.nombre = nombreBanco;
	}

	
	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public List<Cuenta> getCuentas() {
		return cuentas;
	}


	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}


	public List<CuentaCorriente> getCuentasCorrientes() {
		return cuentasCorrientes;
	}


	public void setCuentasCorrientes(List<CuentaCorriente> cuentasCorrientes) {
		this.cuentasCorrientes = cuentasCorrientes;
	}


	public void agregarCliente(Cliente cliente){
		this.getClientes().add(cliente);
	}
	
	public void agregarCuenta(Cuenta cuenta){
		this.getCuentas().add(cuenta);
	}
	public void agregarCuentaCorriente(CuentaCorriente cuentaCorriente){
		this.getCuentasCorrientes().add(cuentaCorriente);
	}
}
