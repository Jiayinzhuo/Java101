package chap3ts.pk1;

public class BankAccount {

	private double balance;

	public BankAccount() {
		balance = 0;
		System.out.println("In BankAccount() and balance is 0");
	}

	public BankAccount(double acctBalance) {
		balance = acctBalance;
		System.out.println("In BankAccount(double acctBalance) and balance is: " + balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	// Newly added method
	public void transfer(BankAccount another, double amount) {
		withdraw(amount);
		another.deposit(amount);
	}

	public static void main(String[] args) {
		// CheckingAccount ca = new CheckingAccount(100);
		// System.out.println("CheckingAccount Balance: " + ca.getBalance());

		// BankAccount b = new BankAccount(1400);
		// BankAccount s = new SavingsAccount(1000, 0.04);
		// BankAccount c = new CheckingAccount(500);

		// BankAccount b = new BankAccount(650);
		// SavingsAccount timesSavings = new SavingsAccount(1500, 0.03);
		// CheckingAccount daynasChecking = new CheckingAccount(2000);

		OtherAccount o = new OtherAccount();
	}

}
