// BankAccount - a general bank account
package com.example.account;

abstract public class BankAccount implements IBankAccount {
	private static double currentRate;
	private double currentBalance;

	// constructor
	public BankAccount(double initialBalance) {
		currentBalance = initialBalance;
	}

	@Override
	abstract public int getAccountNo();

	public static double getRate() {
		return currentRate;
	}

	public static void setRate(double newRate) {
		if (newRate > 0.0 && newRate < 0.20) {
			currentRate = newRate;
		}
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0.0) {
			currentBalance += amount;
		}
	}

	@Override
	public void withdrawal(double amount) {
		if (amount >= 0.0 && amount <= currentBalance) {
			currentBalance -= amount;
		}
	}

	@Override
	public double getMonthlyBalance() {
		return currentBalance;
	}

	@Override
	public void setMonthlyBalance() {
		deductFee();
		addInterest();
	}

	protected void deductFee() {
		currentBalance -= 5.0;
	}

	protected void addInterest() {
		// 20% annual rate /12 to get monthly rate
		currentBalance += currentBalance * (currentRate / 12);
	}
}
