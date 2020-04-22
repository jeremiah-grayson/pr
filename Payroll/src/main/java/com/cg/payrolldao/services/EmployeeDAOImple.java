package com.cg.payrolldao.services;

import com.cg.payroll.dto.Employee;
import com.cg.payroll.util.PayrollUtil;
import java.util.List;


public class EmployeeDAOImple implements EmployeeDAO {

	
	public Employee save(Employee employee) 
	{
		employee.setEmployeeID(PayrollUtil.getEmployee_ID_COUNTER());
		PayrollUtil.employees.put(employee.getEmployeeID(), employee);
		return employee;
	}

	@Override
	public boolean update(Employee employee) 
	{
		PayrollUtil.employees.put(employee.getEmployeeID(),employee);
		return true;
	}

	@Override
	public Employee findOne(int employeeId) 
	{
		return PayrollUtil.employees.get(employeeId);
	}

	@Override
	public List<Employee> findALL() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
