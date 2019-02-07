package chap2rv.pk1;

public class TestBankAccount {

	public static void chooseBestAccount(BankAccount better, BankAccount b1, BankAccount b2) {
		if (b1.getBalance() > b2.getBalance())
			better = b1;
		else
			better = b2;
	}

	public static BankAccount chooseBestAccount(BankAccount b1, BankAccount b2) {
		BankAccount better;
		if (b1.getBalance() > b2.getBalance())
			better = b1;
		else
			better = b2;
		return better;
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("MathW", 500.00);
		BankAccount b2 = new BankAccount("DannyB", 650.50);

		b1.withdraw("MathW", 200.00);
		b2.deposit("DannyB", 36.68);

		if (b2.getBalance() > b1.getBalance())
			System.out.println("Bank 2 has more balance than Bank 1");

		// Pass Object Test
		BankAccount betterFund = null;
		chooseBestAccount(betterFund, b1, b2);
		if (betterFund == null)
			System.out.println("Test 1: betterFund is still null");

		// Pass Object Test again
		betterFund = chooseBestAccount(b1, b2);
		if (betterFund == null)
			System.out.println("Test 2: betterFund is still null");
		else
			System.out.println("Test 2: betterFund account balance: " + betterFund.getBalance());

	}
}
