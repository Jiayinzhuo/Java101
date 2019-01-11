
public class CheckingAccount extends BankAccount {

	private static int nextAccountNo = 800001;
	private int accountNo;

	// constructor
	public CheckingAccount(double initialBalance) {
		super(initialBalance);

		accountNo = nextAccountNo++;
	}

	// AccountNo - return the current account ID
	public int AccountNo() {
		return accountNo;
	}

	// Interest - don't accumulate interest if balance
	// under $500
	public void Interest() {
		if (getBalance() > 500.0) {
			super.Interest();
		}
	}
}
