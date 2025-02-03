// Main.java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Creating a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);
        		UserInput userInput = new UserInput(scanner);
        		Calculator calculator = new Calculator();

		// Infinite loop to repeatedly prompt the user for input
        		while (true) {
			// To get user's choice of operation
            			int choice = userInput.getChoice();
            			if (choice == 10) {
                				System.out.println("Exiting...");
                				break;
            			}
            			userInput.performCalculation(choice, calculator);
        		}
		// Closing the scanner object inorder to prevent resource leaks
        		scanner.close();
    	}
}
