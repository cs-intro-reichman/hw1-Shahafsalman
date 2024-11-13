// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int numWords = Integer.parseInt(args[0]);
		int hundreds = numWords / 100;
		int tens = ((numWords / 10) % 10);
		int ones = numWords % 10;

		System.out.println(hundreds + " hundreds " + tens + " tens " + ones + " ones ");
	}
}
