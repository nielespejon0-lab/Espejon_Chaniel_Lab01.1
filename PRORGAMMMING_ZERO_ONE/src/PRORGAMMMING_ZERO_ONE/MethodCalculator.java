package PRORGAMMMING_ZERO_ONE;

import java.util.Scanner;

public class MethodCalculator {
    
    static double add(double a, double b) {
    double sum = a + b;
    return sum;
    }
    
    static double subtract(double a, double b) {
    double diff = a - b;
    return diff;
    }

    static double multiply(double a, double b) {
    double prod = a * b;
    return prod;
    }

    static double divide(double a, double b) {
    if (b == 0) {
    System.out.println("Cannot divide by zero");
    return 0;
    }
    double quot = a / b;
    return quot;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Enter first number: ");
    double x = sc.nextDouble();
        
    System.out.print("Enter second number: ");
    double y = sc.nextDouble();
        
    System.out.println("\nAdd: " + add(x, y));
    System.out.println("Subtract: " + subtract(x, y));
    System.out.println("Multiply: " + multiply(x, y));
    System.out.println("Divide: " + divide(x, y));
        
    sc.close();
  }
}
