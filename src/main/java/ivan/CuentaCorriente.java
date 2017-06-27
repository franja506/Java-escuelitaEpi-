package ivan;

public class CuentaCorriente extends Cuenta  implements dipi.ICuentaCorriente{
	private long giroDescubierto;

	
	public long getGiroDescubierto() {
		return giroDescubierto;
	}
	public void setGiroDescubierto(long giroDescubierto) {
		this.giroDescubierto = giroDescubierto;
	}
	
	public  CuentaCorriente (long nroCuenta, Cliente cliente, long giro ){
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
				System.out.println("se realizo la extraccion con exito");
				return true;
			}
			else{
				System.out.println("Error. no se puede extraer mas del saldo y monto descubierto");
				return false;
			}
		}
	}

	 public String toString() {
	        return "CuentaCorriente{" +
	                "id=" + this.getId() +
	                ", cliente='" + this.getCliente().getNombre() + 
	                ", saldo=" + saldo +
	                ", giroDescubierto=" + this.getGiroDescubierto() +
	                '}';
	}
	 
	 public boolean soyCuenta(){
		 return false;
	 }
	 
	public boolean equals(CuentaCorriente cuentaCC){
		if (cuentaCC instanceof CuentaCorriente){
			CuentaCorriente c = (CuentaCorriente) cuentaCC;
			return (this.getId() == c.getId() && this.getCliente().equals(c.getCliente())); 
		}
		else{
			return false;
		}
			
	}
		
	public int hashCode(){
		return (int) (this.getId() + this.getCliente().getNombre().length());
	}
}
