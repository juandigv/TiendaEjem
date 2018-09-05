package servicio.entity;

public class Servicio {

	private String codServicio;
	private String fechaAtencion;
	private int codCliente;
	private String tipoServicio;
	private int codAgencia;

	public Servicio(String fechaAtencion, int codCliente, String tipoServicio, int codAgencia) {
		this.fechaAtencion = fechaAtencion;
		this.codCliente = codCliente;
		this.tipoServicio = tipoServicio;
		this.codAgencia = codAgencia;
		codServicio = codCliente + "" + codAgencia + "" + fechaAtencion;
	}

	public String getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(String fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public int getCodAgencia() {
		return codAgencia;
	}

	public void setCodAgencia(int codAgencia) {
		this.codAgencia = codAgencia;
	}

	public String getCodServicio() {
		return codServicio;
	}

	public void setCodServicio(String codServicio) {
		this.codServicio = codServicio;
	}

	
	


	@Override
	public String toString() {
		return "Servicio [tipoServicio=" + tipoServicio + ", fechaAtencion=" + fechaAtencion + "]";
	}

	/****************************************************************************
	 * Métodos sugeridos por Hashset
	 */

	public boolean equals(Object o) {
		boolean respuesta = false;
		if (o != null) {
			Servicio servicio = (Servicio) o;
			if (this.codServicio == servicio.getCodServicio()) {
				respuesta = !respuesta;
			}
		}
		return respuesta;
	}

	public int hashCode() {
		return this.getCodServicio().hashCode();
	}

}
