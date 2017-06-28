package carlos;

import java.io.InvalidClassException;
import java.util.HashSet;
import java.util.Set;

public class Banco implements IBanco {
	
	String nombre;
	Set<ICliente> clientes;
	Set<ICuenta> cuentas;
	
	public Banco(String name) {
		nombre = name;
		clientes=new HashSet<>();
		cuentas = new HashSet<>();
	}

	public void agregarCliente(ICliente cliente) throws InvalidClassException{
		if (cliente instanceof ICliente) {
			if(!clientes.contains(clientes)){
				clientes.add(cliente);
				System.out.println("Se agrego correctamente el cliente " + cliente.getNombre());
			}else System.err.println("Ya existe el cliente " + cliente.getNombre());
		}else new InvalidClassException("Cliente no valido");
	}

	public Set<ICuenta> getCuentas(){
		return cuentas;
	}

	public Set<ICliente> getClientes() {
		return clientes;
	}

	public String getNombre() {
		return nombre;
	}
}
