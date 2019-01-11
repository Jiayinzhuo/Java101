// BankAccount - a general bank account class
public class BankAccount {
	private static int accountIds = 0;

	// id - this is the account id
	private int accountId;

	// balance - the current account's balance
	private double balance;

	// constructor - open account with a balance
	BankAccount(double initialBalance) {
		balance = initialBalance;
		accountId = ++accountIds;
	}

	// Id - return the account id
	public int getId() {
		return accountId;
	}

	// Balance
	public double getBalance() {
		return balance;
	}

	// Withdrawal - make a withdrawal
	public void Withdrawal(double amount) throws InsufficientFundsException {
		// if there's insufficient funds on hand...
		if (balance < amount) {
			// ...throw an exception
			throw new InsufficientFundsException(this, amount);
		}

		// otherwise, post the debit
		balance -= amount;
	}
}
