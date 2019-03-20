package test.esurovskiy;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Age must be in 1..120");
    }

    public InvalidAgeException(final String message) {
        super(message);
    }
}
