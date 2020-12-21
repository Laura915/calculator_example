package calculator;

import java.util.Scanner;

public class InteractiveCalculator {

	/**
	 * - two numbers as inputs
		- take the operator 
			add / substract / divide / multiply
		
		- print the result to console
	 * @param args
	 */
	
	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number A please:");
		int numberA = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Give me a number B please:");
		int numberB = scanner.nextInt();
		System.out.println("Give me a operation please:");
		scanner.nextLine();
		String operation = scanner.nextLine();
		
		// have inputs 
		
	}
	
}
