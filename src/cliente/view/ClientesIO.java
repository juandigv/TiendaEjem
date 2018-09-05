package cliente.view;

import java.util.Iterator;
import java.util.Scanner;

import agencia.control.Agencias;
import agencia.entity.Agencia;
import cliente.control.Clientes;
import cliente.entity.Cliente;
import cliente.entity.InexistentClientException;
import servicio.control.Servicios;
import servicio.entity.Servicio;
import view.InputTypes;

public class ClientesIO {
	private Servicios servicios;
	private Scanner scanner;
	private Agencias agencias;
	private Clientes clientes;

	public ClientesIO(Clientes clientes, Scanner scanner, Servicios servicios, Agencias agencias) {
		this.servicios = servicios;
		this.clientes = clientes;
		this.scanner = scanner;
		this.agencias = agencias;

	}

	public void add() {
		Cliente cliente;
		cliente = ClienteIO.ingresar(scanner, clientes);
		clientes.ingresar(cliente);
	}

	public void list() {
		for (Iterator<Cliente> i = clientes.getClientes().iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public void showService() throws InexistentClientException {
		int codCliente = InputTypes.readInt("Ingrese el código del cliente a mostrar: ", scanner);
		Servicio servicio = null;
		Agencia agencia = null;

		for (Iterator<Servicio> i = servicios.getServicios().iterator(); i.hasNext();) {
			servicio = i.next();
			if ((servicio.getCodCliente()) == codCliente) {
				for (Iterator<Agencia> a = agencias.getAgencias().iterator(); a.hasNext();) {
					agencia = a.next();
					if ((agencia.getCodAgencia()) == servicio.getCodAgencia()) {
						System.out.println("\n \t" + agencia);
					}
				}
				System.out.println("\t" + servicio);
				System.out.println("Solicitado por: "+clientes.buscar(codCliente));
			}

		}
		
	}

	public void delete() throws InexistentClientException {
		int codCliente = InputTypes.readInt("Ingrese el código de Cliente a eliminar: ", scanner);
		clientes.eliminar(codCliente);

	}

}
