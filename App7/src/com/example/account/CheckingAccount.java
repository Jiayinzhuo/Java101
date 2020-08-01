package com.example.account;

public class CheckingAccount extends BankAccount {

	private static int nextAccountNo = 800001;
	private int accountNo;

	// constructor
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		accountNo = nextAccountNo++;
	}

	public int getAccountNo() {
		return accountNo;
	}

	// don't accumulate interest if balance under $500
	public void addInterest() {
		if (getMonthlyBalance() > 500.0) {
			super.addInterest();
		}
	}
}
