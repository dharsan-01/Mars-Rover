// Concrete implementation of the PaymentStrategy interface for credit card payments
public class CreditCardStrategy implements PaymentStrategy {
    // Variable to store the card number.
    private String cardNumber;

    // Constructor to initialize the strategy with a card number
    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Method to pay using the credit card
    @Override
    public void pay(int amount) {
        // Printing out the payment details
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
