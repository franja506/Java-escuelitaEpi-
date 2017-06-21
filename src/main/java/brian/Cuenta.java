package brian;

public class Cuenta {
	protected long id;
	protected long cantidadDepositada;
	protected String nombreUsuario;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Cuenta(long id, String nombreUsuario){
		this.id = id;
		this.nombreUsuario = nombreUsuario;
	}
}
