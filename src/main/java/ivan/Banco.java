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

	public long getId(){
		return this.id;
	}
	
	public String getNombre(){
		return this.nombre;
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

	public boolean existeCuenta(Cuenta cuenta){
		for(Cuenta c : this.getCuentas()){
			if (c.getId() == cuenta.getId()){
				return true;
			}
		}
		return false;
	}
	
	public boolean existeCuentaCorriente(CuentaCorriente cuentaCorriente){
		for (CuentaCorriente cc : this.getCuentasCorrientes()){
			if (cc.getId() == cuentaCorriente.getId()){
				return true;
			}
		}
		return false;
	}
	
	public boolean existeCliente(Cliente cliente){
		for (Cliente cli: this.getClientes()){
			if(cli.getId() == cliente.getId()){
				return true;
			}
		}
		return false;
	}
	public void agregarCliente(Cliente cliente){
		if(! existeCliente(cliente)){
			this.getClientes().add(cliente);
		}
		else{
			System.out.println("Error el cliente ya existe.");
		}
		
	}
	
	public void agregarCuenta(Cuenta cuenta){
		if(! existeCuenta(cuenta)){
			this.getCuentas().add(cuenta);
		}
		else{
			System.out.println("Error. Cuenta existente");
		}
		
	}
	public void agregarCuentaCorriente(CuentaCorriente cuentaCorriente){
		if (! existeCuentaCorriente(cuentaCorriente)){
			this.getCuentasCorrientes().add(cuentaCorriente);
		}
		else{
			System.out.println("Error. Cuenta corriente existente");
		}
		
	}
}
