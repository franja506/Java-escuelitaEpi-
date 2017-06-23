package julieta;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente {

	public long saldoEnDescubierto;
	public long deudaAPagar;
	public int flag;

	public CuentaCorriente(long id, String nombreCliente, String nombreBanco, long saldoEnDescubierto) {
		super(id, nombreCliente, nombreBanco);
		this.saldoEnDescubierto = saldoEnDescubierto;
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
		System.out.println("No se pueden depositar montos negativos");
		return false;
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
			System.out.println("Saldo insuficiente. Su saldo actual: " + saldoActualziado); /* indica el saldo disponible incluyendo el giro en descubierto*/																				
			return false;
		}
		}
		else{
			System.out.println("No se puede extraer un monto negativo");					
			return false;
		}
		}
	return false; 
}

	public void setGiroEnDescubierto(long n) {
		this.saldoEnDescubierto = n;
	}

	@Override
	public long giroEnDescubiertoHabilidado() {
		return this.saldo + this.saldoEnDescubierto;
	}

	public long deudaAPagar(long saldoAdeudado) {
		deudaAPagar = this.saldoEnDescubierto - saldoAdeudado;
		return deudaAPagar;
	}
}
