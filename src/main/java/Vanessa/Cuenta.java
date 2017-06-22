package Vanessa;

public class Cuenta {
	long id;
	double saldo;
	String nombreCliente;
	
	public Cuenta(long id, double saldo, String nombreCliente){
		this.id = id;
		this.saldo = saldo;
		this.nombreCliente = nombreCliente;
	};
	
	public long GetId(){
		return this.id;
	};
	
	public double VerSaldo(){
		return this.saldo;
	};
	
	public void Depositar(double nSaldo){
		this.saldo = this.saldo + nSaldo;
	};
	
	public void Extraer(double nSaldo){
		this.saldo = this.saldo - nSaldo;
	};
	

}
