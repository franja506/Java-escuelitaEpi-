package centurionDenis;

public class CuentaCorriente extends Cuenta{
	
	private int nroCuenta;
	private long saldo;
	private long giroEnDescubierto;
	String nombreCliente;
	
	public CuentaCorriente(int nroCuenta, int saldo, String nombreCliente, long 
			giroEnDescubierto){
		super(nroCuenta, saldo, nombreCliente);
		this.setGiroEnDescubierto(giroEnDescubierto);
	}
	
	public CuentaCorriente(int nroCuenta, int saldo, String nombreCliente){
		super(nroCuenta, saldo, nombreCliente);
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	private void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		super.setSaldo(saldo);
	}

	public long getGiroEnDescubierto() {
		
		/**/
		return giroEnDescubierto;
	}

	public void setGiroEnDescubierto(long giroEnDescubierto) {
		this.giroEnDescubierto = giroEnDescubierto;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public CuentaCorriente(int nroCuenta){
		super(nroCuenta);
	}

	@Override
	public String toString() {
		return "CuentaCorriente [nroCuenta=" + nroCuenta + ", saldo=" + saldo + ", giroEnDescubierto="
				+ giroEnDescubierto + ", nombreCliente=" + nombreCliente + "]";
	}
}
