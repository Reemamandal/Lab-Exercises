package day20_25th_june;
import java.util.HashSet;
public class HashSetExample {
	public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();

        // Add the numbers 5, 10, 15, 20, and 25 to the set
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Display the elements of the set
        System.out.println("Elements of the set: " + numbers);

        // Check if the set contains the number 10
        boolean contains10 = numbers.contains(10);
        System.out.println("Does the set contain the number 10? " + contains10);

        // Remove the number 15 from the set
        boolean removed = numbers.remove(15);
        System.out.println("Was the number 15 removed? " + removed);

        // Display the size of the set
        int size = numbers.size();
        System.out.println("Size of the set: " + size);
    }

}
