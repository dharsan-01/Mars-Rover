// Concrete implementation of the Observer interface
public class ConcreteObserver implements Observer {
    // Each observer will have a name to identify it
    private String name;

    // Constructor to initialize the observer with a name
    public ConcreteObserver(String name) {
        this.name = name;
    }

    // Method to update the observer with the message received from the subject
    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}
