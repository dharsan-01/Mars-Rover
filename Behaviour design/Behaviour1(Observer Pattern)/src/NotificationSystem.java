import java.util.logging.Logger;

public class NotificationSystem {
    // Creating a Logger instance for logging information during runtime
    private static final Logger logger = Logger.getLogger(NotificationSystem.class.getName());

    public static void main(String[] args) {
        // Logging the start of the notification system
        logger.info("Starting Notification System...");

        // Creating a new subject instance (ConcreteSubject) that will be observed by observers
        ConcreteSubject subject = new ConcreteSubject();
        
        // Creating two observer instances (ConcreteObserver) that will listen to the subject
        Observer user1 = new ConcreteObserver("User 1");
        Observer user2 = new ConcreteObserver("User 2");
        
        // Registering the two observers to the subject so they receive updates
        subject.registerObserver(user1);
        subject.registerObserver(user2);

        // Sending a notification to all registered observers
        subject.notifyObservers("First update");
        // Logging the sending of the first update
        logger.info("First update sent.");

        // Removing one observer (User 1) from the subject
        subject.removeObserver(user1);
        
        // Sending a second notification, now only User 2 will receive it
        subject.notifyObservers("Second update");
        // Logging the sending of the second update
        logger.info("Second update sent.");
    }
}
