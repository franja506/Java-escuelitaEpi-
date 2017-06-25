package ivan;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public long id;
	public String nombre;
	public List<Cuenta> cuentas = new ArrayList<Cuenta>();
	public List<CuentaCorriente> cuentasCorrientes = new ArrayList<CuentaCorriente>();

	
	
	public Cliente(long nroCliente,String nombreCliente){
		this.id = nroCliente;
		this.nombre = nombreCliente;		
	}
	
	public void agregarCuentaCorriente(CuentaCorriente cuentaCorriente){
		this.getCuentasCorrientes().add(cuentaCorriente);
	}
	
	public void agregarCuenta(Cuenta cuenta){
		if ((this.getCuentas().size() + 1) < this.getCuentasCorrientes().size()){
			this.getCuentas().add(cuenta);
		}else{
			System.out.println("Error no se puede agregar mas cuentas, la cantidad de cuentas debe ser menor a cuentas corrientes");
		}
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


	
	

}
