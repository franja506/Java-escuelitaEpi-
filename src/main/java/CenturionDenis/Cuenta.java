package CenturionDenis;

public class Cuenta {
	
	String nombreCliente;
	int nroCuenta;
	int saldo;
	
	public Cuenta(int nroCuenta, int saldo){
		this.nroCuenta = nroCuenta;
		this.saldo=saldo;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}	
	
	public void depositar (int saldo){
		this.saldo=saldo;
	}
	
	public void extraer(int saldo){
		this.saldo -= saldo; 
	}
	
	public int getSaldo(){
		return saldo;
	}

}
