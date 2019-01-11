
public class SavingsAccount extends BankAccount {
	private static int nextAccountNo = 100001;
	private int accountNo;

	// constructor
	public SavingsAccount(double initialBalance) {
		super(initialBalance);

		accountNo = nextAccountNo++;
	}

	// AccountNo - return the current account's id
	public int AccountNo() {
		return accountNo;
	}

	// Fee - don't charge fee if balance over $200
	public void Fee() {
		if (getBalance() < 200.0) {
			super.Fee();
		}
	}
}
