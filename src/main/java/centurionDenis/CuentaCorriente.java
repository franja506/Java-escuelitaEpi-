package centurionDenis;

public class CuentaCorriente extends Cuenta implements dipi.ICuentaCorriente{
	
	private long giroEnDescubierto;
	private final long GIRO_DESCUBIERTO;
	private final long MIN_GIRO_DESCUBIERTO = 100;
	
	public CuentaCorriente(int nroCuenta, int saldo, String nombreCliente, long 
			giroEnDescubierto){
		super(nroCuenta, saldo, nombreCliente);
		GIRO_DESCUBIERTO = giroEnDescubierto;
	}
	
	public CuentaCorriente(int nroCuenta, int saldo, String nombreCliente){
		super(nroCuenta, saldo, nombreCliente);
		GIRO_DESCUBIERTO = MIN_GIRO_DESCUBIERTO;
	}
	
	public CuentaCorriente(int nroCuenta){
		super(nroCuenta);
		GIRO_DESCUBIERTO = MIN_GIRO_DESCUBIERTO;
	}
	
	public CuentaCorriente(){
		GIRO_DESCUBIERTO = MIN_GIRO_DESCUBIERTO;
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
		
		if(GIRO_DESCUBIERTO <= (this.getSaldo() - montoAExtraer)){
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
		return super.toString() + "CuentaCorriente [giroEnDescubierto=" + giroEnDescubierto + ", MAX_GIRO_DESCUBIERTO="
				+ GIRO_DESCUBIERTO + "]";
	}

	public long giroEnDescubiertoHabilidado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
