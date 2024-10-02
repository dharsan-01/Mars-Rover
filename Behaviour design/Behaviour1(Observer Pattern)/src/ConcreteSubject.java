import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    // A list to store all registered observers
    private List<Observer> observers;

    // Constructor initializes the observers list
    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    // Method to add a new observer to the list
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer from the list
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Method to send a message to all registered observers by calling their update method
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
