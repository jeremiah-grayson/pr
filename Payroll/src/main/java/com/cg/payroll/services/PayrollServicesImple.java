package com.cg.payroll.services;

import com.cg.payroll.dto.Employee;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payrolldao.services.EmployeeDAO;
import com.cg.payrolldao.services.EmployeeDAOImple;
import com.cg.services.ServiceProvider;

public abstract class PayrollServicesImple implements PayrollServices
{
	private EmployeeDAO employeedao;
	public PayrollServicesImple() throws PayrollServicesDownException
	{
		employeedao=ServiceProvider.getEmployeeDAOImple();
	}
	public int acceptEmployeeDetails(Employee emp1)
	{
		emp1=employeedao.save(emp1);
		return emp1.getEmployeeID();
	}
}
