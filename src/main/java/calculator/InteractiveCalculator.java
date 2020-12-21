package calculator;

import java.util.Scanner;

import calculator.operations.AddOperation;

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
		
		int result = 0;
		if (operation.equals("add")) {
			AddOperation add = new AddOperation();
			add.setA(numberA);
			add.setB(numberB);
			result = add.getResult();
		} else if (operation.equals("substract")) {
			
		} else if (operation.equals("multiply")) {
		
		} else if (operation.equals("divide")) {
			
		} else {
			System.out.println("Did not understand oparation");
		}

		System.out.println("The result is");
		System.out.println(result);
		
	}
	
}
