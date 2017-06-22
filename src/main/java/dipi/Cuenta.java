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
	public String getNombreCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean depositar(long montoADepositar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean extraer(long montoAExtraer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
