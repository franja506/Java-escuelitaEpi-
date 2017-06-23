package julieta;

import dipi.ICuenta;

public class Cuenta implements ICuenta{

		public long id;
		public long saldo;
		public String nombreCliente;
		
		
		public Cuenta(long id, String nombreCliente){
			this.id = id;
			this.nombreCliente = nombreCliente;
		}

		@Override
		public long getId() {
			return this.id;
		}

		@Override
		public String getNombreCliente() {
			return this.getNombreCliente();
		}

		@Override
		public boolean depositar(long montoADepositar) {
			if (montoADepositar > 0){
				this.saldo = this.saldo + montoADepositar;
				return true;
			}
			else {
			System.out.println("No se pueden depositar montos negativos");
			return false;
			}
		}

		@Override
		public boolean extraer(long montoAExtraer) {			
			long saldoRestante = this.saldo - montoAExtraer;
			if (saldoRestante >= 0){
				this.saldo = this.saldo - montoAExtraer;
				return true;
			}
			else{
				System.out.println("Saldo insuficiente. Su saldo actual: " + this.getSaldo());
				return false;
			}
		}

		@Override
		public long getSaldo() {
			return this.saldo;
		}
}