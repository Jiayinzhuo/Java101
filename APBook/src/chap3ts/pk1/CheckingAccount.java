package chap3ts.pk1;

public class CheckingAccount extends BankAccount {
	private static final double FEE = 2.0;
	private static final double MIN_BALANCE = 50.0;

	public CheckingAccount(double acctBalance) {
		// super(acctBalance);

		// super();
		// deposit(acctBalance);

		// deposit(acctBalance);
	}

	/*
	 ** FEE of $2 deducted if withdraw leaves balance less than MIN_BALANCE.
	 * Allows for negative balance
	 *
	 */
	public void withdraw(double amount) {

		// Question 6, method overriding = dynamic binding (late binding)
		// Question set is wrong. Both B and D are right

	}

}
