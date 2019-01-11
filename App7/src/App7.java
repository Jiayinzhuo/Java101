// App7 - test out the SavingsAccount and CheckingAccount
//          classes. This version  accumulates interest
//          and performs routine withdrawals from both
//          checking and savings.

public class App7 {
	public static void main(String args[]) {
		// set the interest rate first - just assume 8%
		BankAccount.setRate(8.0);

		// create a savings account and a checking account
		CheckingAccount ca = new CheckingAccount(0.0);
		SavingsAccount sa = new SavingsAccount(0.0);

		// for 10 months, deposit $100 in each and then
		// accrue monthly interest and fees
		for (int i = 0; i < 10; i++) {
			ca.Deposit(100.0);
			sa.Deposit(100.0);

			ca.Monthly();
			sa.Monthly();

			System.out.print("Month " + i + " - ");
			System.out.print(ca.AccountNo() + ":" + ca.getBalance() + ", ");
			System.out.println(sa.AccountNo() + ":" + sa.getBalance());
		}
	}
}
