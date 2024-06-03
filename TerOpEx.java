package operators;

import java.util.*;
public class TerOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		age= sc.nextInt();
		String res=(age>18)?"Eligible for vote": "Not Eligible for vote";
		System.out.println(res);

	}

}
