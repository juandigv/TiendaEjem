package cliente.control;

import java.util.HashSet;
import java.util.Iterator;

import cliente.entity.Cliente;
import cliente.entity.InexistentClientException;

public class Clientes {
	private HashSet<Cliente> clientes;

	public Clientes() {
		clientes = new HashSet<Cliente>();
	}

	public void ingresar(Cliente cliente) throws java.lang.ArrayIndexOutOfBoundsException {
		try {
			buscar(cliente.getCodCliente());
			System.out.println(">>Código ya existe, Cliente ingresada no fue añadida");
		} catch (InexistentClientException e) {
			clientes.add(cliente);
			System.out.println(">>Cliente añadido exitosamente!");
		}

	}

	public void eliminar(int codCliente) throws InexistentClientException {
		clientes.remove(buscar(codCliente));
	}

	public Cliente buscar(int codCliente) throws InexistentClientException  {
		Cliente resultado = null;
		Cliente cliente;
		for (Iterator<Cliente> iterator = clientes.iterator(); iterator.hasNext();) {
			cliente = iterator.next();
			if (cliente.getCodCliente().equals(codCliente)) {
				resultado = cliente;
			}
		}
		if (resultado == null) {
			throw new InexistentClientException();
		}
		return resultado;
	}

	public HashSet<Cliente> getClientes() {
		return clientes;
	}

}
