package day21_26th_june;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
	public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, String> map = new HashMap<>();
        
        // Adding some elements to the HashMap
        map.put("USA", "Washington D.C.");
        map.put("India", "New Delhi");
        map.put("Germany", "Berlin");
        map.put("France", "Paris");
        
        // Display the initial content of the HashMap
        System.out.println("Initial HashMap content:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Specify the key and value to be added
        String key = "Japan";
        String value = "Tokyo";
        
        // Associate the specified value with the specified key in the HashMap
        map.put(key, value);
        
        // Display the updated content of the HashMap
        System.out.println("\nUpdated HashMap content:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
