// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

		double bill = Double.parseDouble(args[3]);
		bill = Math.ceil(bill);
		double totBill = bill / 3;
		totBill = Math.ceil(totBill);

		System.out.println("Dear " + name1 + ", " + name2 + " and " + name3 + ": pay " + totBill + " shekels each.");

	}
}
