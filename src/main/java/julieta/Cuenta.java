package julieta;

import dipi.ICliente;
import dipi.ICuenta;

public class Cuenta implements ICuenta {

		protected long id;
		protected long saldo;
		protected ICliente cliente;
		
		public Cuenta(long id, ICliente cliente){
			this.id = id;
			this.cliente = cliente;
		}
		
		public boolean esCorriente(){
			return false;
		}

		public long getId() {
			return this.id;
		}

		public String getNombreCliente() {
			return this.getNombreCliente();
		}

		public boolean depositar(long montoADepositar) {
			if (montoADepositar > 0){
				this.saldo = this.saldo + montoADepositar;
				return true;
			}
			else {
				throw new excepcionMontoNegativo();
			}
		}

		public boolean extraer(long montoAExtraer) {
			if(montoAExtraer > 0){
				long saldoRestante = this.saldo - montoAExtraer;
				if (saldoRestante >= 0){
					this.saldo = this.saldo - montoAExtraer;
					return true;
				}else{
					throw new excepcionFondosInsuficientes();
				}
			}else{
				throw new excepcionMontoNegativo();
			}
			}

		public long getSaldo() {
			return this.saldo;
		}

		@Override
		public ICliente getCliente() {
			return this.cliente;
		}
}