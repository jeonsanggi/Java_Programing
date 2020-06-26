package com.jremind.exam04;

public class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	// Exception¿ª √≥∏Æ
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			// Exception ∞¥√º∏¶ ∫Œ∏£¥¬ ≥
			throw new BalanceInsufficientException("¿‹∞Ì∫Œ¡∑");
		}
		
		balance -= money;
	}
}
