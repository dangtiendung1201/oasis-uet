import java.lang.Exception;

public class BankException extends Exception {
    /**
     * Default constructor.
     */
    public BankException() {
        super();
    }

    /**
     * Set exception message.
     */
    public BankException(String message) {
        super(message);
    }
}