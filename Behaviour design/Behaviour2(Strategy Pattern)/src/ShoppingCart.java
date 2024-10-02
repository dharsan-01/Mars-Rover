// Importing the Logger class for logging messages
import java.util.logging.Logger;

public class ShoppingCart {
    // A variable to hold the currently selected payment strategy
    private PaymentStrategy paymentStrategy;
    // Logger instance for logging events
    private static final Logger logger = Logger.getLogger(ShoppingCart.class.getName());

    // Method to set the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    // Method to checkout and pay using the selected payment strategy
    public void checkout(int amount) {
        // Logging the payment process start
        logger.info("Processing payment...");
        // Calling the pay method on the selected strategy to perform the payment
        paymentStrategy.pay(amount);
        // Logging that the payment process is completed
        logger.info("Payment processed.");
    }
}
