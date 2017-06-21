package brian;

public class Cuenta {
	protected long id;
	protected long saldo;
	protected String nombreUsuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cuenta(long id, String nombreUsuario) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.saldo = 0;
	}

	public void retirar(long cantidad) {
		this.saldo -= (this.saldo >= cantidad) ? cantidad : 0;
	}

	public void depositar(long cantidad) {
		this.saldo += cantidad;
	}
	
	public long getSaldo()
	{
		return this.saldo;
	}
}
