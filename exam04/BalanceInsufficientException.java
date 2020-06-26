package com.jremind.exam04;

public class BalanceInsufficientException extends RuntimeException{
	public BalanceInsufficientException(){}
	public BalanceInsufficientException(String Message) {
		super(Message);
	}

}
