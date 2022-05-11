package com.mindgate.Main;

import java.util.Scanner;

import com.mindgate.Factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class ShapesMain {
	public static void main(String[] args) {

		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome To Print");
		System.out.println("1) Circle \n 2) Triangle \n 3) Square \n Enter Your Choice ");
		choice = scanner.nextInt();

		Shapes shapes = ShapesFactory.getshapes(choice);
		if (shapes != null)
			shapes.draw();
		else
			System.out.println("Invalid Choice");

	}
}
