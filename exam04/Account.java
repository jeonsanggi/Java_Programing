package com.jremind.exam04;

public class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	// Exception�� ó��
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			// Exception ��ü�� �θ��� ��
			throw new BalanceInsufficientException("�ܰ����");
		}
		
		balance -= money;
	}
}
