package servicio.entity;

public class InexistentServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public InexistentServiceException() {
		super("El Servicio no existe!");

	}

}
