package dipi;

import java.util.Set;

public interface IBanco {
	public Set<ICuenta> getCuentas();
	public Set<ICliente> getClientes();
	public String getNombre();
}
