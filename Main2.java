package day15_18th_june;

//Logger interface
interface Logger {
 // Abstract method
 void log(String message);
 
 // Default method
 default void defaultLog() {
     System.out.println("Logging default message");
 }
}

//FileLogger class implementing Logger interface
class FileLogger implements Logger {
 // Implementing log method to write message to a file (placeholder implementation)
 @Override
 public void log(String message) {
     System.out.println("Logging to file: " + message);
     // Actual file logging implementation can be added here
 }
}

//ConsoleLogger class implementing Logger interface
class ConsoleLogger implements Logger {
 // Implementing log method to print message to console
 @Override
 public void log(String message) {
     System.out.println("Logging to console: " + message);
 }
}

public class Main2 {
	// Main class to demonstrate using FileLogger and ConsoleLogger
	    public static void main(String[] args) {
	        // Create instances of FileLogger and ConsoleLogger
	        FileLogger fileLogger = new FileLogger();
	        ConsoleLogger consoleLogger = new ConsoleLogger();
	        
	        // Demonstrate using FileLogger
	        fileLogger.log("Message logged in file");
	        fileLogger.defaultLog();
	        System.out.println(); // Separate output for clarity
	        
	        // Demonstrate using ConsoleLogger
	        consoleLogger.log("Message logged in console");
	        consoleLogger.defaultLog();
	    }
	}
