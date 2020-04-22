package com.cg.payroll.util;

import java.util.HashMap;

import com.cg.payroll.dto.Employee;

public class PayrollUtil {
	public static int EMPLOYEE_ID_COUNTER=200;
	public static HashMap<Integer, Employee>employees= new HashMap<>();
	public static int getEmployee_ID_COUNTER() 
	{
		return ++EMPLOYEE_ID_COUNTER;
	}
}
