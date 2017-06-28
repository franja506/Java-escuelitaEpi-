package carlos;

import dipi.MontoNegativoCuentaException;

public interface ICuenta {
	public long getId();
	public ICliente getCliente();
	public long getSaldo();
	
	public boolean depositar(long montoADepositar) throws MontoNegativoCuentaException;
	public boolean extraer(long montoAExtraer) throws MontoNegativoCuentaException;
}
