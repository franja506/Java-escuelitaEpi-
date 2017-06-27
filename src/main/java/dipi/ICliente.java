package dipi;

import java.util.Set;

public interface ICliente {
	public void agregarCuenta(ICuenta cuenta);
	public Set<ICuenta> getCuentas();
	public String getNombre();
}
