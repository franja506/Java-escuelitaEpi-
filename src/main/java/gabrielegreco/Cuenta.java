package gabrielegreco;

import dipi.ICliente;
import dipi.ICuenta;

public class Cuenta implements ICuenta{

	private long saldo;
	private long id;
	private int montoDescubierto;
	public Cuenta(long id, int montoDescubierto) {

		this.id = id;
		this.montoDescubierto=montoDescubierto;
		saldo = 0;
		
	}

	public boolean depositar(long montoADepositar) {
		if (montoADepositar > 0) {
			saldo = saldo + montoADepositar;
			return true;
		} else {
			return false;
		}

	}

	public boolean extraer(long montoAExtraer) {
		if(montoDescubierto==0){
		if (montoAExtraer < saldo && montoAExtraer > 0) {
			saldo = saldo - montoAExtraer;
			return true;
		} else {
			return false;
		}
		}
		else {
			if ((montoAExtraer > 0) && ((saldo - montoAExtraer) >= montoDescubierto)) {
				
				setSaldo(saldo - montoAExtraer);
				System.out.println("monto a sacar aceptado");

				return true;

			} else {
				System.out.println("monto a sacar denegado");
				return false;
			}
		}
	}

	public long getSaldo() {
		return saldo;
	}

	public long getId() {
		return id;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	public ICliente getCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
