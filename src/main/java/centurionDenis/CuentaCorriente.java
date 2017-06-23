package centurionDenis;

public class CuentaCorriente extends Cuenta{
	
	private long giroEnDescubierto;
	private final int MAX_GIRO_DESCUBIERTO = -100;
	
	public CuentaCorriente(int nroCuenta, int saldo, String nombreCliente, long 
			giroEnDescubierto){
		super(nroCuenta, saldo, nombreCliente);
	}
	
	public CuentaCorriente(int nroCuenta, int saldo, String nombreCliente){
		super(nroCuenta, saldo, nombreCliente);
	}
	
	public CuentaCorriente(int nroCuenta){
		super(nroCuenta);
	}

	public int getNroCuenta() {
		return super.getNroCuenta();
	}
	
	public boolean extraer(int monto){
		
		if(monto > 0){
			if(monto >= this.getSaldo()){
				this.giroEnDescubierto(monto);
			}
			else{
				super.setSaldo(super.getSaldo() - monto);
			}
			return true;
		}	
		return false;
		
	}

	public long getSaldo() {
		return super.getSaldo();
	}

	public void setSaldo(long saldo) {
		super.setSaldo(saldo);
	}

	private boolean giroEnDescubierto(long montoAExtraer) {
		
		if(MAX_GIRO_DESCUBIERTO <= (this.getSaldo() - montoAExtraer)){
			this.setSaldo(this.getSaldo() - montoAExtraer);
			return true;
		}

		return false;
	}

	public String getNombreCliente() {
		return super.getNombreCliente();
	}

	public void setNombreCliente(String nombreCliente) {
		super.setNombreCliente(nombreCliente);
	}

	@Override
	public String toString() {
		return "CuentaCorriente [giroEnDescubierto=" + giroEnDescubierto + ", MAX_GIRO_DESCUBIERTO="
				+ MAX_GIRO_DESCUBIERTO + "]";
	}

}
