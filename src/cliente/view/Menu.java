package cliente.view;

import java.util.Scanner;

import cliente.entity.InexistentClientException;
import view.InputTypes;

public class Menu {

	public static int getOpcion(Scanner scanner) {
		while (true) {
			System.out.println("\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n	    CLIENTE \n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
			System.out.println(
					"\n 1. Añadir Cliente \n 2. Listar Clientes \n 3. Listar Servicios de un Cliente \n 4. Eliminar Cliente \n 0. Salir\n\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n");
			int opcion = InputTypes.readInt("Que desea hacer?: ", scanner);
			System.out.println("\n --------------------------");
			return opcion;
		}
	}

	public static void menu(Scanner scanner, ClientesIO clientesIO) {
		boolean salir = true;
		while (salir) {
			switch (getOpcion(scanner)) {
			case 1:
				clientesIO.add();
				break;
			case 2:
				clientesIO.list();
				break;
			case 3:

				try {
					clientesIO.showService();
				} catch (InexistentClientException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 4:

				try {
					clientesIO.delete();
				} catch (InexistentClientException e) {
					System.out.println(e.getMessage());
				}

				break;

			case 0:
				salir = false;
				break;
			default:
				System.out.println("Opción inválida, Intente de nuevo");
			}
		}
	}

}
