package agencia.entity;

public class Agencia {

	private String nombre;
	private int telefono;
	private String direccion;
	private int codAgencia;

	public Agencia(int codAgencia, String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.codAgencia = codAgencia;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Integer getCodAgencia() {
		return codAgencia;
	}

	public void setCodAgencia(int codAgencia) {
		this.codAgencia = codAgencia;
	}
	
	

	@Override
	public String toString() {
		return "Agencia [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", codAgencia="
				+ codAgencia + "]";
	}

	/****************************************************************************
	 * Métodos sugeridos por Hashset
	 */

	public boolean equals(Object o) {
		boolean respuesta = false;
		if (o != null) {
			Agencia agencia = (Agencia) o;
			if (this.codAgencia == agencia.getCodAgencia()) {
				respuesta = !respuesta;
			}
		}
		return respuesta;
	}

	public int hashCode() {
		return this.getCodAgencia().hashCode();
	}

}
