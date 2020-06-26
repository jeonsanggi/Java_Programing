package com.jremind.exam04;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.deposit(10000);
		System.out.println("ภÜพื: " + acc.getBalance());
		
		try {
			acc.withdraw(500000);
		}catch(BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
