package carlos;

import dipi.MontoNegativoCuentaException;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente{

	long montoGiroDescubierto;
	long id;
	long saldoMontoGiroDescubierto;

	public CuentaCorriente(long id, ICliente cliente, long montoGiroDescubierto) {
		super(id, cliente);
		this.montoGiroDescubierto = this.saldoMontoGiroDescubierto = montoGiroDescubierto;
		this.saldoMontoGiroDescubierto = montoGiroDescubierto;
	}

	public long giroEnDescubiertoHabilidado() {
		return montoGiroDescubierto;
	}

	public boolean depositar(long depositar) throws MontoNegativoCuentaException {
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
		if (saldo > 0) {
			return saldo;
		} else{
			return saldoMontoGiroDescubierto-montoGiroDescubierto;
		}
	}

	public boolean extraer(long extraer) throws MontoNegativoCuentaException {
		long saldo = super.getSaldo();
		if (saldo > extraer) {
			return super.extraer(extraer);
		} else{
			if(saldo!=0){
				extraer -= saldo;
				if(extraer<montoGiroDescubierto){
					saldoMontoGiroDescubierto -= extraer;
					extraerTodo();
					System.out.println("Su nuevo saldo es: " + getSaldo());
					return true;
				}else{
					System.err.println("[ERROR] No tenes saldo suficiente.");
					return false;
				}
			}
			
			if(extraer<=saldoMontoGiroDescubierto){
				saldoMontoGiroDescubierto -= extraer;
				System.out.println("Su nuevo saldo es: " + getSaldo());
				return true;
			}else{
				System.out.println("[ERROR] No tenes saldo suficiente.");
				return true;
			}
		}
	}
}
