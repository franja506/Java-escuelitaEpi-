package gabrielegreco;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import dipi.IBanco;
import dipi.ICliente;
import dipi.ICuenta;

public class Banco implements IBanco {
	private Set<ICliente> conjuntoIClientes = new HashSet<ICliente>();
	private Set<ICuenta> conjuntoICuenta = new HashSet<ICuenta>();
	private String nombreDelBanco;

	public Banco(String nombreBanco) {
		this.nombreDelBanco = nombreBanco;
	}

	public boolean agregarCuenta(Cliente ClienteAgregarCuenta,Cuenta cuentaNueva) {
	    
		if(conjuntoIClientes.contains(ClienteAgregarCuenta)){
			if(conjuntoICuenta.contains(cuentaNueva)){
				System.out.println("esta cuenta ya existe");
				return false;
			}
			else{
				System.out.println("Voy a agregar la cuenta a lista de cuenta del banco");
				conjuntoICuenta.add(cuentaNueva);
				System.out.println("Le voy a agregar la cuenta al cliente en particular");			
			     Iterator<ICliente> it = conjuntoIClientes.iterator();
			     while(it.hasNext()){
			    	 Cliente C;
			    	 C=(Cliente)it.next();
			    	 	if(C.equals(ClienteAgregarCuenta)){
			    	 		C.agregarCuenta(cuentaNueva);
			    	 	}
			     }
				
				return true;
			}
		}
		else{
			System.out.println("No es cliente del banco");
			return false;
		}
	}
	public boolean depositar(long montoADepositar,Cuenta cuentaADepositar,Cliente clienteADepositar){
			
		if(conjuntoICuenta.contains(cuentaADepositar)){
					if(cuentaADepositar.depositar(montoADepositar)){	/*
						 Iterator<ICliente> it = conjuntoIClientes.iterator();
					     while(it.hasNext()){
					    	 Cliente C;
					    	 C=(Cliente)it.next();
					    	 	if(C.equals(clienteADepositar)){
					    	 		Iterator<ICuenta> iter = C.getCuentas().iterator();
								     while(iter.hasNext()){
								    	 Cuenta cuenta;
								    	 cuenta=(Cuenta)iter.next();
								    	 cuenta.equals(cuentaADepositar);
								    	 cuenta.depositar(montoADepositar);
								     }
					    	 	}
					   
					return true;
					     }*/
						return true;
					}
			else{
				System.out.println("no existe la cuenta ERROR");
				return false;
			}
		}
		return false;
	}
	public long getSaldo(Cuenta veoSaldo){
		if(conjuntoICuenta.contains(veoSaldo)){
			System.out.println("El saldo de la cuenta es"+veoSaldo.getSaldo());
			
			return veoSaldo.getSaldo();
			
		}
		return -1;
	}
	
	public boolean extraer(Cuenta cuentaExtraer,long montoASacar){
		if(conjuntoICuenta.contains(cuentaExtraer)){
			cuentaExtraer.extraer(montoASacar);
			return true;
		}
		return false;
	}
		
	
	
	public Set<ICuenta> getCuentas() {
		return conjuntoICuenta;
	}

	public Set<ICliente> getClientes() {
		return conjuntoIClientes;
	}

	public void agregarCliente(ICliente clienteNuevo) {
		if(this.conjuntoIClientes.add(clienteNuevo)){
			System.out.println("Se pudo agregar el Cliente");
		}
		else{
			System.out.println("No se pudo agregar el Cliente");
		}
		
	}

	public String getNombre() {
		return nombreDelBanco;
	}

	

}
