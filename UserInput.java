// UserInput.java
import java.util.Scanner;

public class UserInput {
	// Private Scanner instance to read user input
    	private Scanner scanner;

    	public UserInput(Scanner scanner) {
        		this.scanner = scanner;
    	}

    	// Method to display the menu and get the user's choice
    	public int getChoice() {
        		System.out.println("Select an operation:");
        		System.out.println("1: Add\n2: Subtract\n3: Multiply\n4:Divide\n5: Fibonacci\n6: Sum of Array");
        		System.out.println("7: Mean\n8: Variance\n9: Standard Deviation\n10: Exit");
        		return scanner.nextInt(); // Reading the user's choice
    	}

    	// Method to perform calculations based on the user's choice
    	public void performCalculation(int choice, Calculator calculator) {
        		switch (choice) {
            			case 1:
                				// Addition
                				System.out.println("Enter two numbers:");
                				System.out.println("Result: " + calculator.add(scanner.nextDouble(), scanner.nextDouble()));
                				break;

            			case 2:
                				// Subtraction
                				System.out.println("Enter two numbers:");
                				System.out.println("Result: " + calculator.subtract(scanner.nextDouble(), scanner.nextDouble()));
                				break;

            			case 3:
                				// Multiplication
                				System.out.println("Enter two numbers:");
                				System.out.println("Result: " + calculator.multiply(scanner.nextDouble(), scanner.nextDouble()));
                				break;

            			case 4:
                				// Division
                				System.out.println("Enter two numbers:");
                				System.out.println("Result: " + calculator.divide(scanner.nextDouble(), scanner.nextDouble()));
                				break;

            			case 5:
                				// Fibonacci sequence
                				System.out.println("Enter n for Fibonacci:");
                				System.out.println("Result: " + calculator.fibonacci(scanner.nextInt()));
                				break;

            			case 6:
                				// Sum of an array
                				double[] arr = getArrayInput();
                				System.out.println("Sum: " + calculator.sum(arr));
                				break;

            			case 7:
                				// Mean of an array
                				arr = getArrayInput();
                				System.out.println("Mean: " + calculator.mean(arr));
                				break;

            			case 8:
                				// Variance of an array
                				arr = getArrayInput();
                				System.out.println("Variance: " + calculator.variance(arr));
                				break;

            			case 9:
                				// Standard deviation of an array
                				arr = getArrayInput();
                				System.out.println("Standard Deviation: " + calculator.standardDeviation(arr));
                				break;

            			default:
                				System.out.println("Invalid choice.");
        		}
    	}

    	// Method to get an array input from the user
    	private double[] getArrayInput() {
        		System.out.println("Enter array size:");
        		int size = scanner.nextInt(); 
        		double[] arr = new double[size]; 
        		System.out.println("Enter " + size + " elements:");
        		for (int i = 0; i < size; i++) {
            			arr[i] = scanner.nextDouble(); // Reading array elements
        		}
        		return arr; 
    	}
}
