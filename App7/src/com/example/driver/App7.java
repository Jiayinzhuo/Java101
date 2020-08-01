/*
 * App7 - test out SavingsAccount and CheckingAccount
 */
package com.example.driver;

import com.example.account.BankAccount;
import com.example.account.CheckingAccount;
import com.example.account.SavingsAccount;

public class App7 {
	public static void main(String args[]) {
		BankAccount.setRate(8.0);

		// create a savings account and a checking account
		CheckingAccount ca = new CheckingAccount(0.0);
		SavingsAccount sa = new SavingsAccount(0.0);

		System.out.println("Month X - Checking Bal, Saving Bal");
		System.out.println("==================================");

		for (int i = 0; i < 10; i++) {
			ca.deposit(100.0);
			sa.deposit(100.0);

			ca.setMonthlyBalance();
			sa.setMonthlyBalance();

			System.out.print("Month " + i + " - ");
			System.out.print(ca.getAccountNo() + ":" + ca.getMonthlyBalance() + ", ");
			System.out.println(sa.getAccountNo() + ":" + sa.getMonthlyBalance());
		}
	}
}
