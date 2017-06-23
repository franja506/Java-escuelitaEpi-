package julieta;

import dipi.ICuentaCorriente;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente {
	
	public long saldoEnDescubierto;
	
	
	public CuentaCorriente(long id, String nombreCliente, long saldoEnDescubierto) {
		super(id, nombreCliente);
		this.saldoEnDescubierto = saldoEnDescubierto;
	}
	
	@Override
	public boolean extraer(long montoAExtraer) {  
		long saldoRestante = this.saldo - montoAExtraer;
		if (saldoRestante >= 0){
			this.saldo = this.saldo - montoAExtraer;
			return true;
		}
		else{									// si no me alcanza el saldo acutailizo el saldo disponible sumandole el monto del giro en descubierto que corresponda
			long saldoActualziado = this.giroEnDescubiertoHabilidado();
			setGiroEnDescubierto(0);    		// una vez que sumo el giro es descubierto esta variable vuelve a cero
			if(saldoActualziado >= montoAExtraer){
				this.saldo = saldoActualziado - montoAExtraer;
				return true;
			}
			System.out.println("Saldo insuficiente. Su saldo actual: " + saldoActualziado);  //indica el saldo disponible para extraer sumandole el giro en descubierto
			return false;
		}
	}

	public void setGiroEnDescubierto(int n) {							
		this.saldoEnDescubierto = n;
	}
	
	@Override
	public long giroEnDescubiertoHabilidado() {
		long saldoNuevo = this.saldo + this.saldoEnDescubierto;
		return saldoNuevo;
	}
	
}
