package day16_19th_june;
import java.util.Scanner;

public class DivisionCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter the numerator
            System.out.print("Enter the numerator: ");
            double numerator = scanner.nextDouble();

            // Prompt user to enter the denominator
            System.out.print("Enter the denominator: ");
            double denominator = scanner.nextDouble();

            // Perform the division
            double result = divide(numerator, denominator);

            // Display the result
            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
	}
	
	public static double divide(double numerator, double denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        return numerator / denominator;
    }
}
