package servicio.view;

import java.util.Scanner;
import agencia.control.Agencias;
import agencia.entity.InexistentAgencyException;
import cliente.control.Clientes;
import cliente.entity.InexistentClientException;
import servicio.entity.Servicio;
import view.InputTypes;

public class ServicioIO {
	public static Servicio ingresar(Scanner scanner, Clientes clientes, Agencias agencias)
			throws InexistentClientException, InexistentAgencyException {
		
		int codCliente = InputTypes.readInt("Ingrese el código de Cliente: ", scanner);
		clientes.buscar(codCliente);
		int codAgencia = InputTypes.readInt("Ingrese código de Agencia: ", scanner);
		agencias.buscar(codAgencia);
		String fechaAtencion = InputTypes.readString("Fecha de Atencion (DD/MM/YYYY): ", scanner);
		String tipoServicio = InputTypes.readString("Tipo de Servicio: ", scanner);
		
		return new Servicio(fechaAtencion, codCliente, tipoServicio, codAgencia);
	}
}
