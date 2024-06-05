package day8_5th_June;

public class ArithmeticOperations {

	    // Enum to define different operations
	    public enum Operation {
	        ADD, SUBTRACT, MULTIPLY, DIVIDE
	    }

	    // Method to perform arithmetic operations
	    public static double performOperation(double num1, double num2, Operation operation) {
	        switch (operation) {
	            case ADD:
	                return num1 + num2;
	            case SUBTRACT:
	                return num1 - num2;
	            case MULTIPLY:
	                return num1 * num2;
	            case DIVIDE:
	                if (num2 != 0) {
	                    return num1 / num2;
	                } else {
	                    throw new IllegalArgumentException("Division by zero is not allowed.");
	                }
	            default:
	                throw new IllegalArgumentException("Invalid operation.");
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage
	        double number1 = 10.0;
	        double number2 = 5.0;

	        double additionResult = performOperation(number1, number2, Operation.ADD);
	        double subtractionResult = performOperation(number1, number2, Operation.SUBTRACT);
	        double multiplicationResult = performOperation(number1, number2, Operation.MULTIPLY);
	        double divisionResult = performOperation(number1, number2, Operation.DIVIDE);

	        System.out.println("Addition: " + additionResult);
	        System.out.println("Subtraction: " + subtractionResult);
	        System.out.println("Multiplication: " + multiplicationResult);
	        System.out.println("Division: " + divisionResult);
	    }
	}
