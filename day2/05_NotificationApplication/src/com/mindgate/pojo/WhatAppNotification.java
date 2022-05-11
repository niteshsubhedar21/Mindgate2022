package com.mindgate.pojo;

import com.mindgate.Service.Notification;

public class WhatAppNotification implements Notification {
	
		public void sendNotification(String to, String message) {
			System.out.println("Sending WhatApp  Notification");
			System.out.println("To :: " + to);
			System.out.println("Message :: " + message);
		

}
}
