public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Creating a shopping cart instance
        ShoppingCart cart = new ShoppingCart();

        // Setting a payment strategy to use a credit card
        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9876"));
        // Proceeding with payment using the credit card
        cart.checkout(500);

        // Setting a payment strategy to use PayPal
        cart.setPaymentStrategy(new PayPalStrategy("user@example.com"));
        // Proceeding with payment using PayPal
        cart.checkout(700);
    }
}
