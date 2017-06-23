package brian;

import dipi.ICuenta;

public class Cuenta implements ICuenta {
	long id;
	private long saldo;
	private String nombreCliente;

	public Cuenta(long id, String nombreCliente) {
		this.id = id;
		this.setNombreCliente(nombreCliente);
		this.setSaldo(0);
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public long getSaldo() {
		return this.saldo;
	}

	@Override
	public String getNombreCliente() {
		return this.nombreCliente;
	}

	@Override
	public boolean depositar(long montoADepositar) {
		if (montoADepositar > 0 && montoADepositar > this.getSaldo()) {
			this.setSaldo(this.getSaldo() + montoADepositar);
			return true;
		} else {
			return false;
		}
	}

	@Override
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

	@Override
	public long getId() {
		return this.id;
	}
}
