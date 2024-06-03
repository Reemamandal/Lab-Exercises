package constructs;
import java.util.Scanner;

public class Factorial {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number to calculate its factorial: ");
	        int number = scanner.nextInt();
	        
	        // Validate input
	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            System.out.println("Factorial of " + number + " using iterative approach: " + factorialIterative(number));
	            System.out.println("Factorial of " + number + " using recursive approach: " + factorialRecursive(number));
	        }
	        
	        scanner.close();
	    }

	    // Iterative approach to calculate factorial
	    public static long factorialIterative(int n) {
	        long result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	    // Recursive approach to calculate factorial
	    public static long factorialRecursive(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorialRecursive(n - 1);
	        }
	    }
	}
