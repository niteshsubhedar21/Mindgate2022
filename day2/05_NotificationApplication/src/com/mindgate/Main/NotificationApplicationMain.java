package com.mindgate.Main;

import java.util.Scanner;

import com.mindgate.Service.Notification;
import com.mindgate.factory.NotificationFactory;
import com.mindgate.pojo.SMSNotification;

public class NotificationApplicationMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String to;
		String message;
		int choice;

		System.out.println("1. SMS Notification ");
		System.out.println("2. Email Notification ");
		System.out.println("3. WhatApp Notification ");
		System.out.println("Enter your choice ");
		choice = scanner.nextInt();

		System.out.println("Enter Contact :: ");
		to = scanner.next();
		message = scanner.nextLine();

		System.out.println("Enter Message :: ");
		message = scanner.nextLine();

		Notification notification = NotificationFactory.getNotification(choice);
		notification.sendNotification(to, message);

	}
}
