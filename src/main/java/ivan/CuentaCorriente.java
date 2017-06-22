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
		this.setGiroDescubierto(1000);
		
	}
	public long giroEnDescubiertoHabilidado(){
		return this.getGiroDescubierto();
	}
	

	public boolean extraer(long cant){ 
		if(cant > 0 && cant < this.getSaldo()){
			System.out.println("Extracccion realizada con exito.");
			this.saldo =this.saldo - cant;
			return true;
		}
		else{
			if (cant < 0){
				System.out.println("Error. no se puede extaer valor negativo");
				return false;
			}
			else{
				if (cant > (this.getSaldo() + this.getGiroDescubierto()) ){
					System.out.println("Error. no se puede extaer mas del saldo y descubierto");
					return false;
				}else{
					
					this.saldo=(this.saldo + this.getGiroDescubierto()) - cant;
					System.out.println("Extraccion con exito se retiro utilizando el descubierto");
					return true;
				}
				
			}
		}
		
	}

}
