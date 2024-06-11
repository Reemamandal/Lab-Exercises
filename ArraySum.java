package day11_11th_june;
import java.util.Scanner;
public class ArraySum {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Reading the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	        // Initializing the array
	        int[] array = new int[size];

	        // Reading the elements of the array
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = sc.nextInt();
	        }

	        // Calculating the sum of the array elements
	        int sum = 0;
	        for (int i = 0; i < size; i++) {
	            sum += array[i];
	        }

	        // Displaying the sum of the array elements
	        System.out.println("The sum of all elements in the array is: " + sum);

	    
	    }
	}
