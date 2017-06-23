package gabrielegreco;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente {
	private int girodescubierto;
	private int estadogirodescubierto;
	
public CuentaCorriente(long id,String nombrecliente,int girodescubierto){
		super(id,nombrecliente);
		this.girodescubierto=girodescubierto;
		estadogirodescubierto=0;
		
	}
public boolean extraer(long montoaextraer){
		
		 if((montoaextraer>0)&&((saldo-montoaextraer)>=girodescubierto)){
			 if((saldo-montoaextraer)<0){
				 if(estadogirodescubierto==1)
					 return false;
				else{
					estadogirodescubierto=1;
			 }
			 }
			 saldo=saldo-montoaextraer;
			 System.out.println("monto a sacar aceptado");
			
			 return true;
			 
		 }
		 else{
			 System.out.println("monto a sacar denegado");
			 return false;
		 }
			 			
	}
public long giroEnDescubiertoHabilidado() {
	if(girodescubierto==0){
		return 0;
	}
	else{
		return 1;
	}
}

}
