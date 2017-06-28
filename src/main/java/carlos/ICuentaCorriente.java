package carlos;

public interface ICuentaCorriente extends ICuenta{
	
	/**
	 * El giro en descubierto habilitado es el limite 
	 * que cada cuenta corriente tiene para extraer 
	 * mas alla del saldo. 
	 *  
	 * @return
	 */
	public long giroEnDescubiertoHabilidado();
}
