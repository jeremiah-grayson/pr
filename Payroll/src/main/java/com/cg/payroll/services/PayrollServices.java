package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.dto.Employee;


public interface PayrollServices 
{
	int acceptEmployeeDetails(Employee employee);
	int calculateNetSalary(int employeeId);
	Employee getEmployeeDetails(int employeeId);
	List<Employee>	getAllEmployeesDetails();

}
