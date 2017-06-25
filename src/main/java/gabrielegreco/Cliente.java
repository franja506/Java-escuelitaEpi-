package gabrielegreco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	 private String nombreCliente;
	 private List<CuentaCorriente> listaCuentaCorrierntes = new ArrayList<CuentaCorriente>();
	 private List<Cuenta> listaCuentas = new ArrayList<Cuenta>();
	 
	 public Cliente(String nombreCliente){
		 this.nombreCliente=nombreCliente;
	 }
	 public void agregarCuentaCorriente(long id,int giroDescubierto){
		 listaCuentaCorrierntes.add(new CuentaCorriente(id, giroDescubierto));
	 }
	 public void agregarCuenta(long id,int girodescubierto){
		 listaCuentas.add(new Cuenta(id));
	 }
	 public long buscarCuenta(long id,long montoAExtraer,int opcion,long montoADepositar){
		 int i;
		 for(i=0;i<listaCuentaCorrierntes.size();i++){
			 if(listaCuentaCorrierntes.get(i).getId()==id){
				 if(opcion==0){
				 //System.out.println("EL TITULAR ES"+nombreCliente);
				// System.out.println("SU SALDO ES"+listaCuentaCorrierntes.get(i).getSaldo());
				 return listaCuentaCorrierntes.get(i).getSaldo();
				 }
				 else if(opcion==1){
					 listaCuentaCorrierntes.get(i).depositar(montoADepositar);
				 }
				 else if(opcion==2){
					 System.out.println("ESTOY EN EXTRAER");
					 listaCuentaCorrierntes.get(i).extraer(montoAExtraer);

				 }
			 }
			
		 }
		 for(i=0;i<listaCuentas.size();i++){
			 if(listaCuentas.get(i).getId()==id){
				 if(opcion==0){
					 System.out.println("EL TITULAR ES"+nombreCliente);
					 System.out.println("SU SALDO ES"+listaCuentas.get(i).getSaldo());
					 return listaCuentas.get(i).getSaldo();
					 }
					 else if(opcion==1){
						 listaCuentas.get(i).depositar(montoADepositar);
					 }
					 else if(opcion==2){
						 listaCuentaCorrierntes.get(i).extraer(montoAExtraer);

					 }
			 }
			
		 }
		 return -1;
		 
	 }
	 public void eliminarCuenta(long id){
		 
	 }
	public List<CuentaCorriente> getListaCuentaCorrierntes() {
		return listaCuentaCorrierntes;
	}
	public void setListaCuentaCorrierntes(List<CuentaCorriente> listaCuentaCorrierntes) {
		this.listaCuentaCorrierntes = listaCuentaCorrierntes;
	}
	public List<Cuenta> getListaCuentas() {
		return listaCuentas;
	}
	public void setListaCuentas(List<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	 
	 
}
