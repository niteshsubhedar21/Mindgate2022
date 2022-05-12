package com.Mindgate.Main;

import java.util.Scanner;
import java.util.Set;

import com.Mindgate.Pojo.Employee;
import com.Mindgate.dao.EmployeeDAO;

public class EmployeeMain {
	public static void main(String[] args) {
		int employeeId;
		String name;
		double salary;
		String decision;

		Employee employee;
		EmployeeDAO dao = null;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1) Add Employee Details ");
			System.out.println("2) update Employee Details ");
			System.out.println("3) Delete Employee Details ");
			System.out.println("4) Get Single Employee Details ");
			System.out.println("5) Get All Employee Details ");
			System.out.println("Enter your choice ");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Employee Id ");
				employeeId = scanner.nextInt();

				System.out.println("Enter Name ");
				name = scanner.next();

				System.out.println("Enter Salary ");
				salary = scanner.nextDouble();

				employee = new Employee(employeeId, "name", salary);

				dao = new EmployeeDAO();
				dao.addNewEmployee(employee);

				System.out.println("Employee Added Successfully");
				break;
			}
			case 2: {
				System.out.println("Enter Id");
				employeeId = scanner.nextInt();

				System.out.println("Enter new name ");
				name = scanner.next();

				System.out.println("Enter New Salary");
				salary = scanner.nextDouble();

				employee = new Employee(employeeId, "name", salary);
				dao.updateEmployee(employee);

				System.out.println("Updated Successfully");

				break;
			}
			case 3: {
				System.out.println("Enter Employee Id");
				employeeId = scanner.nextInt();

				dao.deleteEmployeeByEmployeeId(employeeId);

				if (true) {
					System.out.println("successfully Deleted");
				}
				break;
			}
			case 4:
				System.out.println("Enter Employee Id");
				employeeId=scanner.nextInt();
				
				dao.getEmployeeByEmployeeId(employeeId);
				System.out.println(	dao.getEmployeeByEmployeeId(employeeId));
				break;
				case 5:
				Set<Employee> employeeSet = dao.getAllEmployees();
				System.out.println(employeeSet);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			System.out.println("do you want to choice againg ");
			decision = scanner.next();
		} while(decision.equals("yes"));

	}
}
