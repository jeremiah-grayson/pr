package com.cg.payroll.main;

import com.cg.payroll.dto.BankDetails;
import com.cg.payroll.dto.Employee;
import com.cg.payroll.dto.Salary;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImple;

public class MainClass {

	public static void main(String[] args) 
	{
		
			PayrollServices payrollServices= new PayrollServicesImple();
			Employee emp = new Employee(300,15000,"Bruce","Wayne","Software Associate","Financial Services","57wffw5","bw123@gmail.com",Salary(10000,100,200),BankDetails(10000,"jdhdla","ncdjbs2k"));
			System.out.println(emp);
			int employeeId=payrollServices.acceptEmployeeDetails(new Employee());
			System.out.println("Employee Id:- "+employeeId);
			Employee employee = payrollServices.getEmployeeDetails(employeeId);
			System.out.println(employee);
		

	}

	private static BankDetails BankDetails(int i, String string, String string2) {
		
		return null;
	}

	private static Salary Salary(int i, int j, int k) {
		
		return null;
	}

} 
