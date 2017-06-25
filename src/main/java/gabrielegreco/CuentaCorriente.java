package gabrielegreco;


public class CuentaCorriente extends Cuenta {
	private int giroDescubierto;
	private int estadoGiroDescubierto;

	public CuentaCorriente(long id, int giroDescubierto) {
		super(id);
		this.giroDescubierto = giroDescubierto;
		estadoGiroDescubierto = 0;

	}

	public boolean extraer(long montoAExtraer) {
		
		long saldo1=getSaldo();
		if ((montoAExtraer > 0) && ((saldo1 - montoAExtraer) >= giroDescubierto)) {
			if ((saldo1 - montoAExtraer) < 0) {
				if (estadoGiroDescubierto == 1)
					return false;
				else {
					estadoGiroDescubierto = 1;
				}
			}
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
