package centurionDenis;

import java.util.HashSet;
import java.util.Set;

import dipi.ICliente;
import dipi.ICuenta;

public class Banco implements dipi.IBanco{
	private String nombreBanco;
	private Set<Cliente> clientes;
	
	public Banco(String nombreBanco){
		setNombreBanco(nombreBanco);
		clientes = new HashSet<Cliente>();
	}
	
	public boolean agregarCliente(int nroCliente, String nombre, String tipoCuenta,
			int nroCuenta, int saldo){
		if(agregarCliente(new Cliente(nroCliente, nombre, tipoCuenta, nroCuenta, saldo)))
			return true;
		return false;
	}
	
	public boolean agregarCliente(int nroCliente, String nombre,
			String tipoCuenta, int nroCuenta, int saldo, long giro){
		if(agregarCliente(new Cliente(nroCliente, nombre, tipoCuenta, nroCuenta, saldo, giro)))
			return true;
		return false;
	}
	
	public boolean agregarCliente(Cliente clienteAgregado){
		if(clientes.add(clienteAgregado)){
			return true;

		}
		return false;
	}
	
	public int cantidadDeClientes(){
		return clientes.size();
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public Set<ICuenta> getCuentas() {
		return null;
		// TODO Auto-generated method stub
		
	}

	public Set<ICliente> getClientes() {
			
		return null; 
		
	}

	public String getNombre() {
		
		return nombreBanco;
	}
	
	

}
