package ivan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dipi.ICuenta;

public class Cliente implements dipi.ICliente{
	public long id;
	public String nombre;
	public Set<ICuenta> cuentas = new HashSet<ICuenta>();
	

	public String getNombre(){
		return this.nombre;
	}
	
	public Cliente(long nroCliente,String nombreCliente){
		this.id = nroCliente;
		this.nombre = nombreCliente;		
	}
	
	public void agregarCuentaCorriente(CuentaCorriente cuentaCorriente){
		if (! existeCuentaCorriente(cuentaCorriente)){
			this.getCuentas().add(cuentaCorriente);
		}
		else{
			System.out.println("Error. cuenta corriente existente");
		}
		
	}
	
/*	public void agregarCuenta(Cuenta cuenta){
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
	}*/
	
	public boolean existeCuenta(Cuenta cuenta){
		return this.getCuentas().contains(cuenta);
	}
	
	public boolean existeCuentaCorriente(CuentaCorriente cuentaCorriente){
		return this.getCuentas().contains(cuentaCorriente);
	}
	
	public Set<ICuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(HashSet<ICuenta>cuentas) {
		this.cuentas = cuentas;
	}



	public long getId(){
		return this.id;
	}
	
	

}
