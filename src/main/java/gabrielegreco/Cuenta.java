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
		public boolean deposito(long montoadepositar){
				 System.out.println("Quiero depositar: "+montoadepositar);
				 if(montoadepositar>0){
					 saldo=saldo+montoadepositar;
					 System.out.println("monto a depositar aceptado");
					 return true;
				 }
				 else{
					 System.out.println("monto a depositar denegado");
					 return false;
				 }
			
		}
		public boolean extraccion(long montoasacar){
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
		public long verSaldo(){
			
			System.out.println("el saldo es "+saldo);
			return saldo;

		}
		
}
