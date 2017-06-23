package carlos;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente {

	String cliente;
	long montoGiroDescubierto;
	long id;
	long saldoMontoGiroDescubierto;

	public CuentaCorriente(long id, String nombreCliente, long montoGiroDescubierto) {
		super(id, nombreCliente);
		this.montoGiroDescubierto = this.saldoMontoGiroDescubierto = montoGiroDescubierto;
		this.saldoMontoGiroDescubierto = montoGiroDescubierto;
	}

	public long giroEnDescubiertoHabilidado() {
		return montoGiroDescubierto;
	}

	public boolean depositar(long depositar) {
		if (super.getSaldo() >= 0) {
			return super.depositar(depositar);
		} else {
			saldoMontoGiroDescubierto = saldoMontoGiroDescubierto + depositar;
			if(saldoMontoGiroDescubierto>montoGiroDescubierto){
				super.depositar(saldoMontoGiroDescubierto-montoGiroDescubierto);
				saldoMontoGiroDescubierto = montoGiroDescubierto;
			}
			return true;
		}
	}

	public long getSaldo() {
		long saldo = super.getSaldo();
		if (saldo >= 0) {
			return saldo;
		} else {
			return saldoMontoGiroDescubierto-montoGiroDescubierto;
		}
	}

	public boolean extraer(long extraer) {
		long saldo = super.getSaldo();
		if (saldo > extraer) {
			return super.extraer(extraer);
		} else{
			if(saldo!=0){
				extraer -= saldo;
				super.extraer(saldo);
			}
			
			if(extraer>saldoMontoGiroDescubierto){
				System.err.println("No tenes saldo suficiente.");
				return false;
			}
			saldoMontoGiroDescubierto -= extraer;
			return true;
		}
	}
}
