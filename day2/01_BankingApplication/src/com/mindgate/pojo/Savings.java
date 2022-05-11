package com.mindgate.pojo;

public class Savings extends Account {

	private boolean issalary;

	public Savings() {
		System.out.println("Default Constructor of Savings ");
	}

	public Savings(int accountnumber, String name, double balance, boolean issalary) {
		super(accountnumber, name, balance);
		this.issalary = issalary;
		System.out.println("Overloaded Constrctor of Saving ");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (issalary && amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (issalary == false && getBalance() - amount >= 1500) {
				setBalance(getBalance() - amount);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deposite(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

	public boolean isIssalary() {
		return issalary;
	}

	public void setIssalary(boolean issalary) {
		this.issalary = issalary;
	}

	@Override
	public String toString() {
		return "Savings [issalary=" + issalary + ", toString()=" + super.toString() + "]";
	}

}
