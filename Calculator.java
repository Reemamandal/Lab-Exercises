package operators;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		double num1= sc.nextDouble();
		
		System.out.println("Enter the second number:");
		double num2= sc.nextDouble();
		
		System.out.println("Enter an operation (+, -, *, /, %):");
		char operation = sc.next().charAt(0);
		
		double result = 0;
		boolean validOperation = true;
		
		switch (operation) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if(num2 !=0) {
			result = num1 / num2;
			}
			else {
				System.out.println("Error: Division by zero is not allowed,");
				validOperation = false;
			}
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("Error: Invalid operation.");
			validOperation = false;
			break;
		}
		
		if(validOperation) {
			System.out.println("The result of the operation is :" + result);
		}

	}

}
