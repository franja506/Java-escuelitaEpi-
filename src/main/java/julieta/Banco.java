package julieta;

import java.util.HashSet;
import java.util.Set;

import dipi.IBanco;
import dipi.ICliente;
import dipi.ICuenta;

public class Banco implements IBanco {
	
	protected String nombreBanco;
	protected Set<ICuenta> cuentas;
	protected Set<ICliente> clientes;

	public Banco(String nombre) {
		this.nombreBanco = nombre;
		this.cuentas = new HashSet<ICuenta>();
		this.clientes = new HashSet<ICliente>();
	}

	public Set<ICuenta> getCuentas() {
		return this.cuentas;
	}
	
	public Set<ICliente> getClientes() {
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

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

}
