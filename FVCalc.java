// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int currentValue = Integer.parseInt(args[0]);		//the invested sum
		double aiRate = Double.parseDouble(args[1]);			// the annual interest rate
		aiRate = aiRate / 100;								
		int yrs = Integer.parseInt(args[2]);			// num of years

		double newRate = Math.pow((aiRate) + 1, yrs);
		
		double FutureValue = newRate * currentValue;
		int FVround= (int)FutureValue;		//the future value in int

		System.out.println("After " + yrs + " years, a $" + currentValue + " saved at " + (aiRate*100) + "% will yield $" + FVround);






	}
}