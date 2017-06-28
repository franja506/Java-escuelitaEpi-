package brian;

import dipi.ICliente;
import dipi.ICuenta;

public class Cuenta implements ICuenta {
	private long id;
	private long saldo;
	private ICliente cliente;

	public Cuenta(long id, ICliente cliente) {
		this.id = id;
		this.cliente = cliente;
		this.setSaldo(0);
	}

	public long getSaldo() {
		return this.saldo;
	}

	public boolean depositar(long montoADepositar) {
		if (montoADepositar > 0 && montoADepositar > this.getSaldo()) {
			this.setSaldo(this.getSaldo() + montoADepositar);
			return true;
		} else {
			return false;
		}
	}

	public boolean extraer(long montoAExtraer) {
		if (montoAExtraer > 0 && montoAExtraer <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - montoAExtraer);
			return true;
		} else {
			return false;
		}
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public long getId() {
		return this.id;
	}

	public ICliente getCliente() {
		return this.cliente;
	}
}
