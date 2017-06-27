package centurionDenis;

import java.util.ArrayList;

import dipi.ICuenta;

public class Cliente {
	
	private String tipoDeCuenta;
	private ArrayList<Cuenta> cuentaDelCliente;
	private String nombreDelCliente;
	private int nroCliente;
	
	public Cliente(int nroCliente2, String nombre, String tipoCuenta, int nroCuenta,
			int saldo, long giroDescubierto) {
		setNroCliente(nroCliente2);
		setNombreDelCliente(nombre);
		setTipoDeCuenta(tipoCuenta);
		if(tipoCuenta.equals("CUENTA")){
			cuentaDelCliente.add(new Cuenta(nroCuenta));
			while(cuentaDelCliente.iterator().hasNext()){
				/*logica para determinar si tiene mas cuentas que cuentascorrientes*/
			}
			
		}
		else
		{
			cuentaDelCliente.add(new CuentaCorriente(nroCuenta, saldo, nombre,giroDescubierto));
		}
	}


	public Cliente(int nroCliente, String nombreDelCliente, String tipoDeCuenta){
		setNombreDelCliente(nombreDelCliente);
		setNroCliente(nroCliente);
		setTipoDeCuenta(tipoDeCuenta);
	}
	
	public Cliente(int nroCliente){
		setNroCliente(nroCliente);
	}
	public Cliente(int nroCliente2, String nombre, String tipoCuenta, int nroCuenta) {
		setNroCliente(nroCliente2);
		setNombreDelCliente(nombre);
		setTipoDeCuenta(tipoCuenta);
		if(tipoCuenta.equals("CUENTA")){
			cuentaDelCliente.add(new Cuenta(nroCuenta));
			while(cuentaDelCliente.iterator().hasNext()){
				/*logica para determinar si tiene mas cuentas que cuentascorrientes*/
			}
			
		}
		else
		{
			cuentaDelCliente.add(new CuentaCorriente(nroCuenta));
		}
	}

	public String getTipoDeCuenta() {
		return tipoDeCuenta;
	}

	public void setTipoDeCuenta(String tipoDeCuenta) {
		this.tipoDeCuenta = tipoDeCuenta;
	}

	public String getNombreDelCliente() {
		return nombreDelCliente;
	}

	public void setNombreDelCliente(String nombreDelCliente) {
		this.nombreDelCliente = nombreDelCliente;
	}
	
	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	
	public boolean generarCuentaACliente(Cuenta cuenta){
			this.cuentaDelCliente.add(cuenta);
		return true;
	}
	
}
