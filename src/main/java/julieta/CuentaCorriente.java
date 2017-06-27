package julieta;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente {

	public long saldoEnDescubierto;
	public long deudaAPagar;
	public int flag;

	public CuentaCorriente(long id, Cliente cliente, long saldoEnDescubierto) {
		super(id, cliente);
		this.saldoEnDescubierto = saldoEnDescubierto;
	}

	public boolean esCorriente(){
		return true;
	}
	
	@Override
	public boolean depositar(long montoADepositar) {
		if(montoADepositar > 0){
		if (this.deudaAPagar > 0) {
			if (montoADepositar > 0 && montoADepositar >= deudaAPagar) {
				montoADepositar = montoADepositar - deudaAPagar;
				this.deudaAPagar = 0;
				this.flag = 0;
				this.saldo = this.saldo + montoADepositar;
				System.out.println("Su deuda fue saldada");
				return true;
			} else if (montoADepositar < 0) {
				System.out.println("No se pueden depositar montos negativos");
				return false;
			}
		} else {
			if (montoADepositar > 0 && this.deudaAPagar > 0) {
				this.saldo = this.saldo + montoADepositar;
				System.out.println("Su deuda de: " + this.deudaAPagar + " sigue pendiente");
				return true;
			} else {
				this.saldo = this.saldo + montoADepositar;
				return true;
			}
		}
		}else {
			throw new excepcionMontoNegativo();
		}
	return false;
}
	
	@Override
	public boolean extraer(long montoAExtraer) {
	
	if(montoAExtraer > 0){
		long saldoRestante = this.saldo - montoAExtraer;
		if (saldoRestante >= 0) {
			this.saldo = this.saldo - montoAExtraer;
			return true;
		} else if (saldoRestante <= 0 && this.flag == 0) { /* si no me alcanza el saldo acutalizo el saldo disponible 
		 													  sumandole el monto del giro en descubierto que corresponda*/		
			long saldoActualziado = this.giroEnDescubiertoHabilidado();
			this.flag = 1; /* una vez que sumo el giro es descubierto / se settea el flag en 1*/
			if (saldoActualziado >= montoAExtraer) {
				this.saldo = saldoActualziado - montoAExtraer;
				deudaAPagar(saldoActualziado);
				return true;
		} else if (saldoRestante <= 0 && this.flag == 1){
			throw new excepcionFondosInsuficientes();
		}
		}
		}
	throw new excepcionMontoNegativo(); 
}

	public void setGiroEnDescubierto(long n) {
		this.saldoEnDescubierto = n;
	}


	public long giroEnDescubiertoHabilidado() {
		return this.saldo + this.saldoEnDescubierto;
	}

	public long deudaAPagar(long saldoAdeudado) {
		deudaAPagar = this.saldoEnDescubierto - saldoAdeudado;
		return deudaAPagar;
	}
}
