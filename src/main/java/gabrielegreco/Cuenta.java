package gabrielegreco;

import dipi.ICuenta;

public class Cuenta implements ICuenta {
	public long saldo;
	public long id;
	public String nombreCliente;

	public Cuenta(long id, String nombreCliente) {

		this.id = id;
		this.nombreCliente = nombreCliente;
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

	public String getNombreCliente() {
		return nombreCliente;
	}

	public long getId() {
		return id;
	}
}
