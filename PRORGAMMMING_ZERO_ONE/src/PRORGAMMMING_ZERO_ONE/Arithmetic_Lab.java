package PRORGAMMMING_ZERO_ONE;

import java.util.Scanner;

public class Arithmetic_Lab {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter first number: "); // Ask the user for the first number and store it
		int a = num.nextInt();
		System.out.print("Enter second number: "); // Ask the user for the second number and store it
		int b = num.nextInt();
		System.out.println(); // Print a blank line for better readability
		
		int sum = a + b; // Addition
		int diff = a - b; // Subtraction
		int prod = a * b; // Multiplication
		int quon = a / b; // Division
		int rem = a % b; // Remainder (modulus)
		a += b; // Add the value of b to a (a = a + b)
		
		// Display the results of the operations
		System.out.println("Sum: " + sum); 
		System.out.println("Diff: " + diff);
		System.out.println("Product: " + prod);
		System.out.println("Quotient: " + quon);
		System.out.println("Remainder: " + rem);
		System.out.println("Compound Assignment Operator: " + a); // Prints the new value of a after a += b
		
		num.close(); // Close the Scanner
	}
}