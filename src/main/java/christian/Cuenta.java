package christian;

import dipi.ICuenta;

public class Cuenta implements ICuenta {
	private long saldo=0;
	private long id;
	private String nombreCliente;
	TipoDeCuenta tipo = TipoDeCuenta.COMUN;
	
	public Cuenta(long id, String nombreCliente) {
		this.id = id;
		this.nombreCliente = nombreCliente;
	}

	public long getId() {
		return id;
	}
	
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	public long getSaldo() {
		return this.saldo;
	}
	
	public boolean esMontoValido(long montoADepositar)
	{
		return montoADepositar > 0;
	}
	
	private void sumarSaldo(long montoADepositar) {
		this.setSaldo(this.getSaldo() + montoADepositar);
	}
	
	public boolean depositar(long montoADepositar) {
		
		if(!esMontoValido(montoADepositar)) {
			return false;
		}
		
		this.sumarSaldo(montoADepositar);
		return true;
		
	}
	
	public boolean haySuficienteSaldoParaExtraer(long montoAExtraer) {
		return this.getSaldo() > montoAExtraer ;
	}
	
	public boolean extraer(long montoAExtraer) {
		
		if(esMontoValido(montoAExtraer) && haySuficienteSaldoParaExtraer(montoAExtraer))
		{
			restarSaldo(montoAExtraer);
			return true;
		}
		
		return false;
	}
	
	private void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	
	private void restarSaldo(long saldoExtraer) {
		saldo-=saldoExtraer;
	}
	
}
