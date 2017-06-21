package julieta;

public class Cuenta {

		public long id;
		public double saldo;
		public String nombreCliente;
		
		
		public Cuenta(long id){
			this.id = id;
		}
		
		public long getNumero(){
			return this.id;
		}
		
		public double verSaldo(){
			return this.saldo;
		}
		
		public void depositar(double monto){
			this.saldo = this.saldo + monto;
		}
		
		public void extraer(double monto){
			this.saldo = this.saldo - monto;
		}
		
		public String stringInformacionDeCuenta() {
			return ("Cuenta numero: " + this.id + "El saldo es: "+ this.saldo);
		}
}