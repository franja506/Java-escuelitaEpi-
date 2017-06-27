package vanessa;

import java.util.HashMap;
import java.util.Map;

import vanessa.Cliente;

public class Banco {
	int id;
	String nombreBanco;
	Map<Long, Cuenta> cuentas;
	Map<Long, CuentaCorriente> cuentasCorriente;
	Map<Integer,Cliente> clientes;

	public Banco(int id, String nombreBanco){
		this.id = id;
		this.nombreBanco = nombreBanco;
		this.cuentas = new HashMap<Long, Cuenta>();
		this.cuentasCorriente = new HashMap<Long,CuentaCorriente>();
		this.clientes = new HashMap<Integer, Cliente>();
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getNombreBanco(){
		return this.nombreBanco;
	}
	
	public Map<Long, Cuenta> getCuentas(){
		return this.cuentas;
	}
	
	public Map<Long, CuentaCorriente> getCuentasCorriente(){
		return this.cuentasCorriente;
	}
	
	public Map<Integer, Cliente> getCuentasCliente(){
		return this.clientes;
	}
	
	public boolean removeCliente(int id){
		if (this.clientes.containsKey(id)){
			this.clientes.remove(id);
			return true;
		}else
			return false;
	}
	
	

}