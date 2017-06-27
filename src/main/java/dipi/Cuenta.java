 package dipi;

public class Cuenta implements ICuenta {
	
	long id;
	
	public Cuenta(long id) {
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return super.toString() + "id:" + this.getId();
	}

	@Override
	public boolean depositar(long montoADepositar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean extraer(long montoAExtraer) 
			throws MontoNegativoCuentaException {
		if (montoAExtraer<0) {
			throw new MontoNegativoCuentaException("El monto es invalido.");
		}
		if (montoAExtraer>this.getSaldo()) {
			throw new IllegalArgumentException("El monto es mayor al saldo.");
		}
		return false;
	}

	@Override
	public long getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ICliente getCliente() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
