package PRORGAMMMING_ZERO_ONE;

import java.util.Scanner;

public class Menu {
    public static int showMenu(Scanner sc) {
        String equal = "=";
        String line = "||";
        String Bank = "ABC BANK";
        String num1 = "1. Check Balance";
        String num2 = "2. Deposit";
        String num3 = "3. Withdraw";
        String num4 = "4. Exit";

        System.out.println("\n" + equal.repeat(42));
        System.out.println(line + "\t\t" + Bank + "\t\t\t" + line);
        System.out.println(line + "\t    " + num1 + "\t        " + line);
        System.out.println(line + "\t    " + num2 + "\t\t\t" + line);
        System.out.println(line + "\t    " + num3 + "\t\t\t" + line);
        System.out.println(line + "\t    " + num4 + "\t\t\t" + line);
        System.out.println(equal.repeat(42) + "\n");

        System.out.print("Enter your choice (1,2,3,4): ");
        return sc .nextInt();
    }
}
