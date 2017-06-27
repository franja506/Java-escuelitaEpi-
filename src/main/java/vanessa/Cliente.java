package vanessa;

import java.util.*;
import dipi.ICuenta;

public class Cliente {
	int id;
	int cantidadCuentas;
	int cantidadCuentasCorriente;
	String nombreCliente;
	Map<Long, Cuenta> cuentas;
	Map<Long, CuentaCorriente> cuentasCorriente;
	
	public void cliente(int id, String nombre){
		this.id = id;
		this.nombreCliente = nombre;
		this.cuentas = new HashMap<Long, Cuenta>();
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getNombreCliente(){
		return this.nombreCliente;
	}
	
	
	/*Cuentas generales*/
	public Map<Long,Cuenta> getCuentas(){
		return this.cuentas;
	}
	
	/*Cuentas Corrientes*/
	public Map<Long,CuentaCorriente> getCuentasCorriente(){
		return this.cuentasCorriente;
	}
	
	/*Get cuenta/cuenta corriente por id, asumiendo que
	 * el id es diferente para ambos tipos de cuentas*/
	public ICuenta getCuenta(long id) throws Exception{
		if (this.cuentas.containsKey(id)){
			return this.cuentas.get(id);
		}else if(this.cuentasCorriente.containsKey(id)){
			return this.cuentasCorriente.get(id);
		}else
			throw new Exception("No se encuentra la cuenta: " + id);
	}
	
	/*Elimina cuenta/ cuenta corriente por id*/
	public boolean removeCuenta(long id){
		if (this.cuentas.containsKey(id)){
			this.cuentas.remove(id);
			return true;
		}else if(this.cuentasCorriente.containsKey(id)){
			this.cuentasCorriente.remove(id);
			return true;
		}else
			return false;
	}
	
	/*Depositar en cuenta/cuenta corriente dado un id cuenta y un monto*/
	public boolean depositar(long idCuenta, long monto){
		try{
			return this.getCuenta(idCuenta).depositar(monto);	
		}catch (Exception e) {
			return false;
		}
	}
	
	/*Agregar una cuenta a un cliente*/
	public boolean agregarCuenta(Cuenta cuenta) throws Exception{
		if (cuenta != null ){
			if(this.cuentas.size() <= this.cuentasCorriente.size()){
				throw new Exception("Operación no permitida. Agregue una Cuenta corriente nueva");
			}else{
				long k = cuenta.getId();
				this.cuentas.put(k, cuenta);
				return true;
			}
		}else{
			return false;
		}
	}
	
	/*Agregar  una cuenta Corriente a un cliente*/
	public boolean agregarCuentaCorriente(CuentaCorriente cuenta) throws Exception{
		if(cuenta != null){
				long k = cuenta.getId();
				this.cuentasCorriente.put(k, cuenta);
				return true;
			}else{
				return false;
			}
	}
	
	/*Extraer monto de una cuenta/ cuenta corriente*/
	public boolean extraerMontoCuenta(long numCuenta, long montoAExtraer){
		try {
			ICuenta cuenta = this.getCuenta(numCuenta);
			return cuenta.extraer(montoAExtraer);
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
		
	}
		
}