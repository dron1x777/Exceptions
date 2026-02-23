import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("enter the password: ");
            String password = sc.nextLine();
            try {
                PasswordValidator.validatorPassword(password);
                break;
            } catch (WeakPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}