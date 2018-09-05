package agencia.control;

import java.util.HashSet;
import java.util.Iterator;
import agencia.entity.Agencia;
import agencia.entity.InexistentAgencyException;

public class Agencias {

	private HashSet<Agencia> agencias;

	public Agencias() {
		agencias = new HashSet<Agencia>();
	}

	public void ingresar(Agencia agencia) throws java.lang.ArrayIndexOutOfBoundsException {
		try {
			buscar(agencia.getCodAgencia());
			System.out.println(">>Código ya existe, Agencia ingresada no fue añadida");
		} catch (InexistentAgencyException e) {
			agencias.add(agencia);
			System.out.println(">>Agencia añadida exitosamente!");
		}

	}

	public void eliminar(int codAgencia) throws InexistentAgencyException {
		agencias.remove(buscar(codAgencia));
	}

	public Agencia buscar(int codAgencia) throws InexistentAgencyException {
		Agencia resultado = null;
		Agencia agencia;
		for (Iterator<Agencia> iterator = agencias.iterator(); iterator.hasNext();) {
			agencia = iterator.next();
			if (agencia.getCodAgencia().equals(codAgencia)) {
				resultado = agencia;
			}
		}
		if (resultado == null) {
			throw new InexistentAgencyException();
		}
		return resultado;
	}

	public HashSet<Agencia> getAgencias() {
		return agencias;
	}

}
