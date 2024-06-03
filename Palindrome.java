package constructs;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.nextLine();
		
		if (isPalindrome(input)) {
			System.out.println("The string is a palindrome.");
		}
		else {
			System.out.println("The string is not a palindrome.");
		}

	}
	public static boolean isPalindrome(String str) {
		String cleanedString = str.replaceAll("\\s+", "").toLowerCase();
		int length = cleanedString.length();
		for(int i=0; i<length / 2; i++) {
			if (cleanedString.charAt(i) != cleanedString.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
