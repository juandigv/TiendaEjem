package cliente.entity;

public class InexistentClientException extends Exception {

	private static final long serialVersionUID = 1L;

	public InexistentClientException() {
		super("El Cliente no existe!");

	}

}
