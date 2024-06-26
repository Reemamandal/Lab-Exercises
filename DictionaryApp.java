package day21_26th_june;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryApp {
	public static void main(String[] args) {
        // i) TreeMap named dictionary to store word-definition pairs.
        TreeMap<String, String> dictionary = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nDictionary Application:");
            System.out.println("1. Add a word and its definition");
            System.out.println("2. Retrieve and display the definition of a specific word");
            System.out.println("3. Display all word-definition pairs in alphabetical order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    // ii) Input word-definition pairs and add them to the dictionary.
                    System.out.print("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word and definition added successfully.");
                    break;

                case 2:
                    // iii) Retrieve and display the definition of a specific word.
                    System.out.print("Enter word to retrieve definition: ");
                    word = scanner.nextLine();
                    definition = dictionary.get(word);
                    if (definition != null) {
                        System.out.println("Definition of " + word + ": " + definition);
                    } else {
                        System.out.println("Word not found in the dictionary.");
                    }
                    break;

                case 3:
                    // iv) Iterate through the dictionary to display all word-definition pairs in alphabetical order.
                    System.out.println("\nAll word-definition pairs in alphabetical order:");
                    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

}
