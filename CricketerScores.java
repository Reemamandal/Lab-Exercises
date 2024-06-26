package day21_26th_june;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CricketerScores {
	public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCricketer Scores Application:");
            System.out.println("1. Add a cricketer and his score");
            System.out.println("2. Search for a cricketer and display his score");
            System.out.println("3. Display all cricketers and their scores");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    // Add a cricketer and his score
                    System.out.print("Enter cricketer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter score: ");
                    int score = scanner.nextInt();
                    cricketerScores.put(name, score);
                    System.out.println("Cricketer and score added successfully.");
                    break;

                case 2:
                    // Search for a cricketer and display his score
                    System.out.print("Enter cricketer name to search: ");
                    name = scanner.nextLine();
                    if (cricketerScores.containsKey(name)) {
                        System.out.println("Score of " + name + ": " + cricketerScores.get(name));
                    } else {
                        System.out.println("Cricketer not found.");
                    }
                    break;

                case 3:
                    // Display all cricketers and their scores
                    System.out.println("\nAll cricketers and their scores:");
                    for (Map.Entry<String, Integer> entry : cricketerScores.entrySet()) {
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
