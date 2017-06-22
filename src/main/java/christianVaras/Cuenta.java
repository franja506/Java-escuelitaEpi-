package christianVaras;

public class Cuenta {
	long saldo=0;
	long idCuenta;
	String nombreCliente;
	
	public Cuenta(long idCuenta, String nombreCliente) {
		this.idCuenta = idCuenta;
		this.nombreCliente = nombreCliente;
	}
	
	public void agregarSaldo(long nuevoSaldo) {
		saldo += nuevoSaldo;
	}
	
	public long getSaldo() {
		return this.saldo;
	}
	
	
	private void restarSaldo(long saldoExtraer) {
		saldo-=saldoExtraer;
	}
	
	public long extraerSaldo(long saldoExtraer) {
		restarSaldo(saldoExtraer);
		return saldoExtraer;
	}
	
	public String getNombreCliente() {
		return this.nombreCliente;
	}
	
	public long getIdCuenta() {
		return this.idCuenta;
	}
}
