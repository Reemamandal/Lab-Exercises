package day9_7th_June;
import java.util.Scanner;
import java.time.Year;
public class VoterEligibility {

	    private int birthYear;
	    private int age;

	    // Constructor to initialize birth year
	    public VoterEligibility(int birthYear) {
	        this.birthYear = birthYear;
	        calculateAge();
	    }

	    // Method to calculate age
	    private void calculateAge() {
	        int currentYear = Year.now().getValue();
	        this.age = currentYear - this.birthYear;
	    }

	    // Method to check if the person is eligible to vote
	    public void checkEligibility() {
	        if (this.age >= 18) {
	            System.out.println("You are " + this.age + " years old. You are eligible to vote.");
	        } else {
	            System.out.println("You are " + this.age + " years old. You are not eligible to vote.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Getting birth year from the user
	        System.out.print("Enter your birth year: ");
	        int birthYear = scanner.nextInt();

	        // Creating an instance of VoterEligibility
	        VoterEligibility voter = new VoterEligibility(birthYear);

	        // Checking voting eligibility
	        voter.checkEligibility();
	    }
	}

