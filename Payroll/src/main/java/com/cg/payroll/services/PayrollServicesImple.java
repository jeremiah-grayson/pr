package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.dto.Employee;
import com.cg.payrolldao.services.EmployeeDAO;
import com.cg.payrolldao.services.EmployeeDAOImple;

public class PayrollServicesImple implements PayrollServices {

	private EmployeeDAO employeeDAO;
	
	public PayrollServicesImple() 
	{
		employeeDAO=new EmployeeDAOImple();
	}
	@Override
	public int acceptEmployeeDetails(Employee employee) 
	{
		// TODO Auto-generated method stub
		employee = employeeDAO.save(employee);
		return employee.getEmployeeID(); 
	}

	@Override
	public int calculateNetSalary(int employeeId) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getEmployeeDetails(int employeeId) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeesDetails() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
