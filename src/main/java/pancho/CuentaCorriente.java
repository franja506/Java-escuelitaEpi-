package pancho;

public class CuentaCorriente extends Cuenta implements dipi.ICuentaCorriente{
	
	private long  montoDeGiroEnDescubierto;

	public CuentaCorriente(long numeroId, long saldo,String nombreDelCliente, long montoDescubierto) {
		super(numeroId, saldo,nombreDelCliente);
		montoDeGiroEnDescubierto = montoDescubierto;
		
	}
	
	@Override
	public boolean extraer(long extraccion) {
		if (extraccion <= 0){
			System.out.print("No se puede extraer montos negativos o cero");
			return false;
		}
		
		if (super.getSaldo() + this.giroEnDescubiertoHabilidado() >= extraccion){
			saldo -= extraccion;
			return true;
		}
		
		else
			System.out.print("No se puede extraer. No posee fondos en la cuenta");
			return false;
	}
	
	
	public long giroEnDescubiertoHabilidado() {
		return montoDeGiroEnDescubierto;
	}
	
}