package carlos;

import java.io.InvalidClassException;
import java.util.Set;

public interface ICliente {
	public void agregarCuenta(ICuenta cuenta) throws InvalidClassException;
	public Set<ICuenta> getCuentas();
	public String getNombre();
}
