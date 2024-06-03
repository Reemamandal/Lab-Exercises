package constructs;
import java.util.Scanner;

public class FibonacciSeries {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of terms for the Fibonacci series: ");
	        int n = scanner.nextInt();
	        
	        // Validate input
	        if (n <= 0) {
	            System.out.println("Please enter a positive number.");
	        } else {
	            System.out.println("Fibonacci series up to " + n + " terms:");
	            generateFibonacci(n);
	        }
	        
	        scanner.close();
	    }

	    public static void generateFibonacci(int n) {
	        int firstTerm = 0, secondTerm = 1;
	        
	        for (int i = 1; i <= n; i++) {
	            System.out.print(firstTerm + " ");
	            
	            // Compute the next term
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	}


}
