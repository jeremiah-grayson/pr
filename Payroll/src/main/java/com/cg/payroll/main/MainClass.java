package com.cg.payroll.main;

import com.cg.payroll.dto.BankDetails;
import com.cg.payroll.dto.Employee;
import com.cg.payroll.dto.Salary;
import com.cg.payroll.exceptions.EmployeeDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImple;

public class MainClass 
{
    public static void main(String []args)
    {
        try {
			PayrollServices ps=new PayrollServicesImple();
			Employee emp1=new Employee(123545,4000,15000,"j","gk","fs","sa", "eplb","gk@123");
			int EmployeeID= PayrollServices.acceptEmployeeDetails();
			System.out.println(emp1.getEmployeeID());
			Employee emp1= PayrollServices.getEmployeeDetails(emp1);
			System.out.println(emp1);
		} 
        catch (EmployeeDetailsNotFoundException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //System.out.println(emp.getEmployeeID()+" "+emp.getFirstName()+" "+emp.getLastName()+" "+emp.getDepartment()+" "+emp.getDesignation());
       // Salary sal=new Salary(17000,3000,2000,4000,1500,100,50,1500,1500);
       // System.out.println(sal.getBasicSalary()+" "+sal.getConveyenceAllowance()+" "+sal.getCpf()+" "+sal.getEpf()+" "+sal.getHra());
      //  BankDetails bd=new BankDetails(987654,"idfcbank","idfc");
       // System.out.println(bd.getAccountNumber()+" "+bd.getBankName()+" "+bd.getIfscCode());
       // Employee emp1=new Employee(1234,5000,15000,"Jeremiah","Grayson","fs","sa","eqll","gk@123");
       // System.out.println(emp1.getEmployeeID()+" "+emp1.getFirstName()+" "+emp1.getLastName()+" "+emp1.getDepartment()+" "+emp1.getDesignation());
    
    }
}
 