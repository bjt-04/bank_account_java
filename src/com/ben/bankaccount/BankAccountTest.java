package com.ben.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount ben = new BankAccount();
		
		ben.depositeChecking(1000000);
//		ben.viewBalance();
		ben.depositeSavings(5);
//		ben.withdrawChecking(5000000);
		ben.depositeSavings(400);
		System.out.println(ben.bankTotal());

	}

}
