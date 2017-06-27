package julieta;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	
	protected String nombreBanco;
	protected Set<Cuenta> cuentas;
	protected HashSet<Cliente> clientes;

	public Banco(String nombre) {
		this.nombreBanco = nombre;
		this.cuentas = new HashSet<Cuenta>();
		this.clientes = new HashSet<Cliente>();
	}

	public Set<Cuenta> getCuentas() {
		return this.cuentas;
	}
	
	public Set<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void agregarCliente(Cliente unCliente) {
		this.clientes.add(unCliente);	
	}
	
	public void agregarCuenta(Cuenta unaCuenta) {
		this.cuentas.add(unaCuenta);	
	}
	
	public Cuenta agregarCuentaAsociadaAUnCliente(long id, Cliente cliente){
		if(idUnico(id)){
		Cuenta unaCuenta = cliente.crearCuenta(id);
		this.agregarCuenta(unaCuenta);
		return unaCuenta;
		}else{
			throw new excepcionIdRepetido();
		}
	}
	
	public CuentaCorriente agregarCuentaCorrienteAsociadaAUnCliente(long id, Cliente cliente, long giroEnDescubierto){
		if(idUnico(id)){
		CuentaCorriente unaCuentaCorriente = cliente.crearCuentaCorriente(id, giroEnDescubierto);
		this.agregarCuenta(unaCuentaCorriente);
		return unaCuentaCorriente;
		}else{
			throw new excepcionIdRepetido();
		}
	}

	public boolean idUnico(long id){
		return !this.cuentas.stream().anyMatch(cuenta -> cuenta.getId() == id);
	}

}
