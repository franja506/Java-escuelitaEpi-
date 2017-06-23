package carlos;

import dipi.ICuenta;

public class Cuenta implements ICuenta{
	private long saldo;
	private long id;
	private String nombreCliente;
	
	public Cuenta(long id, String nombre,long saldo){
		this.id=id;
		nombreCliente=nombre;
		this.saldo=saldo;
		
	}
	
	public Cuenta(long id,String nombre) {
		this.id=id;
		nombreCliente=nombre;
		saldo=0;
	}
	
	public boolean extraer(long extraer){
		if(extraer<0){
			System.err.println("Ingrese un valor correcto");
			return false;
		}else{
			if(extraer>saldo){
				System.err.println("No tiene suficientes fondos");
				return false;
			}
			saldo = saldo-extraer;
			System.out.println("Su nuevo saldo es: " + saldo);
			return true;
		}
	}
	
	public boolean depositar(long depositar){
		if(depositar<0){
			System.err.println("Ingrese un valor correcto");
			return false;
		}else{
			saldo = saldo+depositar;
			System.out.println("Su nuevo saldo es: " + saldo);
			return true;
		}
	}
	
	public long getSaldo(){
		return saldo;
	}
	
	public long getId() {
		return id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}
}
