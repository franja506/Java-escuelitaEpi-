package pancho;

public class Cuenta {
	long id;
	long saldo;
	String nombreCliente;
	
	public Cuenta(long numeroId, long saldo){
		id = numeroId;
		this.saldo = saldo;
	}
	
		void depositar(long deposito) {
			saldo  += deposito;
		}
		
		void extraer(long extraccion) {
			if (saldo > extraccion)
				saldo -= extraccion;
		}
		
		long verSaldo(){
			return saldo;
		}

}
 