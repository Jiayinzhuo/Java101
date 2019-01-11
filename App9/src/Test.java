public class Test {
	public static void main(String[] s) {
		try {
			// open a bank account with $50 in it
			BankAccount ba = new BankAccount(50.0);

			// now try to take out $100
			ba.Withdrawal(100.0);

			System.out.println("Withdrawal successful!");
		} catch (Exception e) {
			// output exception's error message
			System.out.println(e.toString());
		}
	}
}
