public class Order {
    private String productName;
    private int quantity;
    private double price;

    public Order(String productName, int quantity, double price) throws InvalidPriceException, InvalidQuantityException {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void placeOrder() throws InvalidPriceException {
        if (this.quantity <= 0){
            throw new InvalidQuantityException("Количество должно быть больше нуля!");
        } else if (price <= 0){
            throw new InvalidPriceException("Цена должна быть больше нуля!");
        } else {
            System.out.println("Заказ принят: " + productName + " + " + quantity +" = "+price+" сом");
        }
    }
}
