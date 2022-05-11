package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double draftBalance=50000;

	public Current() {
		System.out.println("Default Constructor of Current ");
	}

	public Current(int accountnumber, String name, double balance, double overdraftBalance) {
		super(accountnumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("Overloaded Constructor of Current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (amount >= getBalance() && amount <= getBalance() + overdraftBalance) {

				setOverdraftBalance(getBalance() + overdraftBalance - amount);
				double temp = getBalance() - amount;
				if (temp <= 0) {
					setBalance(0);
					return true;
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean deposite(double amount) {
		if(amount > 0) {
		if(overdraftBalance == draftBalance )
		{
			setBalance(getBalance()+amount);
			return true;
		}
		
		if(overdraftBalance+amount <= draftBalance) {
			setOverdraftBalance(overdraftBalance+amount);
			setBalance(0);
			return true;
		}
		if(overdraftBalance+amount > draftBalance) {
			
			setBalance(overdraftBalance+amount-draftBalance);
			setOverdraftBalance(draftBalance);
			return true;
		}
		}
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
