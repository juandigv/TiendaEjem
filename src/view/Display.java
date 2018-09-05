package view;


import java.util.Scanner;
import agencia.control.Agencias;
import agencia.view.AgenciasIO;
import cliente.control.Clientes;
import cliente.view.ClientesIO;
import servicio.control.Servicios;
import servicio.view.ServiciosIO;

public class Display {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Clientes clientes = new Clientes();
		Servicios servicios = new Servicios();
		Agencias agencias = new Agencias();
		
		ClientesIO clientesIO = new ClientesIO(clientes, scanner, servicios,agencias);
		ServiciosIO serviciosIO = new ServiciosIO(servicios, scanner, clientes, agencias);
		AgenciasIO agenciasIO = new AgenciasIO(agencias, scanner);
		
		view.Menu.menu(scanner, clientesIO,serviciosIO,agenciasIO);
		scanner.close();
	}

}
