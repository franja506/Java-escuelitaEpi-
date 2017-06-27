package ivan;

import java.util.HashSet;
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
	
	/*
	public void agregarCuentaCorriente(CuentaCorriente cuentaCorriente){
		if (! existeCuentaCorriente(cuentaCorriente)){
			this.getCuentas().add(cuentaCorriente);
		}
		else{
			System.out.println("Error. cuenta corriente existente");
		}
		
	}*/
	
	public void agregarCuenta(ICuenta cuenta){
		Cuenta c = (Cuenta)cuenta;
		if ( c.soyCuenta()){
			if ( puedoAgregar() ){
				this.getCuentas().add(cuenta);
			}else{
				System.out.println("Error no se puede agregar mas cuentas, la cantidad de cuentas debe ser menor a cuentas corrientes");
			}
		}
		else{
				this.getCuentas().add(cuenta);
			
		//	System.out.println("Error cuenta existente");
		}
	}
	
	private boolean puedoAgregar(){
		int cantCuentas = 0;
		int cantCC = 0;
		for (ICuenta c: this.cuentas){
			Cuenta aux =(Cuenta) c; 
			if (aux.soyCuenta()){
				cantCuentas ++;
			}
			else{
				cantCC ++;
			}
		}
			
		if ((cantCuentas + 1) < cantCC ){
			return true;
		}else{
			return false;
		}
	}
	
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
	
	public boolean equals(Cliente cli){
		if (cli instanceof Cliente){
			Cliente c = (Cliente) cli;
			return (this.id == c.getId() && this.getNombre().equals(c.getNombre()));
		}
		else{
			return false;
		}
		
	}
	
	public int hashCode(){
		return (int) (this.getId() + this.getNombre().length());
	}
	

}
