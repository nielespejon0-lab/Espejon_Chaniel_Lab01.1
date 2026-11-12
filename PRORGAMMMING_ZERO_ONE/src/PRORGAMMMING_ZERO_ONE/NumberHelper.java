package PRORGAMMMING_ZERO_ONE;

public class NumberHelper {
    
    static boolean isEven(int n) {
    return n % 2 == 0;
    }

    static int getLarger(int a, int b) {
    if (a > b) {
    return a;
    } else {
    return b;
     }
    }

    static void printStars(int count) {
    for (int i = 0; i < count; i++) {
    System.out.print("*");
    }
    System.out.println();
    }

    public static void main(String[] args) {
    System.out.println(isEven(7));        
    System.out.println(getLarger(12, 9)); 
    printStars(5);                         
    }
}
	
