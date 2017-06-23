package vanessa;

import java.util.*;
import dipi.ICuenta;

public class Cliente {
	int id;
	String nombreCliente;
	Map<Long, Cuenta> cuentas;
	Map<Long, CuentaCorriente> cuentasCorriente;
	
	public void cliente(int id, String nombre){
		this.id = id;
		this.nombreCliente = nombre;
		this.cuentas = new HashMap<Long, Cuenta>();
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
	
	public boolean depositar(long idCuenta, long monto){
		try{
			return this.getCuenta(idCuenta).depositar(monto);	
		}catch (Exception e) {
			return false;
		}
	}
	
	
	
	

}
