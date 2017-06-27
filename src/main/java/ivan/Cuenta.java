package ivan;

public class Cuenta implements dipi.ICuenta {
	public long saldo;
	private Cliente cliente;
	private long id;
	
	
	public Cuenta(long nro, Cliente cliente ){
		this.saldo=0;
		this.id=nro;
		this.cliente=cliente;
		
	}
	public long getSaldo() {
		return saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public long getId() {
		return id;
	}

	
	public boolean extraer(long cant){
		if (cant <= 0 ){
			System.out.println("no se puede extraer una cantidad negativa o cero");
			return false;
		}
		else{
			if( cant < this.saldo  ){
				this.saldo = (this.getSaldo() - cant);
				System.out.println("se realizo la extraccion con exito, su saldo es: " + this.getSaldo());
				return true;
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
			System.out.println("Fallo. No se puede depositar una cantidad negativa o cero");
			return false;
		}
		
	}
	
	@Override
	 public String toString() {
	        return "Cuenta{" +
	                "id=" + id +
	                ", cliente='" + cliente + 
	                ", saldo=" + saldo +
	                '}';
	}
	
	
	public boolean equals(Cuenta cuenta){
		if (cuenta instanceof Cuenta){
			Cuenta c = (Cuenta) cuenta;
			return (this.id == c.getId() && this.cliente.equals(c.getCliente())); 
		}
		else{
			return false;
		}
		
	}
	
	public int hashCode(){
		return (int) (this.id + this.getCliente().getNombre().length());
	}
	
	public boolean soyCuenta(){
		return true;
	}

}
