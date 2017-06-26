package gabrielegreco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	 private String nombreBanco;
	 private List<Cliente> listaClientes = new ArrayList<Cliente>();
	 
	 public Banco(String nombreBanco){
		 this.nombreBanco = nombreBanco;
	 }
	 public boolean agregarCliente(String nombreCliente){
		 if(buscarNombreCliente(nombreCliente)==-1){
			 //System.out.println("CLIENTE NUEVO  "+nombreCliente+"  AGREGADO EXITOSAMENTE");
			 listaClientes.add(new Cliente(nombreCliente));
			 return true;
		 }
		 else{
			// System.out.println("El nombre existe  no lo voy a agregar");
			 return false;
		 }
	 }
	 public int buscarNombreCliente(String nombreCliente){
		 String nombreListaCliente;
		 if(listaClientes.size()==0){
			 return -1;
		 }
		 else{
			 for(int i=0;i<listaClientes.size();i++){
				 nombreListaCliente=listaClientes.get(i).getNombreCliente();
				 if(nombreCliente.equals(nombreListaCliente)){
					 return i;
				 }
			 }
			 return -1;
		 }
	 }
	 public boolean agregarCuenta(String nombreCliente,long id,int giroDescubierto){
		 int i=buscarNombreCliente(nombreCliente);
		 if(i>=0){
			 if(buscarid(id)){
				// System.out.println("NO SE PUDO CREAR CREAR CUENTA"+nombreCliente+" con ID:"+id);
				 return false;
			 }
			 else{
				// System.out.println("VOY A CREAR CUENTA  "+nombreCliente+"  con ID:  "+id);
				 Cliente cliente=listaClientes.get(i);
				 if(giroDescubierto<0){
				 cliente.agregarCuentaCorriente(id, giroDescubierto);
				 return true;
				 }
				 else{
					 if(listaClientes.get(i).getListaCuentaCorrierntes().size()<((listaClientes.get(i).getListaCuentas().size())+1)){
						 return false;
					 }
					 cliente.agregarCuenta(id, giroDescubierto);
					 return true;
				 }
			 }
			  
		 }
		 else {
			// System.out.println("NO SE PUDO CREAR CUENTA"+nombreCliente+" con ID:"+id);
			 return false;
		 }
	 }
	 public boolean buscarid(long id){
		 
		 for(int i=0;i<listaClientes.size();i++){
			 Cliente clienteAComparar=listaClientes.get(i);
			 List<Cuenta> listaCuentaAComparar= clienteAComparar.getListaCuentas();
			 for(int j=0;j<listaCuentaAComparar.size();j++){
				 if(listaCuentaAComparar.get(j).getId()==id){
					 return true;
				 }
			}
		 }
		 for(int i=0;i<listaClientes.size();i++){
			 Cliente clienteAComparar=listaClientes.get(i);
			 List<CuentaCorriente> listaCuentaCorrienteAComparar = clienteAComparar.getListaCuentaCorrierntes();
			 for(int j=0;j<listaCuentaCorrienteAComparar.size();j++){
				 if(listaCuentaCorrienteAComparar.get(j).getId()==id){
					 return true;
				 }
			}
		 }
		 return false;
	 }
	 public boolean depositar(String nombreCliente,long id,long montoADepositar){

			int i=buscarNombreCliente(nombreCliente);
			if(i>=0){
				if(buscarid(id)){
				//	System.out.println("LA CUENTA EXISTE VOY A DEPOSITAR : "+montoADepositar);
					 Cliente clienteVerDatos=listaClientes.get(i);
					 clienteVerDatos.buscarCuenta(id,0, 1, montoADepositar);
					return true;
				}
				//System.out.println("EXISTE EL NOMBRE DEL CLIENTE PERO EL ID NO");
				return false;
			}
			else{
				System.out.println("LA CUENTA A BUSCAR NO EXISTE");
				return false;
			}
			 
		 
		 
	 }
	public boolean extraer(String nombreCliente,long id,long montoAExtraer){
		int i=buscarNombreCliente(nombreCliente);
		if(i>=0){
			if(buscarid(id)){
				//System.out.println("LA CUENTA EXISTE VOY A EXTRAER : ");
				 Cliente clienteVerDatos=listaClientes.get(i);
				 clienteVerDatos.buscarCuenta(id,montoAExtraer, 2,0);
				return true;
			}
			//System.out.println("se encontro el nombre no el id");
			return false;
		}
		else{
			//System.out.println("LA CUENTA A BUSCAR NO EXISTE");
			return false;
		}
		 
	}
	public long getSaldo(String nombreCliente,long id){
		int i=buscarNombreCliente(nombreCliente);
		long dato;
		if(i>=0){
			if(buscarid(id)){
				//System.out.println("LA CUENTA EXISTE EL SADO ES : ");
				 Cliente clienteVerDatos=listaClientes.get(i);
				 dato= clienteVerDatos.buscarCuenta(id, 0, 0, 0);
				return dato;
			}
			//System.out.println("se encontro el nombre no el id");
			return -1;
		}
		else{
			//System.out.println("LA CUENTA A BUSCAR NO EXISTE");
			return -1;
		}
		 
	 }
	 	
}
