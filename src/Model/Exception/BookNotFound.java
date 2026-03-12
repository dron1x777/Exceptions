package Model.Exception;

public class BookNotFound extends RuntimeException {
    public BookNotFound(String message) {
        super(message);
    }
}
