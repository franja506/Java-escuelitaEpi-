package dipi;

public interface ICuenta {
	public long getId();
	public String getNombreCliente();
	public boolean depositar(long montoADepositar);
	public boolean extraer(long montoAExtraer);
	public long getSaldo();
}
