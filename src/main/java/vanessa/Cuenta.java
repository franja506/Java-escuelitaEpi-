package vanessa;

import dipi.ICuenta;
import vanessa.Cliente;

public class Cuenta implements ICuenta {
	long id;
	long saldo;
	String nombreCliente;
	Cliente cliente;
	
	public Cuenta(long id, Cliente cliente){
		this.id = id;
		this.saldo = 0;
		this.cliente = cliente;
	};
	public Cuenta(long id, String cliente){
		this.id = id;
		this.saldo = 0;
		this.nombreCliente = cliente;
	};
	

	@Override
	public long getId() {
		return this.id;
	}
	
	@Override
	public long getSaldo() {
		return this.saldo;
	}; 
	
	@Override
	public String getNombreCliente() {
		return this.nombreCliente;
	}

	@Override
	public boolean depositar(long montoADepositar) {
		if (montoADepositar > 0){
			this.saldo = this.saldo + montoADepositar;
			return true;
		}else
			return false;
	}

	@Override
	public boolean extraer(long montoAExtraer) {
		if (montoAExtraer > 0 && (this.saldo >= montoAExtraer)){
			this.saldo = this.saldo - montoAExtraer;
			return true;
		}else
			return false;
	}
		

}
