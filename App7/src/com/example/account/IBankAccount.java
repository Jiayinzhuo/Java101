package com.example.account;

public interface IBankAccount {

	int getAccountNo();

	void deposit(double amount);

	void withdrawal(double amount);

	double getMonthlyBalance();

	void setMonthlyBalance();

}