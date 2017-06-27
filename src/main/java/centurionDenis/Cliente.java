package centurionDenis;

import java.util.ArrayList;

import dipi.ICuenta;

public class Cliente {
	
	private int cantidadCuenta;
	private int cantidadCuentaCorriente;
	private String tipoDeCuenta;
	private ArrayList<Cuenta> cuentaDelCliente = new ArrayList<Cuenta>();
	private String nombreDelCliente;
	private int nroCliente;
	
	public Cliente(int nroCliente, String nombre, String tipoCuenta, int nroCuenta, int saldo) {
		setNroCliente(nroCliente);
		setNombreDelCliente(nombre);
		setTipoDeCuenta(tipoCuenta);
		if(tipoCuenta.equals("CUENTA")){
			cuentaDelCliente.add(new Cuenta(nroCuenta, saldo, nombre));
			cantidadCuenta++;
			if(cantidadCuenta < cantidadCuentaCorriente){
				cuentaDelCliente.add(new CuentaCorriente(nroCuenta, saldo, nombre));
			}
			
		}
		else
		{
			cuentaDelCliente.add(new CuentaCorriente(nroCuenta, saldo, nombre));
			cantidadCuentaCorriente++;
		}
	}

	
	public Cliente(int nroCliente, String nombre, String tipoCuenta, int nroCuenta,
			int saldo, long giroDescubierto) {
		setNroCliente(nroCliente);
		setNombreDelCliente(nombre);
		setTipoDeCuenta(tipoCuenta);
		if(tipoCuenta.equals("CUENTA")){
			cuentaDelCliente.add(new Cuenta(nroCuenta));
			cantidadCuenta++;
			if(cantidadCuenta < cantidadCuentaCorriente){
				cuentaDelCliente.add(new CuentaCorriente(nroCuenta, saldo, nombre));
			}
			
		}
		else
		{
			cuentaDelCliente.add(new CuentaCorriente(nroCuenta, saldo, nombre,giroDescubierto));
			cantidadCuentaCorriente++;
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

	public int cantidadDeCuentasTotales(){
		return cuentaDelCliente.size();
	}
	
	public int cantidadDeCuentasCorrientes(){
		return cantidadCuentaCorriente;
	}
	
	public int cantidadDeCuentas(){
		return cantidadCuenta;
	}
}
