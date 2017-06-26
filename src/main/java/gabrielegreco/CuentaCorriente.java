package gabrielegreco;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta  implements ICuentaCorriente{
	private int giroDescubierto;
	private int estadoGiroDescubierto;

	public CuentaCorriente(long id, int giroDescubierto) {
		super(id);
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

	public long giroEnDescubiertoHabilidado() {
		if (giroDescubierto == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	

}
