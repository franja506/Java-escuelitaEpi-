package carlos;

import java.io.InvalidClassException;
import java.util.Set;

public interface IBanco {
	public void agregarCliente(ICliente cliente) throws InvalidClassException;
	public Set<ICuenta> getCuentas();
	public Set<ICliente> getClientes();
	public String getNombre();
}
