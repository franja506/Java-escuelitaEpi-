package pancho;

public class Cuenta implements dipi.ICuenta{
	private long id;
	protected long saldo;
	public String nombreCliente;

	public Cuenta(long numeroId, long saldo, String nombreCliente) {
		id = numeroId;
		this.saldo = saldo;
		this.nombreCliente = nombreCliente;
	}

	public boolean depositar(long deposito) {
		if (deposito > 0){
			saldo += deposito;
			System.out.print("Deposito realizado correctamente");
			return true;
		}	
		else if (deposito == 0){
			System.out.print("No se puede depositar monto 0");
			return false;
		}
		else { 
			System.out.print("No se puede depositar montos negativos");
			return false;
		}
	}

	public boolean extraer(long extraccion) {
		if (extraccion <= 0){
			System.out.print("No se puede extraer montos negativos o cero");
			return false;
		}
		
		if (this.getSaldo() >= extraccion){
			saldo -= extraccion;
			return true;
		}
		
		else
			System.out.print("No se puede extraer. No posee fondos en la cuenta");
			return false;
	}

	public long getId() {
		return id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public long getSaldo() {
		return saldo;
	}

}