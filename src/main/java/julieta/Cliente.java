package julieta;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

	protected String nombreCliente;
	protected Set<Cuenta> cuentas;

	public Cliente(String nombre) {
		this.nombreCliente = nombre;
		this.cuentas = new HashSet<Cuenta>();
	}

	public Set<Cuenta> getCuentas() {
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
		long cuentas = this.cuentas.stream().filter(cuenta -> cuenta.esCorriente() == false).count();
		long cuentasCorrientes = this.cuentas.stream().filter(cuenta -> cuenta.esCorriente()).count();
		if (cuentasCorrientes > (cuentas + 1)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean depositarEnCuenta(long id, long monto){
		return  this.cuentas.stream().filter(cuenta -> (cuenta.getId() == id)).findFirst().get().depositar(monto);
	}
	
	public boolean extraerDeCuenta(long id, long monto){
		return  this.cuentas.stream().filter(cuenta -> (cuenta.getId() == id)).findFirst().get().extraer(monto);
	}
}
