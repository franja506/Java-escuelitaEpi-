package gabrielegreco;

public class CuentaCorriente extends Cuenta {
	private	long saldo;
	private	long id;
	private String nombreCliente;
	private int girodescubierto;
	
	CuentaCorriente(long id,String nombrecliente,int girodescubierto){
		super(id,nombrecliente);
		this.girodescubierto=girodescubierto;
		
	}
	public boolean extraccion(long montoasacar){
		final int girodescubierto=1000;
		 System.out.println("voy a  extraer "+montoasacar);
		 if(montoasacar>0){
			 if((saldo-montoasacar)>girodescubierto)
			 saldo=saldo-montoasacar;
			 System.out.println("monto a sacar aceptado");
			 return true;
		 }
		 else{
			 System.out.println("monto a sacar denegado");
			 return false;
		 }
			 			
	}
}
