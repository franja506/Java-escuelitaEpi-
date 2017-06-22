package GabrieleGreco;

public class Cuenta {
		double saldo;
		long id;
		String nombreCliente;
		
		public Cuenta(long id,String nombreCliente){
			
			this.id=id;
			this.nombreCliente=nombreCliente;
			System.out.println("Mi numero de cuenta es "+id);
			System.out.println("Mi nombre de Cliente es "+nombreCliente);
			
		}
		  void deposito(double saldo){
			
			this.saldo=saldo;
			System.out.println("Mi saldo es "+saldo);
			
		}
		 void extraccion(double monto){
			 System.out.println("voya  extraer "+monto);
			saldo=saldo-monto;
			
		}
		void verSaldo(){
			
			System.out.println("el saldo es "+saldo);

		}
		
}
