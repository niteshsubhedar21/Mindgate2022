package com.mindgate.Main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {
public static void main(String[] args) {
	Set<String> nameSet =new HashSet<>();
	
	nameSet.add("kiran");
	nameSet.add("Chaitanya");
	nameSet.add("Nitesh");
	nameSet.add("kiran");
	nameSet.add("ravi");
	nameSet.add("Chaitanya");
	
	System.out.println(nameSet);
	System.out.println("_".repeat(50));
	
	Employee employee1=new Employee(101, "Nitesh", 1000);
	System.out.println(employee1.hashCode());
	Employee employee2 =new Employee(102, "Chaitanya", 2000);
	System.out.println(employee2.hashCode());
	Employee employee3 =new Employee(103, "Kiran", 2000);
	System.out.println(employee3.hashCode());
	Employee employee4=new Employee(101,"Nitesh", 1000);
	System.out.println(employee4.hashCode());
	
	Set<Employee> employeeSet =new HashSet<Employee>();
	employeeSet.add(employee1);
	employeeSet.add(employee2);
	employeeSet.add(employee3);
	employeeSet.add(employee4);
	
	for (Employee employee : employeeSet) {
		System.out.println(employee);
	}
	
	Integer s=Integer.valueOf(10);
	System.out.println(s.hashCode());
	
	String a= new String("hi");
	System.out.println(a.hashCode());
	
}
}
