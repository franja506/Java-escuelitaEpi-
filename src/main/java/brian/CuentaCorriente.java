package brian;

import dipi.ICuentaCorriente;
import dipi.ICliente;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente {
	private long giroEnDescubierto;
	private boolean giroEnDescubiertoUtilizado;

	public boolean isGiroEnDescubiertoUtilizado() {
		return giroEnDescubiertoUtilizado;
	}

	public void setGiroEnDescubiertoUtilizado(boolean giroEnDescubiertoUtilizado) {
		this.giroEnDescubiertoUtilizado = giroEnDescubiertoUtilizado;
	}

	public CuentaCorriente(long id, long giroEnDescubierto, ICliente cliente) {
		super(id, cliente);
		this.setGiroEnDescubierto(giroEnDescubierto);
	}

	public long giroEnDescubiertoHabilidado() {
		if (this.giroEnDescubiertoUtilizado) {
			return 0;
		}
		return this.giroEnDescubierto;
	}

	public void setGiroEnDescubierto(long giroEnDescubierto) {
		this.giroEnDescubierto = giroEnDescubierto;
	}

	public boolean extraer(long montoAExtraer) {
		if ((montoAExtraer > this.getSaldo())
				&& (montoAExtraer <= this.getSaldo() + this.giroEnDescubiertoHabilidado())) {
			this.setSaldo(this.getSaldo() + this.giroEnDescubiertoHabilidado());
			this.giroEnDescubiertoUtilizado = true;
		}
		return super.extraer(montoAExtraer);
	}
	
	@Override
	public boolean depositar(long montoADepositar) {
		if (this.giroEnDescubiertoUtilizado) {
			this.giroEnDescubiertoUtilizado = (this.getSaldo() + montoADepositar >= this.giroEnDescubierto) ? false : true;			
		}
		return super.depositar(montoADepositar);
	}
}