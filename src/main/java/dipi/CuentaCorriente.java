package dipi;

public class CuentaCorriente {
	private double saldo;

	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public String toString() {
		return "Saldo: " + this.getSaldo();
	}
}
