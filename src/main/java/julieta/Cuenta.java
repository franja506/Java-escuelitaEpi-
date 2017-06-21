package julieta;

public class Cuenta {

		private int numero;
		private int saldo;
		
		
		public Cuenta(int numero){
			this.numero = numero;
		}
		
		public long getNumero(){
			return this.numero;
		}
		
		public int getSaldo(){
			return this.saldo;
		}
		
		public void depositar(int monto){
			this.saldo = this.saldo + monto;
		}
		
		public void exportar(int monto){
			this.saldo = this.saldo - monto;
		}
		
		public String textoNumeroSaldo() {
			return ("Cuenta numero: " + this.numero + "El saldo es: "+ this.saldo);
		}
}