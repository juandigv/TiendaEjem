package agencia.view;

import java.util.Iterator;
import java.util.Scanner;
import agencia.control.Agencias;
import agencia.entity.Agencia;
import agencia.entity.InexistentAgencyException;
import view.InputTypes;

public class AgenciasIO {

	private Scanner scanner;
	private Agencias agencias;

	public AgenciasIO(Agencias agencias, Scanner scanner) {
		this.scanner = scanner;
		this.agencias = agencias;

	}
	
	public void add() {
		Agencia agencia;
		agencia = AgenciaIO.ingresar(scanner, agencias);
		agencias.ingresar(agencia);
	}

	public void list() {
		for (Iterator<Agencia> i = agencias.getAgencias().iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public void delete() throws InexistentAgencyException {
		int codAgencia = InputTypes.readInt("Ingrese el código de Agencia a eliminar: ", scanner);
		agencias.eliminar(codAgencia);

	}

}
