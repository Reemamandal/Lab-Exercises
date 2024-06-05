package day8_5th_June;

public class LargestOfThree {

	    public static int largest(int num1, int num2, int num3) {
	        int max = num1;  // Assume num1 is the largest

	        if (num2 > max) {
	            max = num2;  // Update max if num2 is larger
	        }

	        if (num3 > max) {
	            max = num3;  // Update max if num3 is larger
	        }

	        return max;  // Return the largest number
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int number1 = 10;
	        int number2 = 25;
	        int number3 = 15;

	        int largestNumber = largest(number1, number2, number3);
	        System.out.println("The largest number is: " + largestNumber);
	    }
	}
