package dipi;

import java.util.Set;

public interface IBanco {
	public void agregarCliente(ICliente cliente);
	public Set<ICuenta> getCuentas();
	public Set<ICliente> getClientes();
	public String getNombre();
}
