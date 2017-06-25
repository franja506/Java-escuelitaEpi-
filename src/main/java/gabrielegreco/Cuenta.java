package gabrielegreco;

public class Cuenta {

	private long saldo;
	private long id;

	public Cuenta(long id) {

		this.id = id;
		saldo = 0;

	}

	public boolean depositar(long montoADepositar) {
		if (montoADepositar > 0) {
			saldo = saldo + montoADepositar;
			return true;
		} else {
			return false;
		}

	}

	public boolean extraer(long montoasacar) {
		if (montoasacar < saldo && montoasacar > 0) {
			saldo = saldo - montoasacar;
			return true;
		} else {
			return false;
		}

	}

	public long getSaldo() {
		return saldo;
	}

	public long getId() {
		return id;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public void setId(long id) {
		this.id = id;
	}

}
