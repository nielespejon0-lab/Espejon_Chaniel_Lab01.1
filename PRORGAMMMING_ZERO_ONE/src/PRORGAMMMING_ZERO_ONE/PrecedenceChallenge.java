package PRORGAMMMING_ZERO_ONE;

public class PrecedenceChallenge {
	public static void main(String[] args) {
		
		/* Process for a:
            1. Multiplication is done first: 3 * 4 = 12
            2. Then addition: 2 + 12 = 14
            Result: a = 14 */
		int a = 2 + 3 * 4; 
		
		/* Process for b:
            1. Parentheses force addition first: 2 + 3 = 5
            2. Then multiply: 5 * 4 = 20
            Result: b = 20 */
		int b = (2 + 3) * 4;
		
		/* Process for c:
            1. Division and modulus have same precedence, so left to right
            2. First: 20 / 4 = 5
            3. Then: 5 % 3 = 2 (remainder of 5 divided by 3)
            Result: c = 2 */
		int c = 20 / 4 % 3;
		
		/* Process for d:
            1. Compare 5 > 3 → true
            2. Compare 2 < 1 → false
            3. true && false → false (both must be true for AND)
            Result: d = false */
		boolean d = 5 > 3 && 2 < 1;
		
		/* Process for e:
           1. Start with e = 10
           2. Inside the compound assignment, multiply first: 2 * 3 = 6
           3. Then add to e: 10 + 6 = 16
           Result: e = 16 */
		int e = 10; e += 2 * 3;
		
		// Print all final values separated by spaces
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	}
}