package vanessa;

import dipi.ICuentaCorriente;
import vanessa.Cuenta;

public class CuentaCorriente extends Cuenta implements ICuentaCorriente{
	long montoGiroDescubierto;

	public CuentaCorriente(long id, String cliente, long montoGiroDescubierto){
		
		super(id, cliente);
		this.montoGiroDescubierto = montoGiroDescubierto;
	}
	
	@Override
	public long giroEnDescubiertoHabilidado() {
		return this.montoGiroDescubierto;
	}
	
	@Override
	public boolean extraer(long montoAExtraer) {
		long montoDisponible = this.saldo + this.montoGiroDescubierto;
		if (montoAExtraer > 0 && (montoDisponible >= montoAExtraer)){
			this.saldo = this.saldo - montoAExtraer;
			return true;
		}else
			return false;
	}
	
	public long getMontoDisponibleGiroDescubierto(){
		if(this.saldo<0)
			this.montoGiroDescubierto += this.saldo;
		return this.montoGiroDescubierto;
	}
	
	


}
