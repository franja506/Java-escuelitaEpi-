package brian;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente {

	private long giroEnDescubierto;
	private boolean giroEnDescubiertoUtilizado;

	public boolean isGiroEnDescubiertoUtilizado() {
		return giroEnDescubiertoUtilizado;
	}

	public void setGiroEnDescubiertoUtilizado(boolean giroEnDescubiertoUtilizado) {
		this.giroEnDescubiertoUtilizado = giroEnDescubiertoUtilizado;
	}

	public CuentaCorriente(long id, String nombreCliente, long giroEnDescubierto) {
		super(id, nombreCliente);
		this.setGiroEnDescubierto(giroEnDescubierto);
	}

	@Override
	public long giroEnDescubiertoHabilidado() {
		if (this.giroEnDescubiertoUtilizado) {
			return 0;
		}
		return this.giroEnDescubierto;
	}

	public void setGiroEnDescubierto(long giroEnDescubierto) {
		this.giroEnDescubierto = giroEnDescubierto;
	}

	@Override
	public boolean extraer(long montoAExtraer) {
		if ((montoAExtraer > this.getSaldo())
				&& (montoAExtraer <= this.getSaldo() + this.giroEnDescubiertoHabilidado())) {
			this.setSaldo(this.getSaldo() + this.giroEnDescubiertoHabilidado());
			this.giroEnDescubiertoUtilizado = true;
		}
		return super.extraer(montoAExtraer);
	}
}