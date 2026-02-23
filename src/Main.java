import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order("broo", 6, 3884);
        try {
            order.placeOrder();
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
    }
}