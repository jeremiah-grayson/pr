package com.cg.payroll.dto;

public class Employee {
	private int employeeID,yearlyTnvestmentUnder80C;
	private String firstName, lastName, department, designation,pancard,emailid;
	private Salary salary;
	private BankDetails bank;
	public Employee() 
	{
		
	}
	public Employee(int employeeID, int yearlyTnvestmentUnder80C, String firstName, String lastName, String department,
			String designation, String pancard, String emailid, Salary salary, BankDetails bank) 
	{
		super();
		this.employeeID = employeeID;
		this.yearlyTnvestmentUnder80C = yearlyTnvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailid = emailid;
		this.salary = salary;
		this.bank = bank;
	}
	public int getEmployeeID() 
	{
		return employeeID;
	}
	public void setEmployeeID(int employeeID) 
	{
		this.employeeID = employeeID;
	}
	public int getYearlyTnvestmentUnder80C() 
	{
		return yearlyTnvestmentUnder80C;
	}
	public void setYearlyTnvestmentUnder80C(int yearlyTnvestmentUnder80C) 
	{
		this.yearlyTnvestmentUnder80C = yearlyTnvestmentUnder80C;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}
	public String getDesignation() 
	{
		return designation;
	}
	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	public String getPancard()
	{
		return pancard;
	}
	public void setPancard(String pancard)
	{
		this.pancard = pancard;
	}
	public String getEmailid() 
	{
		return emailid;
	}
	public void setEmailid(String emailid) 
	{
		this.emailid = emailid;
	}
	public Salary getSalary() 
	{
		return salary;
	}
	public void setSalary(Salary salary)
	{
		this.salary = salary;
	}
	public BankDetails getBank() 
	{
		return bank;
	}
	public void setBank(BankDetails bank) 
	{
		this.bank = bank;
	}
	
}
