package PRORGAMMMING_ZERO_ONE;

import java.util.Scanner;

public class EligibilityCheck {
	public static void main(String[] args) {
	Scanner num  = new Scanner(System.in);
	
	System.out.print("Enter your grade: "); // Ask the user for their grade and store it
	int grade = num.nextInt();
	System.out.print("Your Absences: "); // Ask the user for the number of absences and store it
	int absences = num.nextInt();
	
	// Check if the student passed (grade is 75 or higher)
	boolean passed = grade >= 75; 
	
	/*Check if the student qualifies for honors
  (grade is 90 or higher AND absences are 20 or fewer) */
	boolean honor = (grade >= 90) && (absences <= 20);
	
	String status = passed ? "Passed" : "Failed"; // Use a ternary operator to set the status string based on whether they passed
 	
	// Display the results
	System.out.println(status);
	System.out.println("Honors: " + honor);
	
	num.close(); // Close the Scanner
	}
}