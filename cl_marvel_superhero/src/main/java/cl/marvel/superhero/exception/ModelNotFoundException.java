package cl.marvel.superhero.exception;

public class ModelNotFoundException extends RuntimeException {

	public ModelNotFoundException(String mensaje) {
		super(mensaje);
	}
}
