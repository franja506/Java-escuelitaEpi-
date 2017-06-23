package christian;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente{
	
	private long cantGiroEnDescubierto;
	
	public CuentaCorriente(long id, String nombreCliente, long cantGiroEnDescubierto) {
		super(id,nombreCliente);
		this.cantGiroEnDescubierto = cantGiroEnDescubierto;
	}
	
	public long giroEnDescubiertoHabilidado() {
		return this.cantGiroEnDescubierto;
	}

	@Override
	public boolean haySuficienteSaldoParaExtraer(long montoAExtraer) {
		return this.getSaldo() + this.cantGiroEnDescubierto >= montoAExtraer; 
	}

}
