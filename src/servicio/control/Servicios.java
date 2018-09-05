package servicio.control;

import java.util.HashSet;
import java.util.Iterator;

import servicio.entity.InexistentServiceException;
import servicio.entity.Servicio;

public class Servicios {
	private HashSet<Servicio> servicios;

	public Servicios() {
		servicios = new HashSet<Servicio>();
	}

	public void ingresar(Servicio servicio) throws java.lang.ArrayIndexOutOfBoundsException {
		servicios.add(servicio);
		System.out.println(">>Servicio añadido!");
	}

	public void eliminar(int codCliente, int codAgencia, int fechaAtencion) throws InexistentServiceException {
		String codServicio = codCliente + "" + codAgencia + "" + fechaAtencion;
		servicios.remove(buscar(codServicio));
	}

	public Servicio buscar(String codServicio) throws InexistentServiceException {
		Servicio resultado = null;
		Servicio servicio;
		for (Iterator<Servicio> iterator = servicios.iterator(); iterator.hasNext();) {
			servicio = iterator.next();
			if (servicio.getCodServicio().equals(codServicio)) {
				resultado = servicio;
			}
		}
		if (resultado == null) {
			throw new InexistentServiceException();
		}
		return resultado;
	}

	public HashSet<Servicio> getServicios() {
		return servicios;
	}

}
