package ivan;

public class CuentaCorriente extends Cuenta  implements dipi.ICuentaCorriente{
	private long giroDescubierto;

	
	public long getGiroDescubierto() {
		return giroDescubierto;
	}
	public void setGiroDescubierto(long giroDescubierto) {
		this.giroDescubierto = giroDescubierto;
	}
	
	public  CuentaCorriente (long nroCuenta, String cliente, long giro ){
		super(nroCuenta, cliente);		 
		this.setGiroDescubierto(giro);
		
	}
	public long giroEnDescubiertoHabilidado(){
		return this.getGiroDescubierto();
	}
	

	public boolean extraer(long cant){ 
		if (cant <= 0){
			System.out.println("Error. no se puede extaer valor negativo");
			return false;
		}
		else{
			if (this.getSaldo() + this.getGiroDescubierto() >= cant){
				this.saldo = (this.saldo - cant);
				System.out.println("se realizo la extreaccion con exito");
				return true;
			}
			else{
				System.out.println("Error. no se puede extraer mas del saldo y monto descubierto");
				return false;
			}
		}
	}

}
