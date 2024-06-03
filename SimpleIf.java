package constructs;

import java.util.*;

public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		String isGraduated;
		System.out.println("Are you a Graduate? Yes/No");
		isGraduated=sc.next();
		if(isGraduated.equals("yes")) {
			System.out.println("You are Eligible");
		}
	}

}
