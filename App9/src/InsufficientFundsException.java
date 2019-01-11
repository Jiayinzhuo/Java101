public class InsufficientFundsException extends Exception {
	private static final long serialVersionUID = 1L;
	private BankAccount bankAccount; // account with problem
	private double withdrawalAmount;

	InsufficientFundsException(BankAccount ba, double amount) {
		super("Insufficient funds in account ");
		bankAccount = ba;
		withdrawalAmount = amount;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Insufficient funds in account ");
		sb.append(bankAccount.getId());
		sb.append("\nBalance was ");
		sb.append(bankAccount.getBalance());
		sb.append("\nWithdrawal was ");
		sb.append(withdrawalAmount);
		return sb.toString();
	}
}
