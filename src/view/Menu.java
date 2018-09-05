package view;

import java.util.Scanner;

import agencia.view.AgenciasIO;
import cliente.view.ClientesIO;
import servicio.view.ServiciosIO;


public class Menu {
	public static int getOpcion(Scanner scanner) {
		while (true) {
			System.out.println("\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n	    MENU  \n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
			System.out.println(
					"\n 1. Clientes \n 2. Agencias  \n 3. Servicios \n 0. Salir\n\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n");
			int opcion = InputTypes.readInt("Que desea hacer?: ", scanner);
			System.out.println("\n --------------------------");
			return opcion;
		}
	}

	
	public static void menu(Scanner scanner, ClientesIO clientesIO, ServiciosIO serviciosIO, AgenciasIO agenciasIO) {
		boolean salir = true;
		while (salir) {

			switch (getOpcion(scanner)) {
			case 1:
				cliente.view.Menu.menu(scanner, clientesIO);
				break;
			case 2:
				agencia.view.Menu.menu(scanner, agenciasIO);
				break;
			case 3:
				servicio.view.Menu.menu(scanner, serviciosIO);
				break;
			case 0:
				System.out.println("Cerrando Sistema ...    ");
				salir = false;
				break;
			default:
				System.out.println("Opción inválida, Intente de nuevo");
			}
		}
	}
}
