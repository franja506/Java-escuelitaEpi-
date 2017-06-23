package centurionDenis;

public class Cuenta implements dipi.ICuenta {

	private String nombreCliente;
	private int nroCuenta;
	private long saldo;

	public Cuenta(int nroCuenta, int saldo, String nombreCliente) {
		this(nroCuenta, saldo);
		this.setNombreCliente(nombreCliente);
	}

	public Cuenta(int nroCuenta, int saldo){
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
	}

	public Cuenta(int nroCuenta){
		this(nroCuenta, 0);
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	private void setNroCuenta(int nroCuenta){
		if(nroCuenta >= 0)
			this.nroCuenta = nroCuenta;
	}
	
	public int getNroCuenta(){
		return nroCuenta;
	}
	
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public long getSaldo() {
		return saldo;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean depositar(long montoADepositar) {
		
		if(montoADepositar < 0){
			return false;
		}
		this.saldo += montoADepositar;
		
		return true;
	}

	public boolean extraer(long montoAExtraer) {
		if(montoAExtraer < this.getSaldo()){
			this.saldo -= montoAExtraer;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Cuenta [nombreCliente=" + nombreCliente + ", nroCuenta=" + nroCuenta + ", saldo=" + saldo + "]";
	}
}