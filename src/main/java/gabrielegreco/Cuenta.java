package gabrielegreco;

public class Cuenta {
	private	long saldo;
	private	long id;
	private	String nombreCliente;
		
		public Cuenta(long id,String nombreCliente){
			
			this.id=id;
			this.nombreCliente=nombreCliente;
			System.out.println("Mi numero de cuenta es "+id);
			System.out.println("Mi nombre de Cliente es "+nombreCliente);
			
		}
		public boolean depositar(long montoADepositar){
				 System.out.println("Quiero depositar: "+montoADepositar);
				 if(montoADepositar>0){
					 saldo=saldo+montoADepositar;
					 System.out.println("monto a depositar aceptado");
					 return true;
				 }
				 else{
					 System.out.println("monto a depositar denegado");
					 return false;
				 }
			
		}
		public boolean extraer(long montoasacar){
			 System.out.println("voy a  extraer "+montoasacar);
			 if(montoasacar<saldo&&montoasacar>0){
				 saldo=saldo-montoasacar;
				 System.out.println("monto a sacar aceptado");
				 return true;
			 }
			 else{
				 System.out.println("monto a sacar denegado");
				 return false;
			 }
				 			
		}
		public long getSaldo(){
			return saldo;
		}
		public String getNombreCliente(){
			return nombreCliente;
		}
		
}
