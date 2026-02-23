public class WeakPasswordException extends RuntimeException {
    public WeakPasswordException(double shortAge) {
        super("Weak Password Exception. Short age: " + shortAge);
    }
}
