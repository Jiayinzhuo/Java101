// App3 -   test out the BankAcount class
//          the program expects two inputs: the monthly
//          deposit and the interest rate, as in:
//          App3 100 8
//          meaning $100 per month at 8% interest (to keep
//          things simple, both are assumed to be integers.)
//          The program calculate the bank balance at the end
//          of each month for ten years.

public class App3 {
	public static void main(String args[]) {
		double deposit = (double) Integer.parseInt(args[0]);

		double interest = (double) Integer.parseInt(args[1]);

		BankAccount myAccount = new BankAccount();

		myAccount.setRate(interest);

		System.out.println("Depositing " + deposit + " per month at " + myAccount.getRate() + " per cent interest");
		System.out.println("Watch my account grow!");

		for (int year = 0; year < 10; year++) {
			System.out.print(year + " - ");
			for (int month = 0; month < 12; month++) {
				myAccount.Deposit(deposit);

				// now take monthly fees and interest
				myAccount.Monthly();
				System.out.print(myAccount.getBalance() + ", ");
			}
			System.out.println();
		}
	}
}
