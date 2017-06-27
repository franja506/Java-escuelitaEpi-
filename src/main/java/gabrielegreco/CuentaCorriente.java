/*package gabrielegreco;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta  implements ICuentaCorriente{
	private int giroDescubierto;

	public CuentaCorriente(long id, int giroDescubierto) {
		super(id,0);
		this.giroDescubierto = giroDescubierto;

	}

	public boolean extraer(long montoAExtraer) {
		
		long saldo1=getSaldo();
		if ((montoAExtraer > 0) && ((saldo1 - montoAExtraer) >= giroDescubierto)) {
			
			setSaldo(saldo1 - montoAExtraer);
			System.out.println("monto a sacar aceptado");

			return true;

		} else {
			System.out.println("monto a sacar denegado");
			return false;
		}

	}

	public int getGiroDescubierto() {
		return giroDescubierto;
	}

	public void setGiroDescubierto(int giroDescubierto) {
		this.giroDescubierto = giroDescubierto;
	}

	

	

}*/
