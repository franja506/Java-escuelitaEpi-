package carlos;

import dipi.MontoNegativoCuentaException;

public class Cuenta implements ICuenta{
	private long saldo;
	private long id;
	private ICliente cliente;
	
	public Cuenta(long id,ICliente cliente) {
		this.id=id;
		this.cliente=cliente;
		saldo=0;
	}
	public long getSaldo(){
		return saldo;
	}
	
	public long getId() {
		return id;
	}

	@Override
	public ICliente getCliente() {
		return cliente;
	}


	public boolean extraer(long extraer)throws MontoNegativoCuentaException {
		if(extraer<0){
			throw new MontoNegativoCuentaException("Ingrese un valor correcto");
		}else{
			if(extraer>saldo){
				System.err.println("No tiene saldo suficiente");
				return false;
			}
			saldo = saldo-extraer;
			System.out.println("Su nuevo saldo es: " + saldo);
			return true;
		}
	}
	
	public void extraerTodo(){
		saldo = 0;
	}
	public boolean depositar(long depositar)throws MontoNegativoCuentaException {
		if(depositar<0){
			throw new MontoNegativoCuentaException("Ingrese un valor correcto");
		}else{
			saldo = saldo+depositar;
			System.out.println("Su nuevo saldo es: " + saldo);
			return true;
		}
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Cuenta) || !(obj instanceof CuentaCorriente)){
			return false;
		}
		Cuenta other = (Cuenta) obj;
		if(!other.cliente.equals(cliente)){
			return false;
		}
		if(other.id != id){
			return false;
		}
		return true;
	}
}
