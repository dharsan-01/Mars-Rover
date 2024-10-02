public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Fetching the single instance of LoggerSingleton
        LoggerSingleton logger1 = LoggerSingleton.getInstance();
        // Logging a message using the instance
        logger1.log("First log message");

        // Fetching the same instance of LoggerSingleton
        LoggerSingleton logger2 = LoggerSingleton.getInstance();
        // Logging another message to demonstrate the same instance is reused
        logger2.log("Second log message");

        // Verifying that both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance");
        }
    }
}
