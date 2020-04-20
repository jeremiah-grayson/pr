package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.dto.Employee;

import com.cg.payroll.exceptions.EmployeeDetailsNotFoundException;

public interface PayrollServices 
{
	int acceptEmployeeDetails(Employee emp1);
	//int calculateNetSalary(int EmployeeID)throws EmployeeDetailsNotFoundException;
	Employee getEmployeeDetails(int EmployeeID);
	List<Employee> getAllEmployeeDetails();
}
