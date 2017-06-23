package ivan;

public class Cuenta implements dipi.ICuenta {
	public long saldo;
	private String nombreCliente;
	private long id;
	
	
	public Cuenta(long nro, String cliente ){
		this.saldo=0;
		this.id=nro;
		this.setNombreCliente(cliente);
		
	}
	public long getSaldo() {
		return saldo;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public long getId() {
		return id;
	}

	
	public boolean extraer(long cant){
		if(cant > 0 && cant < this.saldo  ){
			this.saldo = (this.saldo - cant);
			System.out.println("se realizo la extraccion con exito");
			return true;
		}else{
			if(cant < 0){
				System.out.println("no se puede extraer una cantidad negativa");
				return false;
			}
			else{
				System.out.println("no se puede extraer mas cantidad de la del saldo de la cuenta");
				return false;
			}
		}
		
	}
	
	public boolean depositar(long cant){
		if (cant > 0){
			this.saldo = (this.saldo + cant);
			System.out.println("se deposito con exito. su saldo es :"+ this.getSaldo());
			return true;
		}else{
			System.out.println("Fallo. No se puede depositar una cantidad negativa");
			return false;
		}
		
	}

}
