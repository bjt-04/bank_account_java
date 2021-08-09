package com.ben.bankaccount;

public class BankAccount {
	
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts = 0;
	private static int totalDeposites = 0;
	
	public BankAccount() {
		setChecking();
		setSavings();
		numberOfAccounts++;
	}
	
	public void setChecking() {
		this.checkingBalance = 0;
	}
	
	public void setSavings() {
		this.savingsBalance = 0;
	}
	
	public double getChecking() {
		return this.checkingBalance;
	}
	
	public double getSavings() {
		return this.savingsBalance;
	}
	
	public void depositeChecking(double deposite) {
		this.checkingBalance += deposite;
		totalDeposites += this.checkingBalance;
	}
	
	public void depositeSavings(double deposite) {
		this.savingsBalance += deposite;
		totalDeposites += this.savingsBalance;
	}
	
	public double withdrawChecking(double amount) {
		if(amount > this.checkingBalance) {
			throw new Error("Insufficient Funds");
		} else {
			this.checkingBalance -= amount;
			totalDeposites -= amount;
		}
		return this.checkingBalance;
	}
	
	public double withdrawSavings(double amount) {
		if(amount > this.savingsBalance) {
			throw new Error("Insufficient Funds");
		} else {
			this.savingsBalance -= amount;
			totalDeposites -= amount;
		}
		return this.savingsBalance;
	}
	
	public double bankTotal() {
		return this.checkingBalance + this.savingsBalance;
	}
	
	public void viewBalance() {
		System.out.println("Checking account balance: $" + this.checkingBalance + " Savings account balance: $" + this.savingsBalance);
	}
	
	public static int getAccounts() {
		return numberOfAccounts;
	}
	
	public static double getTotalDeposites() {
		return totalDeposites;
	}
	
	

}
