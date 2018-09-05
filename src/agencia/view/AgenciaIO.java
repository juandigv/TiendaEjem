package agencia.view;

import java.util.Scanner;

import agencia.control.Agencias;
import agencia.entity.Agencia;
import agencia.entity.InexistentAgencyException;
import view.InputTypes;

public class AgenciaIO {

	public static Agencia ingresar(Scanner scanner, Agencias agencias) {
		int codAgencia = 0;

		while (true) {
			
			try {
				codAgencia = InputTypes.readInt("Ingrese el código de la Agencia: ", scanner);
				agencias.buscar(codAgencia);
				System.out.println("Código ya existe, ingrese otro.");
				
			} catch (InexistentAgencyException e) {
				break;
			}
		}

		String nombre = InputTypes.readString("Nombre: ", scanner);
		String direccion = InputTypes.readString("Direccion: ", scanner);
		int telefono = InputTypes.readInt("Telefono: ", scanner);
		return new Agencia(codAgencia, nombre, direccion, telefono);
	}

}
