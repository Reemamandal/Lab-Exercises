package day21_26th_june;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordCounter {
	public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Create a HashMap to store word occurrences
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Iterate through the words and count occurrences
        for (String word : words) {
            word = word.toLowerCase(); // Convert word to lowercase to make counting case-insensitive
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Display the word occurrences
        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Close the scanner
        scanner.close();
    }

}
