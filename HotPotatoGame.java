package day20_25th_june;
import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame {
	public static void main(String[] args) {
        // Create a queue to represent the circle of players
        Queue<String> players = new LinkedList<>();
        
        // Enqueue player names
        players.add("Reema");
        players.add("Shruti");
        players.add("Gaurav");
        players.add("Rohit");
        players.add("Satyajeet");

        // Random number generator to simulate music stopping
        int rounds = 0;
        while (players.size() > 1) {
            // Simulate passing the potato
            int passes = (int) (Math.random() * players.size()) + 1;
            System.out.println("Passes this round: " + passes);
            for (int i = 0; i < passes; i++) {
                String player = players.remove();
                players.add(player);
            }
            
            // Eliminate the player holding the potato when music stops
            String eliminatedPlayer = players.remove();
            System.out.println("Player eliminated: " + eliminatedPlayer);
            
            rounds++;
        }
        
        // The last remaining player is the winner
        String winner = players.peek();
        System.out.println("Winner after " + rounds + " rounds: " + winner);
    }

}
