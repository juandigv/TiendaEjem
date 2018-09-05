package agencia.view;

import java.util.Scanner;

import agencia.entity.InexistentAgencyException;
import view.InputTypes;

public class Menu {

	public static int getOpcion(Scanner scanner) {
		while (true) {
			System.out.println("\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n	    AGENCIA \n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
			System.out.println(
					"\n 1. Añadir Agencia \n 2. Listar Agencias \n 3. Eliminar Categoria \n 0. Salir\n\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n");
			int opcion = InputTypes.readInt("Que desea hacer?: ", scanner);
			System.out.println("\n --------------------------");
			return opcion;
		}
	}

	public static void menu(Scanner scanner, AgenciasIO agenciasIO) {
		boolean salir = true;
		while (salir) {
			switch (getOpcion(scanner)) {
			case 1:
				agenciasIO.add();
				break;
			case 2:
				agenciasIO.list();
				break;
			case 3:
				try {
					agenciasIO.delete();
				} catch (InexistentAgencyException e) {
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
