package day11_11th_june;
import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicates {

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
	        
	        Arrays.sort(array);

	        // Removing duplicates
	        int[] result = removeDuplicates(array, size);

	        // Displaying the array without duplicates
	        System.out.println("Array without duplicates:");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + " ");
	        }

	    }

	    public static int[] removeDuplicates(int[] array, int size) {
	        if (size == 0 || size == 1) {
	            return array;
	        }

	        int[] temp = new int[size];
	        int j = 0;

	        // Iterate over the array and add unique elements to temp
	        for (int i = 0; i < size - 1; i++) {
	            if (array[i] != array[i + 1]) {
	                temp[j++] = array[i];
	            }
	        }
	        temp[j++] = array[size - 1]; // Add the last element

	        // Create the result array with the correct size
	        int[] result = new int[j];
	        for (int i = 0; i < j; i++) {
	            result[i] = temp[i];
	        }

	        return result;
	    }
	}


