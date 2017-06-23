package julieta;

import java.util.List;


public class Cliente {

	public String nombreCliente;
	public List<Cuenta> cuentas;
	public List<CuentaCorriente> cuentasCorrientes;
	public int cantidadCuentasSaldo;
	public int cantidadCuentasCorriente;
	
	public List<Cuenta> getCuentas()  {
		return this.cuentas;
	}
	
	public List<CuentaCorriente> getCuentasCorrientes()  {
		return this.cuentasCorrientes;
	}
	
	public Cliente(String nombre){
		this.nombreCliente = nombre;
		this.cantidadCuentasSaldo = 0;
		this.cantidadCuentasCorriente = 0;
		
	}
	
	public int getCantidadCuentasSaldo() {
		return cantidadCuentasSaldo;
	}

	public int getCantidadCuentasCorriente() {
		return cantidadCuentasCorriente;
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		if (cuenta == null) {
			System.out.println("La cuenta a agregar es nula");
		} else if(sePuedeAgregarOtraCuenta()){
			this.cuentas.add(cuenta);
			} else {
				System.out.println("No es posible tener mas cuentas que cuentas corrientes");
			}
		}
	
	public void agregarCuentaCorriente(CuentaCorriente cuentaCorriente) {
		if (cuentaCorriente == null) {
			System.out.println("La cuenta a agregar es nula");
		} else {
			this.cuentas.add(cuentaCorriente);
			} 
		}
	
	public boolean sePuedeAgregarOtraCuenta(){
		if(this.cuentas.size() > this.cuentasCorrientes.size()){
			return true;
		}else{
			return false;
		}
	}
}
