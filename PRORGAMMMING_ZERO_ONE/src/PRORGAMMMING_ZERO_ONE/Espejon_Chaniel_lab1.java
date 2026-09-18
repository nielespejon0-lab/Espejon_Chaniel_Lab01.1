package PRORGAMMMING_ZERO_ONE;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Espejon_Chaniel_lab1 {
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
     Random num = new Random();
     
     int numb;
     
     numb = num.nextInt(1, 100);
     
     ArrayList<String> Hobbies = new ArrayList<>();
     
     System.out.print("Enter your name: ");
     String name = input.nextLine();
     
     System.out.print("Enter hobby 1: ");
     Hobbies.add(input.nextLine());
     
     System.out.print("Enter hobby 2: ");
     Hobbies.add(input.nextLine());
     
     System.out.print("Enter hobby 3: ");
     Hobbies.add(input.nextLine());

     System.out.println("\n---Output---\n");
     System.out.println("Name:" + name);
     System.out.println("Random Number: " + numb);
	}
}
