package chap2rv.pk1;

public class BankAccount {
	private String password;
	private double balance;
	public static final double OVERDRAWN_PENALTY = 20.00;

	public BankAccount() {
		super();
	}

	public BankAccount(String password, double balance) {
		super();
		this.password = password;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(String acctPassword, double amount) {
		if (!acctPassword.equals(password)) {
			// throw an exception
		} else
			balance += amount;

	}

	public void withdraw(String acctPassword, double amount) {
		if (!acctPassword.equals(password)) {
			// throw an exception
		} else {
			balance -= amount;
			if (balance < 0)
				balance -= OVERDRAWN_PENALTY;
		}

	}
}
