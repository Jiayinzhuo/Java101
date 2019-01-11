// BankAccount - implement a bank account 

public class BankAccount {
	// interest rate
	private double currentInterestRate;

	// balance - the current account's balance
	private double currentBalance;

	// getRate/setRate - inquire or set interest rate
	public double getRate() {
		return currentInterestRate;
	}

	public void setRate(double newRate) {
		// first a sanity check
		if (newRate > 0.0 && newRate < 20.0) {
			currentInterestRate = newRate;
		}
	}

	public double getBalance() {
		return currentBalance;
	}

	public void Deposit(double amount) {
		// no negative deposits!
		if (amount > 0.0) {
			currentBalance += amount;
		}
	}

	public void Withdrawal(double amount) {
		if (amount >= 0.0) {
			// don't let him withdraw more than he has
			if (amount <= currentBalance) {
				currentBalance -= amount;
			}
		}
	}

	// Monthly - each month wrack up interest and service
	// fees
	public void Monthly() {
		Fee(); // fee first! (reduces interest we pay)
		Interest();
	}

	private void Fee() {
		currentBalance -= 5.0; // $5.00 per month
	}

	// Interest - tack on monthly interest
	private void Interest() {
		// 1200 because interest is normally expressed
		// in numbers like 20% meaning .2 and because
		// we are accumulating interest monthly
		currentBalance += currentBalance * (currentInterestRate / 1200.0);
	}
}
