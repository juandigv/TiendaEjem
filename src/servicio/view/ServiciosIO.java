package servicio.view;

import java.util.Iterator;
import java.util.Scanner;

import agencia.control.Agencias;
import agencia.entity.InexistentAgencyException;
import cliente.control.Clientes;
import cliente.entity.InexistentClientException;
import servicio.control.Servicios;
import servicio.entity.InexistentServiceException;
import servicio.entity.Servicio;
import view.InputTypes;

public class ServiciosIO {

	private Servicios servicios;
	private Scanner scanner;
	private Agencias agencias;
	private Clientes clientes;

	public ServiciosIO(Servicios servicios, Scanner scanner, Clientes clientes, Agencias agencias) {
		this.servicios = servicios;
		this.clientes = clientes;
		this.scanner = scanner;
		this.agencias = agencias;

	}

	public void add() {
		Servicio servicio;
		try {
			servicio = ServicioIO.ingresar(scanner, clientes, agencias);
			servicios.ingresar(servicio);
		} catch (InexistentClientException e) {
			System.out.println(e.getMessage());
		} catch (InexistentAgencyException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void list() {
		for (Iterator<Servicio> i = servicios.getServicios().iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public void delete() throws InexistentServiceException {
		int codAgencia = InputTypes.readInt("Ingrese el código de Agencia: ", scanner);
		int codCliente = InputTypes.readInt("Ingrese el código de Cliente ", scanner);
		int fechaAtencion = InputTypes.readInt("Ingrese la fecha: ", scanner);

		servicios.eliminar(codCliente, codAgencia, fechaAtencion);

	}

}
