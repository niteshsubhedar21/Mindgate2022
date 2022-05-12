package com.mindgate.Main;

import com.mindgate.pojo.UserDetails;

public class UserDetailsMain {
	public static void main(String[] args) {
	System.out.println(" Main Start ");
		UserDetails userDetails = new UserDetails();
		userDetails.acceptUserDetails();
		userDetails.displayUserDetails();
		System.out.println("Main End ");
		
		try {
			Class.forName("com.mindgate.pojo.UserDetails");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
