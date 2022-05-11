package com.mindgate.pojo;

import com.mindgate.Service.Notification;

public class EmailNotification implements Notification {

	@Override
	public void sendNotification(String to, String message) {
		System.out.println("Sending Email Notification");
		System.out.println("To :: " + to);
		System.out.println("Message :: " + message);
		
	}

}
