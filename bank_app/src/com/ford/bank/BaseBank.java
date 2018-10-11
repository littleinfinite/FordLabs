package com.ford.bank;

public abstract class BaseBank implements Bank {
	
	protected double balance = 0;
	protected String name;
	protected Address address;
	public BaseBank(Address address) {
		this.address= address;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String Address() {
		// TODO Auto-generated method stub
		return null;


	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transferFunds(Bank bank, double amount) {
		// TODO Auto-generated method stub
		
	}

}
