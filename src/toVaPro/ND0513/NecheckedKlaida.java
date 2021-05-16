package toVaPro.ND0513;

/**
 *
 * @author tomas
 */
public class NecheckedKlaida extends RuntimeException {

    public NecheckedKlaida() {
    }

    public NecheckedKlaida(String message) {
        super(message);
    }

    public NecheckedKlaida(String message, Throwable cause) {
        super(message, cause);
    }

    public NecheckedKlaida(Throwable cause) {
        super(cause);
    }

}
