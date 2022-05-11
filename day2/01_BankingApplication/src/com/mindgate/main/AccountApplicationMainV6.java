package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationMainV6 {
	public static void main(String[] args) {
		Current current = new Current(101, "Nitesh Subhedar", 10000, 50000);
		System.out.println(current);
		System.out.println("withdraw : 5000");
		current.withdraw(5000);
		System.out.println(current);

		System.out.println();
		System.out.println("withdraw :20000");
		current.withdraw(20000);

		System.out.println(current);
		System.out.println();
		System.out.println("deposite : 5000");
		current.deposite(5000);
		System.out.println(current);

		System.out.println();
		System.out.println("deposite : 15000");
		current.deposite(15000);
		System.out.println(current);
	}
}
