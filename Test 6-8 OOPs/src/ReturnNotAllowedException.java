public class ReturnNotAllowedException extends RuntimeException {
    public ReturnNotAllowedException() {
    }

    public ReturnNotAllowedException(String message) {
        super(message);
    }
}
