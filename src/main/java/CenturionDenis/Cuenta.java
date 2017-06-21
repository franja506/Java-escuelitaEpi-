package CenturionDenis;

public class Cuenta {
	
	int nroCuenta;
	int saldo;
	
	public Cuenta(int nroCuenta){
		this.nroCuenta = nroCuenta;
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
