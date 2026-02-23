public class PasswordValidator {

    public static void validatorPassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("too low1");
        } else if (password.toLowerCase().equals(password)) {
            throw new WeakPasswordException("Нужна заглавная буква");
        } else if (!password.matches(".*\\d.*")) {
            throw new WeakPasswordException("need number");
        } else if (!password.matches(".*[@!#&%].*")) {
            throw new WeakPasswordException("need special symbols");
        }
        System.out.println("password is good!");
    }
}
