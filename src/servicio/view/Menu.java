package servicio.view;

import java.util.Scanner;

import servicio.entity.InexistentServiceException;
import view.InputTypes;

public class Menu {

	public static int getOpcion(Scanner scanner) {
		while (true) {
			System.out.println("\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n	    SERVICIOS \n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
			System.out.println(
					"\n 1. Añadir Servicio \n 2. Listar Servicios \n 3. Eliminar Servicio \n 0. Salir\n\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n");
			int opcion = InputTypes.readInt("Que desea hacer?: ", scanner);
			System.out.println("\n --------------------------");
			return opcion;
		}
	}

	public static void menu(Scanner scanner, ServiciosIO serviciosIO) {
		boolean salir = true;
		while (salir) {
			switch (getOpcion(scanner)) {
			case 1:
				serviciosIO.add();
				break;
			case 2:
				serviciosIO.list();
				break;
			case 3:
				try {
					serviciosIO.delete();
				} catch (InexistentServiceException e) {
					System.out.println("\n >>" + e.getMessage());
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
