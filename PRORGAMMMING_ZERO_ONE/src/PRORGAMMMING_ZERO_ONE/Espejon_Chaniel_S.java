package PRORGAMMMING_ZERO_ONE;

import java.util.Scanner;

public class Espejon_Chaniel_S {
		
	static double balance = 0;
    static Scanner sc2 = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice = Menu.showMenu(sc2);
        switch (choice) {
            case 1:
                checkBalance(args);
                break;
            case 2:
                deposit(args);
                break;
            case 3:
                withdraw(args);
                break;
            case 4:
                exit(args);
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, 3 or 4.");
                main(args); 
        }
    }

   
    public static void checkBalance(String[] args) {
        System.out.println("\n- Check Balance -");

        if (balance == 0) {
            System.out.println("You have zero balance!");
        } else {
            System.out.println("Your outstanding balance is " + balance);
        }
        goBack(args);
    }
    
    public static void deposit(String[] args) {
    	System.out.println("\n- Deposit -");
    	nextdeposit(args);
    }
   
    public static void nextdeposit(String[] args) {
        System.out.print("Enter the amount: ");
        double amount = sc2.nextDouble();

        if (amount <= 0) {
        	System.out.println("Invalid amount!\n");
        	nextdeposit(args);
        } else if (amount >= 5001) {
        	System.out.println("Deposit limit!\n");
        	nextdeposit(args);
        } else if (amount > 0) {
        	balance += amount;
        	System.out.println(amount + " has been added to your account!");
        }
        goBack(args);
    }

    
    public static void withdraw(String[] args) {
        System.out.println("\n- Withdraw -");
        nextwithdraw(args);	
        }

    public static void nextwithdraw(String[] args) {
        System.out.print("Enter the amount: ");
        double amount = sc2.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount!\n");
            nextwithdraw(args);         
        } else if (amount > balance) {
            System.out.println("Not enough balance!\n");
            nextwithdraw(args);
        } else {
            balance -= amount;
            System.out.println("Your outstanding balance is " + balance);
        }
        goBack(args);
    }

    public static void exit(String[] args) {
    	nextexit(args);
    }	
	
    public static void nextexit(String[] args) {
    	System.out.print("Are you sure you want to exit? (yes/no): ");
    	String answer = sc2.next();
    	
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			System.out.println("\nThank you come again!");
	    } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
	    	main(args); 
	    } 
	   
	}
    
    public static void goBack(String[] args) {
        System.out.print("\nGo back to Main Menu? (yes/no): ");
        String answer = sc2.next();
        System.out.println();
        
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            main(args); 
        } else {
            System.out.println("\nThank you come again!");
        }
   }
}