package day16_19th_june;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExample {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the numerator
            System.out.print("Please enter the numerator: ");
            int numerator = scanner.nextInt();

            // Prompt the user to enter the denominator
            System.out.print("Please enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform the division
            int result = numerator / denominator;

            // Print the result
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            // Handle the case where the user input is not an integer
            System.out.println("Error: You did not enter a valid integer.");
            System.out.println("Exception message: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Handle the case where the denominator is zero
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception message: " + e.getMessage());
        } finally {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }

        // Program continues to run
        System.out.println("Program continues to execute normally.");
    }

}
