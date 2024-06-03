package constructs;
import java.util.Scanner;
public class PrimeChecker {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number to check if it is a prime: ");
	        int number = scanner.nextInt();
	        
	        // Check if the number is prime
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	        
	        scanner.close();
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int n) {
	        // Corner cases
	        if (n <= 1) {
	            return false;
	        }
	        if (n <= 3) {
	            return true;
	        }
	        
	        // This is checked so that we can skip middle five numbers in the below loop
	        if (n % 2 == 0 || n % 3 == 0) {
	            return false;
	        }
	        
	        for (int i = 5; i * i <= n; i += 6) {
	            if (n % i == 0 || n % i + 2 == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	}
