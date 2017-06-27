package julieta;

import java.util.HashSet;
import java.util.Set;

import dipi.ICliente;
import dipi.ICuenta;
import dipi.MontoNegativoCuentaException;

public class Cliente implements ICliente{

	protected String nombreCliente;
	protected Set<ICuenta> cuentas;

	public Cliente(String nombre) {
		this.nombreCliente = nombre;
		this.cuentas = new HashSet<ICuenta>();
	}

	public Set<ICuenta> getCuentas() {
		return this.cuentas;
	}

	public long getCantidadCuentasSaldo() {
		return this.cuentas.stream().mapToLong(cuenta -> cuenta.getSaldo()).sum();
	}

	public Cuenta crearCuenta(long id) {
		if (sePuedeAgregarCuenta()) {
			Cuenta unaCuenta = new Cuenta(id, this);
			this.cuentas.add(unaCuenta);
			return unaCuenta;
		} else {
			throw new excepcionCantidadDeCuentasCorrientesMenorQueCuentas();
		}
	}

	public CuentaCorriente crearCuentaCorriente(long id, long giroEnDescubierto) {
		CuentaCorriente unaCuentaCorriente = new CuentaCorriente(id, this, giroEnDescubierto);
		this.cuentas.add(unaCuentaCorriente);
		return unaCuentaCorriente;
	}

	protected boolean sePuedeAgregarCuenta() {
		long cuentas = this.cuentas.stream().filter(cuenta -> ((Cuenta) cuenta).esCorriente() == false).count();
		long cuentasCorrientes = this.cuentas.stream().filter(cuenta -> ((Cuenta) cuenta).esCorriente()).count();
		if (cuentasCorrientes > (cuentas + 1)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean depositarEnCuenta(long id, long monto) throws MontoNegativoCuentaException{
		return  this.cuentas.stream().filter(cuenta -> (cuenta.getId() == id)).findFirst().get().depositar(monto);
	}
	
	public boolean extraerDeCuenta(long id, long monto) throws MontoNegativoCuentaException{
		return  this.cuentas.stream().filter(cuenta -> (cuenta.getId() == id)).findFirst().get().extraer(monto);
	}

	@Override
	public String getNombre() {
		return this.nombreCliente;
	}
}
