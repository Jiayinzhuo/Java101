// App4 - test out the BankAcount class.
//          the program expects two inputs: the monthly
//          deposit and the interest rate, as in App4 100 8
//          meaning $100 per month at 8% interest (to keep
//          things simple, both are assumed to be integers.)
//          The program calculate the bank balance at the end
//          of each month for 10 years.

public class App4 {
	public static void main(String args[]) {
		// first argument is the deposit per month
		double deposit = (double) Integer.parseInt(args[0]);

		// second argument is the interest rate
		double interestRate = (double) Integer.parseInt(args[1]);

		// now set the interest rate
		BankAccount.setRate(interestRate);

		// create a BankAccount object
		BankAccount myAccount = new BankAccount();

		// Make a deposit each month and
		// watch my account grow for 10 years!
		System.out.println("Depositing " + deposit + " per month at " + BankAccount.getRate() + " per cent interest");
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
