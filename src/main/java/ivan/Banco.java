package ivan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dipi.ICliente;
import dipi.ICuenta;
/*
public class Banco implements dipi.IBanco{
	
	public Set<ICliente> clientes = new HashSet<ICliente>();
	public Set<ICuenta> cuentas = new HashSet<ICuenta>();
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
	
	public Set<ICliente> getClientes() {
		return clientes;
	}


	public void setClientes(Set<ICliente> clientes) {
		this.clientes = clientes;
	}


	public Set<ICuenta> getCuentas() {
		return cuentas;
	}


	public void setCuentas(Set<ICuenta> cuentas) {
		this.cuentas = cuentas;
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
*/