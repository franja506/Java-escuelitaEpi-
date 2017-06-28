package carlos;

import java.io.InvalidClassException;
import java.util.HashSet;
import java.util.Set;



public class Cliente implements ICliente{
	
	Set<ICuenta> cuentas;
	String nombre;
	Banco banco;

	public Cliente(String name, Banco banco){
		this.banco=banco;
		nombre = name;
		cuentas = new HashSet<>();
	}

	public void agregarCuenta(ICuenta cuenta) throws InvalidClassException{
		if(cuenta instanceof Cuenta || cuenta instanceof CuentaCorriente){
			if (!cuentas.contains(cuenta)) {
				System.out.println("Se agrego la cuenta al cliente " + nombre + " exitosamente");
				if(!banco.getCuentas().contains(cuenta)){
					banco.getCuentas().add(cuenta);
				}
			}else{
				System.err.println("El usuario " + nombre + " ya tiene esa cuenta");
			}
		}else{
			throw new InvalidClassException("El tipo de cuenta es invalido");
		}
	}

	public Set<ICuenta> getCuentas(){
		return cuentas;
	}

	public String getNombre() {
		return nombre;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Cliente)) return false;
		Cliente other = (Cliente) obj;
		if(!other.nombre.equals(nombre)) return false;
		return true;
	}
}
