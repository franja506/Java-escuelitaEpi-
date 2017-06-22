package gabrielegreco;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente {
	private	long saldo;
	private	long id;
	private String nombreCliente;
	private int girodescubierto;
	
public CuentaCorriente(long id,String nombrecliente,int girodescubierto){
		super(id,nombrecliente);
		this.girodescubierto=girodescubierto;
		
	}
public boolean extraer(long montoaextraer){
		final int girodescubierto=1000;
		 System.out.println("voy a  extraer "+montoaextraer);
		 if(montoaextraer>0){
			 if((saldo-montoaextraer)>girodescubierto)
			 saldo=saldo-montoaextraer;
			 System.out.println("monto a sacar aceptado");
			 return true;
		 }
		 else{
			 System.out.println("monto a sacar denegado");
			 return false;
		 }
			 			
	}
public long getId() {
	// TODO Auto-generated method stub
	return 0;
}
public String getNombreCliente() {
	// TODO Auto-generated method stub
	return null;
}
public long giroEnDescubiertoHabilidado() {
	// TODO Auto-generated method stub
	return 0;
}
}
