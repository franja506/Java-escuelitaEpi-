package GabrieleGreco;

public class Cuenta {
		int saldo;
		int nrocuenta;
		
		public Cuenta(int nrocuenta){
			
			this.nrocuenta=nrocuenta;
			System.out.println("Mi numero de cuenta es "+nrocuenta);
			
		}
		  void deposito(int saldo){
			
			this.saldo=saldo;
			System.out.println("Mi saldo es "+saldo);
			
		}
		 void extraccion(int monto){
			 System.out.println("voya  extraer "+monto);
			saldo=saldo-monto;
			
		}
		void ver_saldo(){
			
			System.out.println("el saldo es "+saldo);

		}
		
}
