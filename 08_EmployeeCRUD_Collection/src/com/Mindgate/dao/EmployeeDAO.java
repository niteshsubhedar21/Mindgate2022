package com.Mindgate.dao;

import java.util.HashSet;
import java.util.Set;

import com.Mindgate.Pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> employeeSet = new HashSet<Employee>();

	// Add new employee
	public boolean addNewEmployee(Employee employee) {
		if(employee != null) {
		return 		employeeSet.add(employee);

		}
		
		return false;
	}

	// update employee
	public boolean updateEmployee(Employee employee) {
		for (Employee setEmployee : employeeSet) {
			if(setEmployee.getEmployeeId() == employee.getEmployeeId())
				setEmployee.setName(employee.getName());
			setEmployee.setSalary(employee.getSalary());
			return true;
		}
		return false;
	}

	// delete
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee deleteEmployee : employeeSet) {
			if(deleteEmployee.getEmployeeId() == employeeId)
				 employeeSet.remove(deleteEmployee);
			return true;
		}
		
		
		return false;
	}

	// get single employee
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmployeeId() == employeeId)
				
			return employee;
		}
		return null;
	}

	// get all employee
	public Set<Employee> getAllEmployees() {
		return employeeSet;
	}
}
