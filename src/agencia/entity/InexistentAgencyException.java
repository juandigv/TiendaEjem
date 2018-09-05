package agencia.entity;

public class InexistentAgencyException extends Exception {

	private static final long serialVersionUID = 1L;

	public InexistentAgencyException () {
			super("La Agencia no existe!");
		
		

	}

}
