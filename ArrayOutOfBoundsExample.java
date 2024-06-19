package day16_19th_june;

public class ArrayOutOfBoundsExample {
	
	public static void main(String[] args) {
        // Initialize an array with 5 elements
        int[] array = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an element at index 10, which is out of bounds
        	
            int outOfBoundsElement = array[10];
            System.out.println("Element at index 10: " + outOfBoundsElement);
            
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            // Handle the exception by printing an error message
            System.out.println("Error: Attempted to access an index that is out of bounds.");
            System.out.println("Exception message: " + e.getMessage());
        }

        // Program continues to run
        System.out.println("Program continues to execute normally.");
    }

}
