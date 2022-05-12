package com.mindgate.Main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArrayListDemo;
import com.mindgate.pojo.Employee;

public class ArrayListMain {

	public static void main(String[] args) {
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		List<String> nameList = new ArrayList<>();
		nameList.add("Nitesh");
		nameList.add("Ravi");
		nameList.add("Kiran");

		arrayListDemo.setArrayListId(101);

		arrayListDemo.setNameList(nameList);
		System.out.println(arrayListDemo);
		System.out.println("_".repeat(50));

		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(101);
		numberList.add(102);
		numberList.add(103);
		numberList.add(103);
		numberList.add(102);

		System.out.println(numberList);

		System.out.println("_".repeat(50));

		Employee employee1 = new Employee(101, "Nitesh", 1000);
		//Employee employee2 = new Employee(102, "Rudra", 1000);
		Employee employee2 = new Employee(101, "Ravi", 1000);
		Employee employee4 = new Employee(103, "Kiran", 1000);

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee1);
		employeeList.add(employee4);

		System.out.println(employeeList);
		
		System.out.println("_".repeat(50));
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}

}
