package com.infyshine;

public class HDFCBank implements Bank {
	private double balance;
	@Override
	public void deposite(double amt) throws InvalidAmountException {
		if(amt<=0 ) {
			throw new InvalidAmountException(amt + "is invalid amount");
		}
		balance = balance + amt;
	}
	

	public double withdraw(double amt)
			throws InvalidAmountException, InSufficientFundsException {
		if( amt<=0 ) {
			throw new InvalidAmountException(amt + "is invalid amount");
		}
		if(balance<amt) {
			throw new InSufficientFundsException("InSufficientFunds");
			}
		balance = balance-amt;
		return amt;
		
	}

	public void balanceEnquiry() {
         System.out.println("Current Balance: "+balance);
		
		
	}

}
