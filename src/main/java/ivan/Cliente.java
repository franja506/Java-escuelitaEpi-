package ivan;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public long id;
	public String nombre;
	public List<Cuenta> cuentas = new ArrayList<Cuenta>();
	public List<CuentaCorriente> cuentasCorrientes = new ArrayList<CuentaCorriente>();

	public String getNombre(){
		return this.nombre;
	}
	
	public Cliente(long nroCliente,String nombreCliente){
		this.id = nroCliente;
		this.nombre = nombreCliente;		
	}
	
	public void agregarCuentaCorriente(CuentaCorriente cuentaCorriente){
		if (! existeCuentaCorriente(cuentaCorriente)){
			this.getCuentasCorrientes().add(cuentaCorriente);
		}
		else{
			System.out.println("Error. cuenta corriente existente");
		}
		
	}
	
	public void agregarCuenta(Cuenta cuenta){
		if (! existeCuenta(cuenta)){
			if ((this.getCuentas().size() + 1) <= this.getCuentasCorrientes().size()){
				this.getCuentas().add(cuenta);
			}else{
				System.out.println("Error no se puede agregar mas cuentas, la cantidad de cuentas debe ser menor a cuentas corrientes");
			}
		}
		else{
			System.out.println("Error cuenta existente");
		}
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

	public long getId(){
		return this.id;
	}
	
	

}
