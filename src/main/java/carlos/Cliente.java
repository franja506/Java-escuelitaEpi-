package carlos;

import java.util.Map;

import dipi.ICuenta;

public class Cliente {
	
	Map<Long,ICuenta> cuentas;
	Banco banco = new Banco("Santander Rio");
	String nombre;

	public Cliente(String name, Banco banco){
		this.banco=banco;
	}
	public void crearCuentaCorriente(long id){
		if(banco.existeCuenta(id)){
			System.err.println("La cuenta ya existe");
		}else{
			cuentas.put(id, new CuentaCorriente(id, nombre, 1500));
			banco.crearCuentaCorrienteCliente(id,1500);
		}
	}
	public void crearCuenta(long id){
		if(banco.existeCuenta(id)){
			System.err.println("La cuenta ya existe");
		}else{
			cuentas.put(id, new Cuenta(id, nombre));
			banco.crearCuentaCliente(id);
		}
		
	}
	public String getName(){
		return nombre;
	}
	public Map<Long, ICuenta> getCuentas(){
		return cuentas;
	}
	public ICuenta getCuenta(long idCuenta){
		return cuentas.get(idCuenta);
	}
	public void elimininarCuenta(Cuenta cuenta){
	}
	public void elimininarCuenta(long idCuenta){
		if(banco.existeCuenta(idCuenta)){
			banco.eliminarCuentaCliente(name, idCuenta);
		}
	}
}
