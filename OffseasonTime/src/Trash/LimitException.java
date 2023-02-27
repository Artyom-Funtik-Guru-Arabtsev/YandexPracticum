package Trash;

public class LimitException extends RuntimeException {
    int attempts;
    public LimitException() {
        super();
    }

    public LimitException(String message, int attempts) {
        super(message);
        this.attempts = attempts;
    }
}
