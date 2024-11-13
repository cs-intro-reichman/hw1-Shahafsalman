// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int currentValue = Integer.parseInt(args[0]);		//the invested sum
		Double aiRate = Double.parseDouble(args[1]);			// the annual interest rate
		aiRate = aiRate / 100;
		int yrs = Integer.parseInt(args[2]);			// num of years

		Double newRate = Math.pow((aiRate) + 1, yrs);
		
		System.out.println(newRate);
		
		Double FutureValue = newRate * currentValue ;
		System.out.println(FutureValue);
		System.out.println("After " + yrs + " years, " + currentValue + "$ saved at " + aiRate + "% will yeald " + FutureValue);






	}
}