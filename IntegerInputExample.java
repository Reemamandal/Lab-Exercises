package day16_19th_june;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputExample {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        
        try {
            // Attempt to read an integer from the user
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            // Handle the exception by printing an error message
            System.out.println("Error: You did not enter a valid integer.");
            System.out.println("Exception message: " + e.getMessage());
        } finally {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
        
        // Program continues to run
        System.out.println("Program continues to execute normally.");
    }

}
