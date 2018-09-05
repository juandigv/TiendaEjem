package cliente.view;

import java.util.Scanner;

import cliente.control.Clientes;
import cliente.entity.Cliente;
import cliente.entity.InexistentClientException;
import view.InputTypes;

public class ClienteIO {

	public static Cliente ingresar(Scanner scanner, Clientes clientes) {
		int codCliente;
		while(true) {
			codCliente = InputTypes.readInt("Ingrese el código de Cliente: ", scanner);
			try {
				clientes.buscar(codCliente);
				System.out.println("Código ya existe, ingrese otro.");
			} catch (InexistentClientException e) {
			break;
			}
		}
		
		String nombre = InputTypes.readString("Nombres: ", scanner);
		String apellido = InputTypes.readString("Apellidos: ", scanner);
		String direccion = InputTypes.readString("Direccion: ", scanner);
		int telefono = InputTypes.readInt("Telefono: ", scanner);
		return new Cliente(codCliente, nombre, apellido, direccion, telefono);
	}

}
