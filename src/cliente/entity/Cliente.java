package cliente.entity;

public class Cliente {

	private String nombre;
	private String apellido;
	private int telefono;
	private String direccion;
	private int codCliente;

	public Cliente(int codCliente, String nombre, String apellido, String direccion, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codCliente = codCliente;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion="
				+ direccion + ", codCliente=" + codCliente + "]";
	}

	/****************************************************************************
	 * Métodos sugeridos por Hashset
	 */

	public boolean equals(Object o) {
		boolean respuesta = false;
		if (o != null) {
			Cliente cliente = (Cliente) o;
			if (this.codCliente == cliente.getCodCliente()) {
				respuesta = !respuesta;
			}
		}
		return respuesta;
	}

	public int hashCode() {
		return this.getCodCliente().hashCode();
	}

}
