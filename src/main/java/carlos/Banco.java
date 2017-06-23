package carlos;

import java.util.HashMap;
import java.util.Map;

import dipi.ICuenta;

public class Banco {
	
	String nombre;
	Map<String,Cliente> clientes;
	Map<Integer,ICuenta> cuentas;
	int count;
	
	public Banco(String name){
		nombre = name;
		clientes = new HashMap<>();
		cuentas = new HashMap<>();
		cuentasCorrientes = new HashMap<>();
	}
	public boolean crearCliente(String name){
		if(clientes.containsKey(name)){
			System.err.println("El cliente " + name + " ya existe");
			return false;
		}
		System.out.println("El cliente fue creado exitosamente!");
		clientes.put(name, new Cliente(name, this));
		return true;
	}
	public boolean eliminarCliente(String name){
		if(clientes.containsKey(name)){
			clientes.remove(name);
			return true;
		}
		System.err.println("El cliente " + name + " no existe");
		return false;
	}
	public boolean eliminarCuentaCliente(String name, long id){
		if(clientes.containsKey(name)){
			Cliente cliente = clientes.get(name);
			if((cliente.getCuentas().containsKey(id)||cliente.getCuentasCorrientes().containsKey(id))&&(cuentas.containsKey(id)||cuentasCorrientes.containsKey(id))){
				
			}
		}
	}
	public boolean eliminarCuentaCorrienteClienete() {
	}
	public boolean crearCuentaCliente(){
	}
	public boolean crearCuentaCorrienteCliente(){
	}
	public boolean depositarEnCliente(){
	}
	public boolean extraerDeCliente(){
	}
	public boolean existeCuenta(long id){
		return cuentas.containsKey(id);
	}
}
