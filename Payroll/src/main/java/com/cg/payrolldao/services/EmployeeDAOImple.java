package com.cg.payrolldao.services;

import com.cg.payroll.dto.Employee;
import com.cg.payroll.util.PayrollUtil;

public abstract class EmployeeDAOImple implements EmployeeDAO
{
	public Employee save(Employee emp1)
	{
		emp1.setEmployeeID(PayrollUtil.getEMPLOYEE_ID_COUNTER());
		PayrollUtil.util.put(emp1.getEmployeeID(),emp1);
		return emp1;
	}
}
