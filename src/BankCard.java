import javax.naming.InsufficientResourcesException;

public class BankCard {
    private String ownerName;
    private double balance = 5000;

    public  BankCard(String ownerName) {
        this.ownerName = ownerName;
    }

    String withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Amount must be less than or equal to balance.");
        }
        balance = balance - amount;
        return "now your balance is: " + balance;
    }
    double getBalance() {
        return balance;
    }
}
