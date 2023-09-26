package comCerucciDemo.services.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resource " + id + "not found. Check The id and try again.");
	}
}
