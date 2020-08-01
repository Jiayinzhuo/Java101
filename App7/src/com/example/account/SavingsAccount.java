package com.example.account;

public class SavingsAccount extends BankAccount {
	private static int nextAccountNo = 100001;
	private int accountNo;

	// constructor
	public SavingsAccount(double initialBalance) {
		super(initialBalance);
		accountNo = nextAccountNo++;
	}

	public int getAccountNo() {
		return accountNo;
	}

	// don't charge fee if balance over $200
	public void deductFee() {
		if (getMonthlyBalance() < 200.0) {
			super.deductFee();
		}
	}
}
