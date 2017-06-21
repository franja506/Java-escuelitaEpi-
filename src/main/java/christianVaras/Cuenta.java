package christianVaras;

public class Cuenta {
	long saldo=0;
	long idCuenta;
	
	public Cuenta(long idCuenta) {
		this.idCuenta = idCuenta;
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
	
	public long getIdCuenta() {
		return this.idCuenta;
	}
}
