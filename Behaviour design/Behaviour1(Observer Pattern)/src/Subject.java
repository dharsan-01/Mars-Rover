import java.util.List;

public interface Subject {
    // Method to register an observer, adding them to the notification list
    void registerObserver(Observer observer);

    // Method to remove an observer from the notification list
    void removeObserver(Observer observer);

    // Method to notify all registered observers with a message
    void notifyObservers(String message);
}
