package PRORGAMMMING_ZERO_ONE;

// Chaniel_S._Espejon_26050093_VariantB
/* My program takes the user's choice of store and the quantity they have 
   selected, I use a switch statement to get the item details, computes the  
   subtotal, and gives a 10% discount whenever the quantity is ten or more or    
   when a student spends 300 PHP or higher. It then formats and displays an    
   itemized receipt showing the calculated subtotal, whether or not a discount   
   has been applied, and the total amount due.                                        */ 
										
import java.util.Scanner; // Call for Scanner

public class Tindahan_ni_Juan_System {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Input A Scanner for Asking the user or user Define
		
		String equal = "=";
		String Hline = "-";
		
		// For the Header
		System.out.println("=======================================================");
		System.out.println("\t\tTINDAHAN NI JUAN SYSTEM");
		System.out.println(" Developer: Chaniel S. Espejon | ID: 26050093");
		System.out.println("=======================================================");
		
		// For the Menu
		System.out.println("MENU OPTION: ");
		System.out.println(" [1] College Notebook\t\t - PHP 45.00");
		System.out.println(" [2] Gel Pen Box\t\t - PHP 120.00");
		System.out.println(" [3] Scientific Calculator\t - PHP 850.00");
		System.out.println(Hline.repeat(55));
		
		// For the Inputs
		System.out.print("Enter item choice (1-3): ");
		int Choice = input.nextInt();
		
		System.out.print("Enter quantity: ");
		int Quantity = input.nextInt();
		
		System.out.print("Are you Student (true/false): ");
		boolean Student = input.hasNext();
		
		// Switch for my Menu
		double Price = 0.0;
		String item_name = "";
		boolean vchoice = true;
		
		switch (Choice) {
		case 1:
			item_name = "College Notebooks";
			Price = 45.00;
			break;
		case 2:
			item_name = "Gel Pen Box";
			Price = 120.00;
			break;
		case 3:
			item_name = "Scientific Calculator";
			Price = 850.00;
			break;
		default:
			System.out.println("\nInvalid Menu Choice!!");
			vchoice = false;
		}
		
		// Proceed if it's True
		if (vchoice) {
			
			double total = Price * Quantity; // Compute The total
			
			// Discount process
			double discountRate = 0.0;
			double discountAmount = 0.0;
			double finalTotal = total;
			String discountStatus = "NO";
			
		if ((Student && total >= 300) || Quantity >= 10) {
			discountRate = 0.10;
			discountAmount = total * discountRate;
			finalTotal = total - discountAmount;
			discountStatus = "YES (10% Special Discount";			
		}
		
		// For the Receipt
		System.out.println("\n--------------------- RECEIPT ---------------------");
        System.out.println("Item Selected: " + item_name);
        System.out.printf("Unit Price: PHP %.2f%n", Price);
        System.out.println("Quantity: " + Quantity);
        System.out.printf("Subtotal: PHP %.2f%n", total);
        System.out.println("Discount Applied: " + discountStatus);
        System.out.printf("Final Amount Due: PHP %.2f%n", finalTotal);
        System.out.println("=======================================================");
		}
		
	input.close();
				
	}
}
