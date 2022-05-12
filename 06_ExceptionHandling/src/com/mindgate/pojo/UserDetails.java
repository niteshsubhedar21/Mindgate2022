package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {

	private String userid;
	private String name;
	private int age;
	
	public UserDetails() {
	}

//	public UserDetails(int userid, String name, int age) {
//		super();
//		this.userid = userid;
//		this.name = name;
//		this.age = age;
//	}
	
	public void acceptUserDetails() {
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter UserId :");
			userid=scanner.next();
			
			System.out.println("Enter Name :");
			name=scanner.next();
			
			System.out.println("Enter Age :");
			age=scanner.nextInt();
			
			
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid Input From User");
			System.out.println("Please Enter Valid Values");
		}
			
	}
	
public void displayUserDetails() {
		System.out.println(userid);
		System.out.println(name);

		System.out.println(age);

		System.out.println();

		
	}
	
}
