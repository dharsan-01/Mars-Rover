import java.util.logging.Logger;

public class LoggerSingleton {
    // Static variable to hold the single instance of the class
    private static LoggerSingleton instance;

    // Logger instance used to log messages
    private Logger logger = Logger.getLogger(LoggerSingleton.class.getName());

    // Private constructor prevents instantiation from outside the class
    private LoggerSingleton() {
        logger.info("Logger Singleton Instance Created");
    }

    // Method to get the single instance of the class
    public static LoggerSingleton getInstance() {
        // Check if an instance already exists; if not, create one
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        logger.info(message);
    }
}
