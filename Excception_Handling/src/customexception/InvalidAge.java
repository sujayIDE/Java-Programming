package customexception;

public class InvalidAge extends RuntimeException{
    public InvalidAge() {
    }

    public InvalidAge(String message) {
        super(message);
    }
}
