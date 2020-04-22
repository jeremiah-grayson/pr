package com.cg.payrolldao.services;

import java.util.List;

import com.cg.payroll.dto.Employee;

public interface EmployeeDAO {
	
	Employee save(Employee employee);
	boolean update(Employee employee);
	Employee findOne(int employeeId);
	List<Employee>	findALL();
}
