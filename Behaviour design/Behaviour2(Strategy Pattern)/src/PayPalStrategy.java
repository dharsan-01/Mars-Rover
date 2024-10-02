// Concrete implementation of the PaymentStrategy interface for PayPal payments
public class PayPalStrategy implements PaymentStrategy {
    // Variable to store the PayPal email
    private String email;

    // Constructor to initialize the strategy with an email
    public PayPalStrategy(String email) {
        this.email = email;
    }

    // Method to pay using PayPal
    @Override
    public void pay(int amount) {
        // Printing out the payment details
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}
